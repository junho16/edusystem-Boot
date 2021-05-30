package com.edusystem.mapper;

import com.edusystem.entity.Tk;
import com.edusystem.entity.TkExample;
import com.edusystem.entity.TkWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TkMapper {
    long countByExample(TkExample example);

    int deleteByExample(TkExample example);

    int deleteByPrimaryKey(String tkId);

    int insert(TkWithBLOBs record);

    int insertSelective(TkWithBLOBs record);

    List<TkWithBLOBs> selectByExampleWithBLOBs(TkExample example);

    List<Tk> selectByExample(TkExample example);

    TkWithBLOBs selectByPrimaryKey(String tkId);

    int updateByExampleSelective(@Param("record") TkWithBLOBs record, @Param("example") TkExample example);

    int updateByExampleWithBLOBs(@Param("record") TkWithBLOBs record, @Param("example") TkExample example);

    int updateByExample(@Param("record") Tk record, @Param("example") TkExample example);

    int updateByPrimaryKeySelective(TkWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TkWithBLOBs record);

    int updateByPrimaryKey(Tk record);
}