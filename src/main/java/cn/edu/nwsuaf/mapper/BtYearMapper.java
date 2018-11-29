package cn.edu.nwsuaf.mapper;

import java.util.List;

import cn.edu.nwsuaf.entity.BtYear;
import cn.edu.nwsuaf.entity.BtYearExample;
import org.apache.ibatis.annotations.Param;

public interface BtYearMapper {
    int countByExample(BtYearExample example);

    int deleteByExample(BtYearExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BtYear record);

    int insertSelective(BtYear record);

    List<BtYear> selectByExample(BtYearExample example);

    BtYear selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BtYear record, @Param("example") BtYearExample example);

    int updateByExample(@Param("record") BtYear record, @Param("example") BtYearExample example);

    int updateByPrimaryKeySelective(BtYear record);

    int updateByPrimaryKey(BtYear record);
}