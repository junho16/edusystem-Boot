package com.edusystem.Controller;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.edusystem.entity.Response.MyResponse;
import com.edusystem.service.Impl.UserServiceImpl;
import com.edusystem.util.JWTUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 花菜
 * @date 2021/4/2 18:06
 */
@Slf4j
@RestController
//@RequestMapping("")
public class UserController {

    @Autowired
    UserServiceImpl userService;

    /**
     * 获取用户信息
     *{
     * 	"code": 20000,
     * 	"data": {
     * 		"roles": ["admin"],
     * 		"introduction": "I am a super administrator",
     * 		"avatar": "https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif",
     * 		"name": "Super Admin"
     *   }
     * }
     */
    @PostMapping("/user/info")
    @ResponseBody
    public MyResponse getUserInfo(@RequestParam String token) {
        MyResponse response;
        HashMap hashMap = userService.getUserInfo(token);
        if(hashMap != null){
            response = new MyResponse(MyResponse.SUCCESS_CODE , hashMap);
        }else{
            response = new MyResponse(MyResponse.Fail_CODE ,"未获取到用户信息" , null);
        }
        return response;
    }




    /**
     * 获取有哪些学院管理员
     */
    @GetMapping("/user/admin/list")
    @ResponseBody
    public MyResponse getAdminList( HttpServletRequest request ) {
        log.info("方法：获取有哪些学院管理员。当前token为{}", request.getHeader("token"));
        MyResponse result;
        DecodedJWT verify = JWTUtils.verify(request.getHeader("token"));
        String username = verify.getClaim("username").asString();

        HashMap res = userService.getAdminList( username);
        String flag = (String) res.get(18000);
        result = flag == null ?
                new MyResponse(MyResponse.SUCCESS_CODE, res.get(20000)) :
                new MyResponse(MyResponse.Fail_CODE, (String) res.get(18000), null);

        return result;
    }
//    jwt的使用如下=》在token中获取其中的信息
//    @PostMapping("/user/test")
//    public Map<String, Object> test(HttpServletRequest request) {
//        String token = request.getHeader("token");
//        DecodedJWT verify = JWTUtils.verify(token);
//        String id = verify.getClaim("id").asString();
//        String name = verify.getClaim("name").asString();
//        log.info("用户id：{}", id);
//        log.info("用户名: {}", name);
//        业务逻辑
//        Map<String, Object> map = new HashMap<>();
//        map.put("state", true);
//        map.put("msg", "请求成功");
//        return map;
//    }

}
