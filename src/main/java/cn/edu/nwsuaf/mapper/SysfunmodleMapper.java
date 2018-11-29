package cn.edu.nwsuaf.mapper;

import java.util.List;

import cn.edu.nwsuaf.entity.Sysfunmodle;
import cn.edu.nwsuaf.entity.SysfunmodleExample;
import org.apache.ibatis.annotations.Param;

public interface SysfunmodleMapper {
    int countByExample(SysfunmodleExample example);

    int deleteByExample(SysfunmodleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Sysfunmodle record);

    int insertSelective(Sysfunmodle record);

    List<Sysfunmodle> selectByExample(SysfunmodleExample example);

    Sysfunmodle selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Sysfunmodle record, @Param("example") SysfunmodleExample example);

    int updateByExample(@Param("record") Sysfunmodle record, @Param("example") SysfunmodleExample example);

    int updateByPrimaryKeySelective(Sysfunmodle record);

    int updateByPrimaryKey(Sysfunmodle record);
}