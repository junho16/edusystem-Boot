package com.edusystem.mapper;

import com.edusystem.entity.SuperAdmin;
import com.edusystem.entity.SuperAdminExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SuperAdminMapper {
    long countByExample(SuperAdminExample example);

    int deleteByExample(SuperAdminExample example);

    int deleteByPrimaryKey(String superadminId);

    int insert(SuperAdmin record);

    int insertSelective(SuperAdmin record);

    List<SuperAdmin> selectByExample(SuperAdminExample example);

    SuperAdmin selectByPrimaryKey(String superadminId);

    int updateByExampleSelective(@Param("record") SuperAdmin record, @Param("example") SuperAdminExample example);

    int updateByExample(@Param("record") SuperAdmin record, @Param("example") SuperAdminExample example);

    int updateByPrimaryKeySelective(SuperAdmin record);

    int updateByPrimaryKey(SuperAdmin record);
}