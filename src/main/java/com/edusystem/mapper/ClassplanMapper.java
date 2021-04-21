package com.edusystem.mapper;

import com.edusystem.entity.Classplan;
import com.edusystem.entity.ClassplanExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClassplanMapper {
    long countByExample(ClassplanExample example);

    int deleteByExample(ClassplanExample example);

    int deleteByPrimaryKey(String classplanId);

    int insert(Classplan record);

    int insertSelective(Classplan record);

    List<Classplan> selectByExample(ClassplanExample example);

    Classplan selectByPrimaryKey(String classplanId);

    int updateByExampleSelective(@Param("record") Classplan record, @Param("example") ClassplanExample example);

    int updateByExample(@Param("record") Classplan record, @Param("example") ClassplanExample example);

    int updateByPrimaryKeySelective(Classplan record);

    int updateByPrimaryKey(Classplan record);
}