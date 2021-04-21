package com.edusystem.mapper;

import com.edusystem.entity.Trainplan;
import com.edusystem.entity.TrainplanExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TrainplanMapper {
    long countByExample(TrainplanExample example);

    int deleteByExample(TrainplanExample example);

    int deleteByPrimaryKey(String trainplanId);

    int insert(Trainplan record);

    int insertSelective(Trainplan record);

    List<Trainplan> selectByExample(TrainplanExample example);

    Trainplan selectByPrimaryKey(String trainplanId);

    int updateByExampleSelective(@Param("record") Trainplan record, @Param("example") TrainplanExample example);

    int updateByExample(@Param("record") Trainplan record, @Param("example") TrainplanExample example);

    int updateByPrimaryKeySelective(Trainplan record);

    int updateByPrimaryKey(Trainplan record);
}