package cn.edu.nwsuaf.mapper;

import java.util.List;

import cn.edu.nwsuaf.entity.Warninglevel;
import cn.edu.nwsuaf.entity.WarninglevelExample;
import org.apache.ibatis.annotations.Param;

public interface WarninglevelMapper {
    int countByExample(WarninglevelExample example);

    int deleteByExample(WarninglevelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Warninglevel record);

    int insertSelective(Warninglevel record);

    List<Warninglevel> selectByExample(WarninglevelExample example);

    Warninglevel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Warninglevel record, @Param("example") WarninglevelExample example);

    int updateByExample(@Param("record") Warninglevel record, @Param("example") WarninglevelExample example);

    int updateByPrimaryKeySelective(Warninglevel record);

    int updateByPrimaryKey(Warninglevel record);
}