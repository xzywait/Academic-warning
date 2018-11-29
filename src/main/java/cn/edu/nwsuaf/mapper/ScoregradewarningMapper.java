package cn.edu.nwsuaf.mapper;

import java.util.List;

import cn.edu.nwsuaf.entity.Scoregradewarning;
import cn.edu.nwsuaf.entity.ScoregradewarningExample;
import org.apache.ibatis.annotations.Param;

public interface ScoregradewarningMapper {
    int countByExample(ScoregradewarningExample example);

    int deleteByExample(ScoregradewarningExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Scoregradewarning record);

    int insertSelective(Scoregradewarning record);

    List<Scoregradewarning> selectByExample(ScoregradewarningExample example);

    Scoregradewarning selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Scoregradewarning record, @Param("example") ScoregradewarningExample example);

    int updateByExample(@Param("record") Scoregradewarning record, @Param("example") ScoregradewarningExample example);

    int updateByPrimaryKeySelective(Scoregradewarning record);

    int updateByPrimaryKey(Scoregradewarning record);
}