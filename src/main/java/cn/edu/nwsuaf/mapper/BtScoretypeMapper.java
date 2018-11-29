package cn.edu.nwsuaf.mapper;

import java.util.List;

import cn.edu.nwsuaf.entity.BtScoretype;
import cn.edu.nwsuaf.entity.BtScoretypeExample;
import org.apache.ibatis.annotations.Param;

public interface BtScoretypeMapper {
    int countByExample(BtScoretypeExample example);

    int deleteByExample(BtScoretypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BtScoretype record);

    int insertSelective(BtScoretype record);

    List<BtScoretype> selectByExample(BtScoretypeExample example);

    BtScoretype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BtScoretype record, @Param("example") BtScoretypeExample example);

    int updateByExample(@Param("record") BtScoretype record, @Param("example") BtScoretypeExample example);

    int updateByPrimaryKeySelective(BtScoretype record);

    int updateByPrimaryKey(BtScoretype record);
}