package com.edusystem.mapper;

import com.edusystem.entity.SystemRoleMenu;
import com.edusystem.entity.SystemRoleMenuExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

//@Mapper
//@Repository
public interface SystemRoleMenuMapper {
    long countByExample(SystemRoleMenuExample example);

    int deleteByExample(SystemRoleMenuExample example);

    int deleteByPrimaryKey(String id);

    int insert(SystemRoleMenu record);

    int insertSelective(SystemRoleMenu record);

    List<SystemRoleMenu> selectByExample(SystemRoleMenuExample example);

    SystemRoleMenu selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SystemRoleMenu record, @Param("example") SystemRoleMenuExample example);

    int updateByExample(@Param("record") SystemRoleMenu record, @Param("example") SystemRoleMenuExample example);

    int updateByPrimaryKeySelective(SystemRoleMenu record);

    int updateByPrimaryKey(SystemRoleMenu record);
}