package cn.edu.nwsuaf.mapper;

import java.util.List;

import cn.edu.nwsuaf.entity.Helpsummary;
import cn.edu.nwsuaf.entity.HelpsummaryExample;
import cn.edu.nwsuaf.entity.HelpsummaryWithBLOBs;
import org.apache.ibatis.annotations.Param;

public interface HelpsummaryMapper {
    int countByExample(HelpsummaryExample example);

    int deleteByExample(HelpsummaryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HelpsummaryWithBLOBs record);

    int insertSelective(HelpsummaryWithBLOBs record);

    List<HelpsummaryWithBLOBs> selectByExampleWithBLOBs(HelpsummaryExample example);

    List<Helpsummary> selectByExample(HelpsummaryExample example);

    HelpsummaryWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HelpsummaryWithBLOBs record, @Param("example") HelpsummaryExample example);

    int updateByExampleWithBLOBs(@Param("record") HelpsummaryWithBLOBs record, @Param("example") HelpsummaryExample example);

    int updateByExample(@Param("record") Helpsummary record, @Param("example") HelpsummaryExample example);

    int updateByPrimaryKeySelective(HelpsummaryWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(HelpsummaryWithBLOBs record);

    int updateByPrimaryKey(Helpsummary record);
}