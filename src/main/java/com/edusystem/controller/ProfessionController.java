package com.edusystem.controller;

import com.edusystem.entity.College;
import com.edusystem.entity.Response.MyResponse;
import com.edusystem.service.Impl.ProfessionServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * @author 花菜
 * @date 2021/4/16 19:39
 */
@Slf4j
@RestController
@RequestMapping("profession")
public class ProfessionController {

    @Autowired
    ProfessionServiceImpl professionService;

    /**
     * 获取该角色可以查看的专业列表
     * 前端需要的格式如下：
     * （此接口只返回专业列表==>map数组 map里是专业id、专业名、所属学院id、此专业有哪些班级，前端对参数再处理）
     * options: [{
     * 	value: 'zhinan',
     * 	label: '指南',
     * 	children: [{
     * 		value: 'shejiyuanze',
     * 		label: '设计原则',
     * 		children: [{
     * 			value: 'yizhi',
     * 			label: '一致'
     *                }, {
     * 			value: 'fankui',
     * 			label: '反馈'
     *      }]
     *   }]
     * }]
     * @param token
     * @param token
     * @return
     */
    @GetMapping("/list")
    @ResponseBody
    public MyResponse professionList(@RequestParam String token) {

        log.info("方法：获取专业列表。当前用户token为{}",token);

        MyResponse result;
        try{
            ArrayList<College> res = professionService.fetchProfessionList(token);
            result = new MyResponse(MyResponse.SUCCESS_CODE,"success!",res);
        }catch (Exception e){
            log.error("方法：获取专业列表失败。内部错误");
            result = new MyResponse(MyResponse.Fail_CODE,"方法：获取专业列表失败。内部错误");
        }
        return result;
    }


}
