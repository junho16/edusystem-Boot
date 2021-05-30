package com.edusystem.controller;

import com.alibaba.fastjson.JSONObject;
import com.edusystem.entity.Response.MyResponse;
import com.edusystem.service.Impl.XkServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 花菜
 * @date 2021/4/20 11:05
 */
@Slf4j
@RestController
@RequestMapping("xk")
public class XkController {

    @Autowired
    XkServiceImpl xkService;

    /**
     * 选课--选择网课或者 校内素质拓展课程
     * 由于数据库设计的问题-因此在存选课信息的时候 （存teachtaskid）
     * 如果是网课就存==》0-网课课程id
     * 如果是校内课程==》课程id
     * @param data
     * @param token
     * @return
     */
    @PostMapping("/selectxxkc")
    @ResponseBody
    public MyResponse selXXKC(@RequestParam String data, @RequestParam String token) {

        log.info("方法：学生选课(网课课程)。当前token为{}",token);
        log.info("方法：学生选课(网课课程)。当前网课课程id为{}",data);
        MyResponse result;
        HashMap res = xkService.selXXKC(data,token);
        String flag = (String) res.get(20000);
        result = flag!=null?
                new MyResponse(MyResponse.SUCCESS_CODE,(String) res.get(20000)):
                new MyResponse(MyResponse.Fail_CODE,(String) res.get(18000),null);
        return result;
    }

    /**
     * 暂时未使用此方法
     * 选课--选择校内课程
     * 由于数据库设计的问题-因此在存选课信息的时候 （存teachtaskid）
     * 如果是网课就存==》0-网课课程id
     * 如果是校内课程==》存teachtaskid
     * @param data
     * @param token
     * @return
     */
    @PostMapping("/create")
    @ResponseBody
    public MyResponse createXkInfo(@RequestParam String data, @RequestParam String token) {
        JSONObject stuCreateData = JSONObject.parseObject(data);
        log.info("方法：学生选课(校内课程)。当前token为{}",token);
        MyResponse result;
        HashMap res = xkService.createXkInfo(stuCreateData,token);
        String flag = (String) res.get(20000);
        result = flag!=null?
                new MyResponse(MyResponse.SUCCESS_CODE,(String) res.get(20000)):
                new MyResponse(MyResponse.Fail_CODE,(String) res.get(18000),(String) res.get(18000));
        return result;
    }


    /**
     * 获取选课数据--每个人选了哪些课程--为了以json的格式以树状图展示
     * 返回格式是 数组：teachtaskid（网课以 0- 开头） 课程名 学年
     * @param token
     * @return
     */
    @GetMapping("/treedata")
    @ResponseBody
    public MyResponse treedata(@RequestParam String token) {
        log.info("方法：获取学生选课数据。当前token为{}",token);
        MyResponse result;
        HashMap res = xkService.treedata(token);
        String flag = (String) res.get(18000);
        result = flag!=null?
                new MyResponse(MyResponse.Fail_CODE,(String) res.get(18000),(String) res.get(18000)):
                new MyResponse(MyResponse.SUCCESS_CODE,"success!", res.get(20000));

        return result;
    }

    /**
     * 获取选课数据--每个人选了哪些课程--以表格的形式展现出来
     * 此处返回校内与校外网课的课程
     *      * keyword: "123"
     *      * kinds: "1"
     *      * limit: 10
     *      * page: 1
     *      * sourse: "2"
     *      * teachtaskAcademicterm: 1
     *      * teachtaskAcademicyear: 2021
     *      * teachtaskEndtime: 1
     *      * teachtaskGradelimit: null
     *      * teachtaskStarttime: 1
     *
     *
     * @param token
     * @return
     */
    @GetMapping("/tabledata")
    @ResponseBody
    public MyResponse tabledata(@RequestParam Map query , @RequestParam String token) {
        log.info("方法：获取学生选课数据。当前token为{}",token);
        String mytoken = ((String) query.get("token"));
        log.info("方法：获取学生选课数据。==》当前请求token为{}",token);
        log.info("方法：获取学生选课数据。当前mytoken为{}", mytoken );
        log.info("方法：获取学生选课数据。当前query为{}", query );

        JSONObject queryObj = JSONObject.parseObject((String) query.get("query"));

        MyResponse result;
        try{
//            HashMap res = courseService.getCourseListWithRole((Integer)queryObj.get("page"),(Integer)queryObj.get("limit"),query,token);
            HashMap res = xkService.tabledata(query,mytoken);
            result = new MyResponse(MyResponse.SUCCESS_CODE,"success!",res.get(20000));
        }catch (Exception e){
            e.printStackTrace();
            result = new MyResponse(MyResponse.Fail_CODE,"获取学生选课数据。参数错误！或是缺失参数或后台接收参数错误！","获取学生选课数据。参数错误！或是缺失参数或后台接收参数错误！");
        }
        return result;
    }

}
