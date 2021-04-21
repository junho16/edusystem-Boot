package com.edusystem.mapper;

import com.edusystem.entity.Kcxz;
import com.edusystem.entity.KcxzExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface KcxzMapper {
    long countByExample(KcxzExample example);

    int deleteByExample(KcxzExample example);

    int deleteByPrimaryKey(String kcxzId);

    int insert(Kcxz record);

    int insertSelective(Kcxz record);

    List<Kcxz> selectByExample(KcxzExample example);

    Kcxz selectByPrimaryKey(String kcxzId);

    int updateByExampleSelective(@Param("record") Kcxz record, @Param("example") KcxzExample example);

    int updateByExample(@Param("record") Kcxz record, @Param("example") KcxzExample example);

    int updateByPrimaryKeySelective(Kcxz record);

    int updateByPrimaryKey(Kcxz record);
}