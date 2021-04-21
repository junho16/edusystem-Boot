package com.edusystem.mapper;


import com.edusystem.entity.Xxkc;
import com.edusystem.entity.XxkcExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XxkcMapper {
    long countByExample(XxkcExample example);

    int deleteByExample(XxkcExample example);

    int deleteByPrimaryKey(String xxkcId);

    int insert(Xxkc record);

    int insertSelective(Xxkc record);

    List<Xxkc> selectByExample(XxkcExample example);

    Xxkc selectByPrimaryKey(String xxkcId);

    int updateByExampleSelective(@Param("record") Xxkc record, @Param("example") XxkcExample example);

    int updateByExample(@Param("record") Xxkc record, @Param("example") XxkcExample example);

    int updateByPrimaryKeySelective(Xxkc record);

    int updateByPrimaryKey(Xxkc record);
}