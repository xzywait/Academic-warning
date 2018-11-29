package cn.edu.nwsuaf.mapper;

import java.util.List;

import cn.edu.nwsuaf.entity.BtClassmerging;
import cn.edu.nwsuaf.entity.BtClassmergingExample;
import org.apache.ibatis.annotations.Param;

public interface BtClassmergingMapper {
    int countByExample(BtClassmergingExample example);

    int deleteByExample(BtClassmergingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BtClassmerging record);

    int insertSelective(BtClassmerging record);

    List<BtClassmerging> selectByExample(BtClassmergingExample example);

    BtClassmerging selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BtClassmerging record, @Param("example") BtClassmergingExample example);

    int updateByExample(@Param("record") BtClassmerging record, @Param("example") BtClassmergingExample example);

    int updateByPrimaryKeySelective(BtClassmerging record);

    int updateByPrimaryKey(BtClassmerging record);
}