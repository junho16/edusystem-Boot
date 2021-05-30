package com.edusystem.mapper;

import com.edusystem.entity.Tip;
import com.edusystem.entity.TipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TipMapper {
    long countByExample(TipExample example);

    int deleteByExample(TipExample example);

    int deleteByPrimaryKey(String tipId);

    int insert(Tip record);

    int insertSelective(Tip record);

    List<Tip> selectByExample(TipExample example);

    Tip selectByPrimaryKey(String tipId);

    int updateByExampleSelective(@Param("record") Tip record, @Param("example") TipExample example);

    int updateByExample(@Param("record") Tip record, @Param("example") TipExample example);

    int updateByPrimaryKeySelective(Tip record);

    int updateByPrimaryKey(Tip record);
}