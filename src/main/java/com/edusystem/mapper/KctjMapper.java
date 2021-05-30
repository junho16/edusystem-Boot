package com.edusystem.mapper;

import com.edusystem.entity.Kctj;
import com.edusystem.entity.KctjExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KctjMapper {
    long countByExample(KctjExample example);

    int deleteByExample(KctjExample example);

    int deleteByPrimaryKey(Integer kctjId);

    int insert(Kctj record);

    int insertSelective(Kctj record);

    List<Kctj> selectByExampleWithBLOBs(KctjExample example);

    List<Kctj> selectByExample(KctjExample example);

    Kctj selectByPrimaryKey(Integer kctjId);

    int updateByExampleSelective(@Param("record") Kctj record, @Param("example") KctjExample example);

    int updateByExampleWithBLOBs(@Param("record") Kctj record, @Param("example") KctjExample example);

    int updateByExample(@Param("record") Kctj record, @Param("example") KctjExample example);

    int updateByPrimaryKeySelective(Kctj record);

    int updateByPrimaryKeyWithBLOBs(Kctj record);

    int updateByPrimaryKey(Kctj record);
}