package com.edusystem.service;

import com.edusystem.dto.UserDto;

import java.util.HashMap;

/**
 * @author 花菜
 * @date 2021/4/3 15:54
 */
public interface UserService {
    public HashMap getUserInfo(String token);
    public UserDto getUserInfoWithId(String userid);

    public HashMap getAdminList( String userid);
    public HashMap getUserInfoToShow(String token );
}
