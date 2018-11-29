package cn.edu.nwsuaf.mapper;

import java.util.List;

import cn.edu.nwsuaf.entity.BtScoremark;
import cn.edu.nwsuaf.entity.BtScoremarkExample;
import org.apache.ibatis.annotations.Param;

public interface BtScoremarkMapper {
    int countByExample(BtScoremarkExample example);

    int deleteByExample(BtScoremarkExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BtScoremark record);

    int insertSelective(BtScoremark record);

    List<BtScoremark> selectByExample(BtScoremarkExample example);

    BtScoremark selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BtScoremark record, @Param("example") BtScoremarkExample example);

    int updateByExample(@Param("record") BtScoremark record, @Param("example") BtScoremarkExample example);

    int updateByPrimaryKeySelective(BtScoremark record);

    int updateByPrimaryKey(BtScoremark record);
}