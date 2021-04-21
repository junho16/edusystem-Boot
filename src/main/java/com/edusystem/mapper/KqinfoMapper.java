package com.edusystem.mapper;

import com.edusystem.entity.Kqinfo;
import com.edusystem.entity.KqinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface KqinfoMapper {
    long countByExample(KqinfoExample example);

    int deleteByExample(KqinfoExample example);

    int deleteByPrimaryKey(String kqinfoId);

    int insert(Kqinfo record);

    int insertSelective(Kqinfo record);

    List<Kqinfo> selectByExample(KqinfoExample example);

    Kqinfo selectByPrimaryKey(String kqinfoId);

    int updateByExampleSelective(@Param("record") Kqinfo record, @Param("example") KqinfoExample example);

    int updateByExample(@Param("record") Kqinfo record, @Param("example") KqinfoExample example);

    int updateByPrimaryKeySelective(Kqinfo record);

    int updateByPrimaryKey(Kqinfo record);
}