package com.edusystem.mapper;

import com.edusystem.entity.Kq;
import com.edusystem.entity.KqExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface KqMapper {
    long countByExample(KqExample example);

    int deleteByExample(KqExample example);

    int deleteByPrimaryKey(String kqId);

    int insert(Kq record);

    int insertSelective(Kq record);

    List<Kq> selectByExample(KqExample example);

    Kq selectByPrimaryKey(String kqId);

    int updateByExampleSelective(@Param("record") Kq record, @Param("example") KqExample example);

    int updateByExample(@Param("record") Kq record, @Param("example") KqExample example);

    int updateByPrimaryKeySelective(Kq record);

    int updateByPrimaryKey(Kq record);
}