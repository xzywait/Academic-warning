package cn.edu.nwsuaf.mapper;

import java.util.List;

import cn.edu.nwsuaf.entity.Totalscore;
import cn.edu.nwsuaf.entity.TotalscoreExample;
import org.apache.ibatis.annotations.Param;

public interface TotalscoreMapper {
    int countByExample(TotalscoreExample example);

    int deleteByExample(TotalscoreExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Totalscore record);

    int insertSelective(Totalscore record);

    List<Totalscore> selectByExample(TotalscoreExample example);

    Totalscore selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Totalscore record, @Param("example") TotalscoreExample example);

    int updateByExample(@Param("record") Totalscore record, @Param("example") TotalscoreExample example);

    int updateByPrimaryKeySelective(Totalscore record);

    int updateByPrimaryKey(Totalscore record);
}