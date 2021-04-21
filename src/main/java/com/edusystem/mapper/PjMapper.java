package com.edusystem.mapper;

import com.edusystem.entity.Pj;
import com.edusystem.entity.PjExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PjMapper {
    long countByExample(PjExample example);

    int deleteByExample(PjExample example);

    int deleteByPrimaryKey(String pjId);

    int insert(Pj record);

    int insertSelective(Pj record);

    List<Pj> selectByExample(PjExample example);

    Pj selectByPrimaryKey(String pjId);

    int updateByExampleSelective(@Param("record") Pj record, @Param("example") PjExample example);

    int updateByExample(@Param("record") Pj record, @Param("example") PjExample example);

    int updateByPrimaryKeySelective(Pj record);

    int updateByPrimaryKey(Pj record);
}