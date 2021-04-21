package com.edusystem.service.Impl;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.edusystem.entity.Student;
import com.edusystem.entity.Teacher;
import com.edusystem.mapper.StudentMapper;
import com.edusystem.mapper.SuperAdminMapper;
import com.edusystem.mapper.SysadminMapper;
import com.edusystem.mapper.TeacherMapper;
import com.edusystem.service.UserService;
import com.edusystem.util.JWTUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author 花菜
 * @date 2021/4/2 18:48
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    TeacherMapper teacherMapper;

    @Autowired
    StudentMapper studentMapper;

    @Autowired
    SysadminMapper sysadminMapper;

    @Autowired
    SuperAdminMapper superAdminMapper;
    /**
     * 返回值如下示例
     * "roles": ["admin"],
     * "introduction": "I am a super administrator",
     * "avatar": "https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif",
     * "name": "Super Admin"
     *
     * @param token
     * @return
     */
    @Override
    public HashMap getUserInfo(String token) {
        log.info("方法：获取用户信息。==》token为{}", token);
        DecodedJWT verify = JWTUtils.verify(token);
        String username = verify.getClaim("username").asString();
        String loginrole = verify.getClaim("loginrole").asString();
        log.info("获取用户信息==》账号: userId=>{}", username);
        log.info("获取用户信息==》角色: userrole=>{}", loginrole);
        HashMap hashMap = new HashMap();
        ArrayList arr = new ArrayList<>();
        arr.add(loginrole);
        hashMap.put("roles",arr);
        hashMap.put("introduction","我是"+loginrole);
        hashMap.put("userid",username);
        String avatar ;
        String name ;
        switch (loginrole){
            case "teacher":{
                Teacher teacher = teacherMapper.selectByPrimaryKey(username);
                avatar = teacher.getTeacherPic();
                name = teacher.getTeacherName();
                break;
            }
            case "admin":{
                avatar = "http://m.qpic.cn/psc?/V545Fi2B3ZX6uf2jmOrM0jJkaz4OqBvd/45NBuzDIW489QBoVep5mcdFxf.B*O85st7QQII.snPt16.BlVhzvn.KLqgFGFYEE*S5pNPLEHD.YR0NtZhZn3EWQI*8aBzZ8l9BqlrdDKbs!/b&bo=IAMgAwAAAAABFzA!&rf=viewer_4";
                name =  "学院管理员";
                break;
            }
            case "student":{
                Student student = studentMapper.selectByPrimaryKey(username);
                avatar = student.getStudentPic();
                name = student.getStudentName();
                break;
            }
            case "superadmin":{
                avatar = "http://m.qpic.cn/psc?/V545Fi2B3ZX6uf2jmOrM0jJkaz4OqBvd/45NBuzDIW489QBoVep5mcaEzML4W10cXI0txc7zRavExYZcWgWWOv3heLZYyB8DjuODr2MeCNJKWw8iqdy6O3mvJ60PPUwp5Pt8NmIzkz9w!/b&bo=LAEsAQAAAAABFzA!&rf=viewer_4";
                name = "超级管理员";
                break;
            }
            default:
                throw new IllegalStateException("Unexpected value: " + loginrole);
        }
        hashMap.put("avatar",avatar);
        hashMap.put("name",name);
        return hashMap;
    }


}
