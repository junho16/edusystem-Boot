package com.edusystem.mapper;

import com.edusystem.entity.Teachtask;
import com.edusystem.entity.TeachtaskExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeachtaskMapper {
    long countByExample(TeachtaskExample example);

    int deleteByExample(TeachtaskExample example);

    int deleteByPrimaryKey(String teachtaskId);

    int insert(Teachtask record);

    int insertSelective(Teachtask record);

    List<Teachtask> selectByExample(TeachtaskExample example);

    Teachtask selectByPrimaryKey(String teachtaskId);

    int updateByExampleSelective(@Param("record") Teachtask record, @Param("example") TeachtaskExample example);

    int updateByExample(@Param("record") Teachtask record, @Param("example") TeachtaskExample example);

    int updateByPrimaryKeySelective(Teachtask record);

    int updateByPrimaryKey(Teachtask record);
}