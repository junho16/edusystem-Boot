package com.edusystem.dto;

/**
 * @author 花菜
 * @date 2021/4/28 9:55
 */
public class UserDto {
    private String UserName;
    private String UserRole;
    private String UserPic;

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserRole() {
        return UserRole;
    }

    public void setUserRole(String userRole) {
        UserRole = userRole;
    }

    public String getUserPic() {
        return UserPic;
    }

    public void setUserPic(String userPic) {
        UserPic = userPic;
    }
}
