package com.edusystem.mapper;

import com.edusystem.entity.Sysadmin;
import com.edusystem.entity.SysadminExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysadminMapper {
    long countByExample(SysadminExample example);

    int deleteByExample(SysadminExample example);

    int deleteByPrimaryKey(String sysadminId);

    int insert(Sysadmin record);

    int insertSelective(Sysadmin record);

    List<Sysadmin> selectByExample(SysadminExample example);

    Sysadmin selectByPrimaryKey(String sysadminId);

    int updateByExampleSelective(@Param("record") Sysadmin record, @Param("example") SysadminExample example);

    int updateByExample(@Param("record") Sysadmin record, @Param("example") SysadminExample example);

    int updateByPrimaryKeySelective(Sysadmin record);

    int updateByPrimaryKey(Sysadmin record);
}