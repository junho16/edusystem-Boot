package com.edusystem.mapper;

import com.edusystem.entity.Byqx;
import com.edusystem.entity.ByqxExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ByqxMapper {
    long countByExample(ByqxExample example);

    int deleteByExample(ByqxExample example);

    int deleteByPrimaryKey(Integer byqxId);

    int insert(Byqx record);

    int insertSelective(Byqx record);

    List<Byqx> selectByExample(ByqxExample example);

    Byqx selectByPrimaryKey(Integer byqxId);

    int updateByExampleSelective(@Param("record") Byqx record, @Param("example") ByqxExample example);

    int updateByExample(@Param("record") Byqx record, @Param("example") ByqxExample example);

    int updateByPrimaryKeySelective(Byqx record);

    int updateByPrimaryKey(Byqx record);
}