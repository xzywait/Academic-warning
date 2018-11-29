package cn.edu.nwsuaf.mapper;

import java.util.List;

import cn.edu.nwsuaf.entity.Otherwarning;
import cn.edu.nwsuaf.entity.OtherwarningExample;
import org.apache.ibatis.annotations.Param;

public interface OtherwarningMapper {
    int countByExample(OtherwarningExample example);

    int deleteByExample(OtherwarningExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Otherwarning record);

    int insertSelective(Otherwarning record);

    List<Otherwarning> selectByExample(OtherwarningExample example);

    Otherwarning selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Otherwarning record, @Param("example") OtherwarningExample example);

    int updateByExample(@Param("record") Otherwarning record, @Param("example") OtherwarningExample example);

    int updateByPrimaryKeySelective(Otherwarning record);

    int updateByPrimaryKey(Otherwarning record);
}