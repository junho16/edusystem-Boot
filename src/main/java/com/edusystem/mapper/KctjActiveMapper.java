package com.edusystem.mapper;

import com.edusystem.entity.KctjActive;
import com.edusystem.entity.KctjActiveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KctjActiveMapper {
    long countByExample(KctjActiveExample example);

    int deleteByExample(KctjActiveExample example);

    int insert(KctjActive record);

    int insertSelective(KctjActive record);

    List<KctjActive> selectByExample(KctjActiveExample example);

    int updateByExampleSelective(@Param("record") KctjActive record, @Param("example") KctjActiveExample example);

    int updateByExample(@Param("record") KctjActive record, @Param("example") KctjActiveExample example);
}