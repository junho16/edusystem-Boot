package com.edusystem.mapper;

import com.edusystem.entity.Tk;
import com.edusystem.entity.TkExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TkMapper {
    long countByExample(TkExample example);

    int deleteByExample(TkExample example);

    int deleteByPrimaryKey(String tkId);

    int insert(Tk record);

    int insertSelective(Tk record);

    List<Tk> selectByExample(TkExample example);

    Tk selectByPrimaryKey(String tkId);

    int updateByExampleSelective(@Param("record") Tk record, @Param("example") TkExample example);

    int updateByExample(@Param("record") Tk record, @Param("example") TkExample example);

    int updateByPrimaryKeySelective(Tk record);

    int updateByPrimaryKey(Tk record);
}