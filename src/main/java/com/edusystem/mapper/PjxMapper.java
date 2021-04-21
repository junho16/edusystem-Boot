package com.edusystem.mapper;

import com.edusystem.entity.Pjx;
import com.edusystem.entity.PjxExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PjxMapper {
    long countByExample(PjxExample example);

    int deleteByExample(PjxExample example);

    int deleteByPrimaryKey(String pjxId);

    int insert(Pjx record);

    int insertSelective(Pjx record);

    List<Pjx> selectByExample(PjxExample example);

    Pjx selectByPrimaryKey(String pjxId);

    int updateByExampleSelective(@Param("record") Pjx record, @Param("example") PjxExample example);

    int updateByExample(@Param("record") Pjx record, @Param("example") PjxExample example);

    int updateByPrimaryKeySelective(Pjx record);

    int updateByPrimaryKey(Pjx record);
}