package com.edusystem.controller;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.edusystem.entity.Response.MyResponse;
import com.edusystem.service.Impl.TkServiceImpl;
import com.edusystem.util.JWTUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author 花菜
 * @date 2021/4/23 20:36
 */
@Slf4j
@RestController
@RequestMapping("tk")
public class TkController {

    @Autowired
    TkServiceImpl tkService;

    @Value("${gorit.file.root.path}")
    private String filePath;

    @PostMapping("/upload")
    @ResponseBody
    public MyResponse upload(
            HttpServletRequest request,
            @RequestParam("file") MultipartFile file) throws IOException {
        MyResponse result = null;
        String tk_id = request.getHeader("tk_id");
//        String filePath = ResourceUtils.CLASSPATH_URL_PREFIX + "static/data";
//        String filePath = Thread.currentThread().getContextClassLoader().getResource("").getPath()+"static/data/";
//        System.out.println(filePath);==>E:/AAA_%e6%af%95%e8%ae%be/github%e5%8f%82%e8%80%83/edusystem2.0/edusystem/target/classes/static/data/

        // 设置固定的日期格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        // 得到格式化后的日期
        String format = sdf.format(new Date());
        // 获取上传的文件名称
        String fileName = file.getOriginalFilename();
        // 时间 和 日期拼接-->   tk_id_2021-01-12_XXX.jpg
        String newFileName = tk_id + "_" + format + "_" + fileName;
        // 得到文件保存的位置以及新文件名
        File dest = new File(filePath + newFileName);
        try {

            // 上传的文件被保存了
            file.transferTo(dest);
            // 打印日志
            log.info("上传成功，当前上传的文件保存在 {}", filePath + newFileName);
            // 自定义返回的统一的 JSON 格式的数据，可以直接返回这个字符串也是可以的。
            result = new MyResponse(MyResponse.SUCCESS_CODE, "上传文件成功!","上传文件成功!");
        } catch (IOException e) {
            log.error(e.toString());
        } catch (Exception e) {
            log.error("方法：获取教师列表。内部错误");
            result = new MyResponse(MyResponse.Fail_CODE, "上传文件错误！","上传文件错误！");
        }
        return result;
    }

    @GetMapping("/newtklist")
    @ResponseBody
    public MyResponse newtklist(
            HttpServletRequest request ) {

        log.info("方法：创建听课记录。当前token为{}", request.getHeader("token"));
        MyResponse result;
        HashMap res = tkService.newtklist(request.getHeader("token"));

        result = res.get(20000) != null ?
                new MyResponse(MyResponse.SUCCESS_CODE, "获取新的需要听课的教师信息成功" ,  res.get(20000)) :
                new MyResponse(MyResponse.Fail_CODE ,(String) res.get(18000) , null);
        return result;
    }

    /**
     * tk_id：XXX
     * tk_classes: Array(2)
     * 0: "172021"
     * 1: "17202113"
     * tk_content: "<p>123<img class="wscnph" src="data:image/jpeg;base64,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" />123123123</p>"
     * tk_content_short: "123"
     * tk_date: Sat Apr 24 2021 16:42:29 GMT+0800 (中国标准时间)
     * tk_jc: "1"
     * tk_rate: 8
     * tk_teachtaskid: "44cd79ee"
     * tk_title: "123"
     */
    @PostMapping("/create")
    @ResponseBody
    public MyResponse createTkRecord(
            HttpServletRequest request,
            @RequestParam Map data) {


        log.info("方法：创建听课记录。当前token为{}", request.getHeader("token"));
        MyResponse result;
        HashMap res = tkService.createTkRecord(data, request.getHeader("token"));
        String flag = (String) res.get(20000);
        result = flag != null ?
                new MyResponse(MyResponse.SUCCESS_CODE, (String) res.get(20000),(String) res.get(20000)) :
                new MyResponse(MyResponse.Fail_CODE, (String) res.get(18000),(String) res.get(18000));
        return result;
    }

    @PostMapping("/update")
    @ResponseBody
    public MyResponse updateTkRecord(
            HttpServletRequest request,
            @RequestParam Map data) {


        log.info("方法：更新听课记录。当前token为{}", request.getHeader("token"));
        MyResponse result;
        HashMap res = tkService.updateTkRecord(data, request.getHeader("token"));
        String flag = (String) res.get(20000);
        result = flag != null ?
                new MyResponse(MyResponse.SUCCESS_CODE, (String) res.get(20000),(String) res.get(20000)) :
                new MyResponse(MyResponse.Fail_CODE, (String) res.get(18000) ,(String) res.get(18000));
        return result;
    }


    /**
     * 获取echart数据
     *
     * @param request
     * @param data
     * @return
     */
    @GetMapping("/tkdata")
    @ResponseBody
    public MyResponse getTkDataWithChart(
            HttpServletRequest request,
            @RequestParam Map data) {
        log.info("方法：根据教师id获取其听课的echart数据。当前token为{}", request.getHeader("token"));
        MyResponse result;
        HashMap res = tkService.getTkDataWithChart(data);
        String flag = (String) res.get(18000);
        result = flag == null ?
                new MyResponse(MyResponse.SUCCESS_CODE,"请求成功！", res.get(20000)) :
                new MyResponse(MyResponse.Fail_CODE, (String) res.get(18000), null);
        return result;
    }

    /**
     * 获取table数据
     *
     * @param request
     * @param data
     * @return
     */
    @GetMapping("/tklist")
    @ResponseBody
    public MyResponse getTkDataWithTable(
            HttpServletRequest request,
            @RequestParam Map data) {
        log.info("方法：根据教师id获取其听课的table数据。当前token为{}", request.getHeader("token"));
        MyResponse result;
        DecodedJWT verify = JWTUtils.verify(request.getHeader("token"));
        String username = verify.getClaim("username").asString();


        HashMap res = tkService.getTkDataWithTable(data, username);
        String flag = (String) res.get(18000);
        result = flag == null ?
                new MyResponse(MyResponse.SUCCESS_CODE,"请求成功",res.get(20000)) :
                new MyResponse(MyResponse.Fail_CODE, (String) res.get(18000), null);
        return result;
    }

    /**
     * 获取管理员视角的手风琴数据
     *
     * @param request
     * @param data
     * @return
     */
    @GetMapping("/tklistwithadmin")
    @ResponseBody
    public MyResponse getTkDataWithAdmin(
            HttpServletRequest request,
            @RequestParam Map data) {
        log.info("方法：获取管理员视角的手风琴数据。当前token为{}", request.getHeader("token"));
        MyResponse result;

        HashMap res = tkService.getTkDataWithAdmin(data);
        String flag = (String) res.get(18000);
        result = flag == null ?
                new MyResponse(MyResponse.SUCCESS_CODE, res.get(20000)) :
                new MyResponse(MyResponse.Fail_CODE, (String) res.get(18000), null);
        return result;
    }

    /**
     * 获取听课详情
     *
     * @param request
     * @param id
     * @return
     */
    @GetMapping("/tkinfo")
    @ResponseBody
    public MyResponse fetchTkInfo(
            HttpServletRequest request,
            @RequestParam String id) {
        log.info("方法：根据听课id获取其听课的详情数据。当前token为{}", request.getHeader("token"));
        MyResponse result;
        DecodedJWT verify = JWTUtils.verify(request.getHeader("token"));
        String username = verify.getClaim("username").asString();


        HashMap res = tkService.fetchTkInfo(id);
        String flag = (String) res.get(18000);
        result = flag == null ?
                new MyResponse(MyResponse.SUCCESS_CODE, res.get(20000)) :
                new MyResponse(MyResponse.Fail_CODE, (String) res.get(18000), null);
        return result;
    }
}