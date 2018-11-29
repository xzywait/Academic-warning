package cn.edu.nwsuaf.mapper;

import java.util.List;

import cn.edu.nwsuaf.entity.Averagescore;
import cn.edu.nwsuaf.entity.AveragescoreExample;
import org.apache.ibatis.annotations.Param;

public interface AveragescoreMapper {
    int countByExample(AveragescoreExample example);

    int deleteByExample(AveragescoreExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Averagescore record);

    int insertSelective(Averagescore record);

    List<Averagescore> selectByExample(AveragescoreExample example);

    Averagescore selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Averagescore record, @Param("example") AveragescoreExample example);

    int updateByExample(@Param("record") Averagescore record, @Param("example") AveragescoreExample example);

    int updateByPrimaryKeySelective(Averagescore record);

    int updateByPrimaryKey(Averagescore record);
}