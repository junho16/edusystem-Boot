package com.edusystem.mapper;

import com.edusystem.entity.Sturecord;
import com.edusystem.entity.SturecordExample;
import com.edusystem.entity.SturecordWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SturecordMapper {
    long countByExample(SturecordExample example);

    int deleteByExample(SturecordExample example);

    int deleteByPrimaryKey(String studentId);

    int insert(SturecordWithBLOBs record);

    int insertSelective(SturecordWithBLOBs record);

    List<SturecordWithBLOBs> selectByExampleWithBLOBs(SturecordExample example);

    List<Sturecord> selectByExample(SturecordExample example);

    SturecordWithBLOBs selectByPrimaryKey(String studentId);

    int updateByExampleSelective(@Param("record") SturecordWithBLOBs record, @Param("example") SturecordExample example);

    int updateByExampleWithBLOBs(@Param("record") SturecordWithBLOBs record, @Param("example") SturecordExample example);

    int updateByExample(@Param("record") Sturecord record, @Param("example") SturecordExample example);

    int updateByPrimaryKeySelective(SturecordWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SturecordWithBLOBs record);

    int updateByPrimaryKey(Sturecord record);
}