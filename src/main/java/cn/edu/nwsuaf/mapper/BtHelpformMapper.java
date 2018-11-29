package cn.edu.nwsuaf.mapper;

import java.util.List;

import cn.edu.nwsuaf.entity.BtHelpform;
import cn.edu.nwsuaf.entity.BtHelpformExample;
import org.apache.ibatis.annotations.Param;

public interface BtHelpformMapper {
    int countByExample(BtHelpformExample example);

    int deleteByExample(BtHelpformExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BtHelpform record);

    int insertSelective(BtHelpform record);

    List<BtHelpform> selectByExample(BtHelpformExample example);

    BtHelpform selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BtHelpform record, @Param("example") BtHelpformExample example);

    int updateByExample(@Param("record") BtHelpform record, @Param("example") BtHelpformExample example);

    int updateByPrimaryKeySelective(BtHelpform record);

    int updateByPrimaryKey(BtHelpform record);
}