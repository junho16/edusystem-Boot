package com.edusystem.service.Impl;

import com.alibaba.fastjson.JSONObject;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.edusystem.dto.UserDto;
import com.edusystem.entity.*;
import com.edusystem.mapper.*;
import com.edusystem.service.UserService;
import com.edusystem.util.DateUtil;
import com.edusystem.util.JWTUtils;
import com.edusystem.util.PageUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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

    @Autowired
    CollegeMapper collegeMapper;
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


    public UserDto getUserInfoWithId(String userid){
        UserDto res = new UserDto();
        Student s = studentMapper.selectByPrimaryKey(userid);
        if(s != null){
            res.setUserName(s.getStudentName());
            res.setUserPic(s.getStudentPic());
            res.setUserRole("学生");
            return res;
        }
        Teacher t = teacherMapper.selectByPrimaryKey(userid);
        if(t != null){
            res.setUserName(t.getTeacherName());
            res.setUserPic(t.getTeacherPic());
            res.setUserRole("教师");
            return res;
        }
        Sysadmin sysadmin = sysadminMapper.selectByPrimaryKey(userid);
        if(sysadmin != null){
            res.setUserName("admin");
//            res.setUserPic("https://images.nowcoder.com/head/614m.png");
            res.setUserPic("https://images.nowcoder.com/head/614m.png");
            res.setUserRole("管理员");
            return res;
        }
        SuperAdmin superAdmin = superAdminMapper.selectByPrimaryKey(userid);
        if(superAdmin != null){
            res.setUserName("admin");
//            res.setUserPic("https://images.nowcoder.com/head/615m.png");
            res.setUserPic("http://m.qpic.cn/psc?/V545Fi2B3ZX6uf2jmOrM0jJkaz4OqBvd/45NBuzDIW489QBoVep5mcaEzML4W10cXI0txc7zRavExYZcWgWWOv3heLZYyB8DjuODr2MeCNJKWw8iqdy6O3mvJ60PPUwp5Pt8NmIzkz9w!/b&bo=LAEsAQAAAAABFzA!&rf=viewer_4?imageView2/1/w/80/h/80");
            res.setUserRole("学校管理员");
            return res;
        }
        res.setUserName("未知角色");
        res.setUserPic("https://images.nowcoder.com/head/616m.png");
        res.setUserRole("未知角色");
        return res;

    }

    @Override
    public HashMap getAdminList(String userid) {
        HashMap<Integer,Object> res = new HashMap<>();
        try{
            SysadminExample sysadminExample = new SysadminExample();
            SysadminExample.Criteria criteria  = sysadminExample.createCriteria();
            criteria.andCollegeIdIsNotNull();
            List<Sysadmin> list = sysadminMapper.selectByExample(sysadminExample);
            for(Sysadmin n : list){
                College c = collegeMapper.selectByPrimaryKey(n.getCollegeId());
                n.setCollegeName(c.getCollegeName());
            }
            HashMap resData = new HashMap();
            resData.put("data" , list);
            res.put(20000,resData);
        }catch (Exception e){
            e.printStackTrace();
            res.put(18000,"查询以户可见的留言信息！服务器内部错误！");
            return res;
        }
        return res;
    }


}
