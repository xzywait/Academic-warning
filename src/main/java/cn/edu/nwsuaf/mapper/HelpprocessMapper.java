package cn.edu.nwsuaf.mapper;

import java.util.List;

import cn.edu.nwsuaf.entity.Helpprocess;
import cn.edu.nwsuaf.entity.HelpprocessExample;
import org.apache.ibatis.annotations.Param;

public interface HelpprocessMapper {
    int countByExample(HelpprocessExample example);

    int deleteByExample(HelpprocessExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Helpprocess record);

    int insertSelective(Helpprocess record);

    List<Helpprocess> selectByExampleWithBLOBs(HelpprocessExample example);

    List<Helpprocess> selectByExample(HelpprocessExample example);

    Helpprocess selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Helpprocess record, @Param("example") HelpprocessExample example);

    int updateByExampleWithBLOBs(@Param("record") Helpprocess record, @Param("example") HelpprocessExample example);

    int updateByExample(@Param("record") Helpprocess record, @Param("example") HelpprocessExample example);

    int updateByPrimaryKeySelective(Helpprocess record);

    int updateByPrimaryKeyWithBLOBs(Helpprocess record);

    int updateByPrimaryKey(Helpprocess record);
}