package com.edusystem.Controller;

/**
 * @author 花菜
 * @date 2021/4/27 23:24
 */
import com.auth0.jwt.interfaces.DecodedJWT;
import com.edusystem.entity.Response.MyResponse;
import com.edusystem.service.NoticeService;
import com.edusystem.util.JWTUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("notice")
public class NoticeController {


    @Autowired
    NoticeService noticeService;

    /**
     * 获取用户自己的收到的留言数据
     * @param request
     * @param data
     * @return
     */
    @GetMapping("/list")
    @ResponseBody
    public MyResponse getNoticeList(
            HttpServletRequest request,
            @RequestParam Map data) {
        log.info("方法：根据条件获取其收到的留言数据。当前token为{}", request.getHeader("token"));
        MyResponse result;
        DecodedJWT verify = JWTUtils.verify(request.getHeader("token"));
        String username = verify.getClaim("username").asString();

        HashMap res = noticeService.getNoticeList(data, username);
        String flag = (String) res.get(18000);
        result = flag == null ?
                new MyResponse(MyResponse.SUCCESS_CODE, res.get(20000)) :
                new MyResponse(MyResponse.Fail_CODE, (String) res.get(18000), null);
        return result;
    }
    /**
     * 获取用户自己的发送的留言数据
     * @param request
     * @param data
     * @return
     */
    @GetMapping("/mysendlist")
    @ResponseBody
    public MyResponse getMySendNoticeList(
            HttpServletRequest request,
            @RequestParam Map data) {
        log.info("方法：根据条件获取其发送的留言数据。当前token为{}", request.getHeader("token"));
        MyResponse result;
        DecodedJWT verify = JWTUtils.verify(request.getHeader("token"));
        String username = verify.getClaim("username").asString();

        HashMap res = noticeService.getMySendNoticeList(data, username);
        String flag = (String) res.get(18000);
        result = flag == null ?
                new MyResponse(MyResponse.SUCCESS_CODE, res.get(20000)) :
                new MyResponse(MyResponse.Fail_CODE, (String) res.get(18000), null);
        return result;
    }


    @PostMapping("/create")
    @ResponseBody
    public MyResponse createNoticeInfo(
            HttpServletRequest request,
            @RequestParam Map data) {
        log.info("方法：创建留言记录。当前token为{}", request.getHeader("token"));
        MyResponse result;
        HashMap res = noticeService.createNoticeInfo(data, request.getHeader("token"));
        String flag = (String) res.get(20000);
        result = flag != null ?
                new MyResponse(MyResponse.SUCCESS_CODE, (String) res.get(20000)) :
                new MyResponse(MyResponse.Fail_CODE, (String) res.get(18000));
        return result;
    }


    /**
     * 回复 与创建记录的区别就是多了hf字段 将title 和 content 改一下并加入pid
     * @param request
     * @param data
     * @return
     */
    @PostMapping("/comment")
    @ResponseBody
    public MyResponse createNoticeCommentInfo(
            HttpServletRequest request,
            @RequestParam Map data) {
        log.info("方法：创建留言的回复记录。当前token为{}", request.getHeader("token"));
        MyResponse result;
        HashMap res = noticeService.createNoticeCommentInfo(data, request.getHeader("token"));
        String flag = (String) res.get(20000);
        result = flag != null ?
                new MyResponse(MyResponse.SUCCESS_CODE, (String) res.get(20000)) :
                new MyResponse(MyResponse.Fail_CODE, (String) res.get(18000));
        return result;
    }

    /**
     * 修改留言查看状态
     * @param request
     * @return
     */
    @PostMapping("/state")
    @ResponseBody
    public MyResponse updateNoticeState(
            HttpServletRequest request,
            @RequestParam String noticeid ,@RequestParam int state) {
        log.info("方法：修改留言的查看状态。当前token为{}", request.getHeader("token"));
        MyResponse result;
        HashMap res = noticeService.updateNoticeState(noticeid, state);
        String flag = (String) res.get(20000);
        result = flag != null ?
                new MyResponse(MyResponse.SUCCESS_CODE, (String) res.get(20000)) :
                new MyResponse(MyResponse.Fail_CODE, (String) res.get(18000));
        return result;
    }

}
