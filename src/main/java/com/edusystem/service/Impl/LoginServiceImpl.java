package com.edusystem.service.Impl;

import com.edusystem.entity.Student;
import com.edusystem.entity.SuperAdmin;
import com.edusystem.entity.Sysadmin;
import com.edusystem.entity.Teacher;
import com.edusystem.mapper.StudentMapper;
import com.edusystem.mapper.SuperAdminMapper;
import com.edusystem.mapper.SysadminMapper;
import com.edusystem.mapper.TeacherMapper;
import com.edusystem.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 花菜
 * @date 2021/4/1 22:38
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    TeacherMapper teacherMapper;

    @Autowired
    StudentMapper studentMapper;

    @Autowired
    SysadminMapper sysadminMapper;

    @Autowired
    SuperAdminMapper superAdminMapper;

    @Override
    public boolean login(String username, String password, String loginrole) {
        switch (loginrole){
            case "teacher":{
                Teacher teacher = teacherMapper.selectByPrimaryKey(username);
                if(teacher==null)return false;
                return (teacher.getTeacherPsd().equals(password))?true:false;
            }
            case "admin":{
                Sysadmin sysadmin = sysadminMapper.selectByPrimaryKey(username);
                if(sysadmin==null)return false;
                return (sysadmin.getSysadminPsd().equals(password))?true:false;
            }
            case "student":{
                Student student = studentMapper.selectByPrimaryKey(username);
                if(student==null)return false;
                return (student.getStudentPsd().equals(password))?true:false;
            }
            case "superadmin":{
                SuperAdmin superAdmin = superAdminMapper.selectByPrimaryKey(username);
                if(superAdmin==null)return false;
                return (superAdmin.getSuperadminPsd().equals(password))?true:false;
            }
        }
        return false;
    }
}
