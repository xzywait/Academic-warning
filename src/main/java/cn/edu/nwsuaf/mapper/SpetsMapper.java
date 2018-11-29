package cn.edu.nwsuaf.mapper;

import java.util.List;

import cn.edu.nwsuaf.entity.Spets;
import cn.edu.nwsuaf.entity.SpetsExample;
import org.apache.ibatis.annotations.Param;

public interface SpetsMapper {
    int countByExample(SpetsExample example);

    int deleteByExample(SpetsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Spets record);

    int insertSelective(Spets record);

    List<Spets> selectByExample(SpetsExample example);

    Spets selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Spets record, @Param("example") SpetsExample example);

    int updateByExample(@Param("record") Spets record, @Param("example") SpetsExample example);

    int updateByPrimaryKeySelective(Spets record);

    int updateByPrimaryKey(Spets record);
}