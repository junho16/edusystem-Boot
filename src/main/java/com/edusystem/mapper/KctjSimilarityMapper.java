package com.edusystem.mapper;

import com.edusystem.entity.KctjSimilarity;
import com.edusystem.entity.KctjSimilarityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KctjSimilarityMapper {
    long countByExample(KctjSimilarityExample example);

    int deleteByExample(KctjSimilarityExample example);

    int insert(KctjSimilarity record);

    int insertSelective(KctjSimilarity record);

    List<KctjSimilarity> selectByExample(KctjSimilarityExample example);

    int updateByExampleSelective(@Param("record") KctjSimilarity record, @Param("example") KctjSimilarityExample example);

    int updateByExample(@Param("record") KctjSimilarity record, @Param("example") KctjSimilarityExample example);
}