package com.edusystem.Controller;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.edusystem.entity.Response.MyResponse;
import com.edusystem.util.JWTUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 花菜
 * @date 2021/4/30 9:46
 */
@Slf4j
@RestController
@RequestMapping("tip")
public class TipController {
    TipService tipService;
    /**
     * 获取tip数据
     * @param request
     * @param data
     * @return
     */
    @GetMapping("/list")
    @ResponseBody
    public MyResponse getTipList(
            HttpServletRequest request,
            @RequestParam Map data) {
        log.info("方法：根据条件获取通知数据。当前token为{}", request.getHeader("token"));
        MyResponse result;
        DecodedJWT verify = JWTUtils.verify(request.getHeader("token"));
        String username = verify.getClaim("username").asString();

        HashMap res = tipService.getTipList(data, username);
        String flag = (String) res.get(18000);
        result = flag == null ?
                new MyResponse(MyResponse.SUCCESS_CODE, res.get(20000)) :
                new MyResponse(MyResponse.Fail_CODE, (String) res.get(18000), null);
        return result;
    }
}
