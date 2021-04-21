package com.edusystem.util;

/**
 * 自定义工具类
 * @author 花菜
 * @date 2021/4/3 2:33
 */
public class MyUtil {
    /**
     * 根据角色名获取其角色代码--eg：便于查询这些角色的路由信息
     * 0:超级管理员  1:学院管理员  2:教师  3:学生
     * @param role
     * @return
     */
    public static int getRoleId(String role){
        switch (role){
            case "superadmin":{
                return 0;
            }
            case "admin":{
                return 1;
            }
            case "teacher":{
                return 2;
            }
            case "student":{
                return 3;
            }
            default:
                throw new IllegalStateException("Unexpected value: has not break" );
        }
    }
}
