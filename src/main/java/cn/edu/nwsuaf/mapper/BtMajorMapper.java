package cn.edu.nwsuaf.mapper;

import java.util.List;

import cn.edu.nwsuaf.entity.BtMajor;
import cn.edu.nwsuaf.entity.BtMajorExample;
import org.apache.ibatis.annotations.Param;

public interface BtMajorMapper {
    int countByExample(BtMajorExample example);

    int deleteByExample(BtMajorExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BtMajor record);

    int insertSelective(BtMajor record);

    List<BtMajor> selectByExample(BtMajorExample example);

    BtMajor selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BtMajor record, @Param("example") BtMajorExample example);

    int updateByExample(@Param("record") BtMajor record, @Param("example") BtMajorExample example);

    int updateByPrimaryKeySelective(BtMajor record);

    int updateByPrimaryKey(BtMajor record);
}