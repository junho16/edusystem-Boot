package com.edusystem.mapper;

import com.edusystem.entity.Clsandstu;
import com.edusystem.entity.ClsandstuExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClsandstuMapper {
    long countByExample(ClsandstuExample example);

    int deleteByExample(ClsandstuExample example);

    int deleteByPrimaryKey(String clsandstuId);

    int insert(Clsandstu record);

    int insertSelective(Clsandstu record);

    List<Clsandstu> selectByExample(ClsandstuExample example);

    Clsandstu selectByPrimaryKey(String clsandstuId);

    int updateByExampleSelective(@Param("record") Clsandstu record, @Param("example") ClsandstuExample example);

    int updateByExample(@Param("record") Clsandstu record, @Param("example") ClsandstuExample example);

    int updateByPrimaryKeySelective(Clsandstu record);

    int updateByPrimaryKey(Clsandstu record);
}