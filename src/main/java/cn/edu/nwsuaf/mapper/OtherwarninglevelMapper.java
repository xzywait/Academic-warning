package cn.edu.nwsuaf.mapper;

import java.util.List;

import cn.edu.nwsuaf.entity.Otherwarninglevel;
import cn.edu.nwsuaf.entity.OtherwarninglevelExample;
import org.apache.ibatis.annotations.Param;

public interface OtherwarninglevelMapper {
    int countByExample(OtherwarninglevelExample example);

    int deleteByExample(OtherwarninglevelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Otherwarninglevel record);

    int insertSelective(Otherwarninglevel record);

    List<Otherwarninglevel> selectByExample(OtherwarninglevelExample example);

    Otherwarninglevel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Otherwarninglevel record, @Param("example") OtherwarninglevelExample example);

    int updateByExample(@Param("record") Otherwarninglevel record, @Param("example") OtherwarninglevelExample example);

    int updateByPrimaryKeySelective(Otherwarninglevel record);

    int updateByPrimaryKey(Otherwarninglevel record);
}