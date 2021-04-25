package com.edusystem.Controller;

import com.edusystem.entity.College;
import com.edusystem.entity.Response.MyResponse;
import com.edusystem.service.Impl.ESServiceImpl;
import com.edusystem.service.ProfessionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

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
    public MyResponse es_getcourse(@RequestParam String keyword , @RequestParam String token) {
        log.info("方法：获取es引擎搜索内容。当前用户token为{}", token);
        MyResponse result;
        try {
            ArrayList res = esService.es_getcourse(keyword);
            result = new MyResponse(MyResponse.SUCCESS_CODE, "success!", res);
        } catch (Exception e) {
            log.error("方法：获取es引擎搜索内容。内部错误");
            result = new MyResponse(MyResponse.Fail_CODE, "方法：获取es引擎搜索内容。内部错误");
        }
        return result;
    }
}

