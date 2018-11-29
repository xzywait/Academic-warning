package cn.edu.nwsuaf.mapper;

import java.util.List;

import cn.edu.nwsuaf.entity.Sysuserinfo;
import cn.edu.nwsuaf.entity.SysuserinfoExample;
import org.apache.ibatis.annotations.Param;

public interface SysuserinfoMapper {
    int countByExample(SysuserinfoExample example);

    int deleteByExample(SysuserinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Sysuserinfo record);

    int insertSelective(Sysuserinfo record);

    List<Sysuserinfo> selectByExample(SysuserinfoExample example);

    Sysuserinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Sysuserinfo record, @Param("example") SysuserinfoExample example);

    int updateByExample(@Param("record") Sysuserinfo record, @Param("example") SysuserinfoExample example);

    int updateByPrimaryKeySelective(Sysuserinfo record);

    int updateByPrimaryKey(Sysuserinfo record);
}