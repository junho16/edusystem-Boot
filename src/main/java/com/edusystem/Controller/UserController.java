package com.edusystem.Controller;

import com.edusystem.entity.Response.MyResponse;
import com.edusystem.service.Impl.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

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
