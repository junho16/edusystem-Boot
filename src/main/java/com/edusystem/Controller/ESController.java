package com.edusystem.Controller;

import com.edusystem.entity.College;
import com.edusystem.entity.Response.MyResponse;
import com.edusystem.service.Impl.ESServiceImpl;
import com.edusystem.service.ProfessionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 花菜
 * @date 2021/4/22 22:27
 */
@Slf4j
@RestController
@RequestMapping("es")
public class ESController {

    @Autowired
    ESServiceImpl esService;

    @GetMapping("/es_getcourse")
    @ResponseBody
    public MyResponse es_getcourse(
            HttpServletRequest request,@RequestParam Map data
            ) {

        log.info("方法：获取es引擎搜索内容。当前用户token为{}",  request.getHeader("token"));
        log.info("方法：获取es引擎搜索内容。当前data为{}",  request.getHeader("keyword"));
        MyResponse result;
        try {
            HashMap res = esService.es_getcourse( data, (String)request.getHeader("token"));


            result = res.get(20000) != null ?
                new MyResponse(MyResponse.SUCCESS_CODE, "请求成功!", res.get(20000)) :
                new MyResponse(MyResponse.Fail_CODE, (String)res.get(18000),"方法：获取es引擎搜索内容。内部错误");
        } catch (Exception e) {
            e.printStackTrace();
            log.error("方法：获取es引擎搜索内容。内部错误");
            result = new MyResponse(MyResponse.Fail_CODE, "方法：获取es引擎搜索内容。内部错误","方法：获取es引擎搜索内容。内部错误");
        }
        return result;
    }
}

