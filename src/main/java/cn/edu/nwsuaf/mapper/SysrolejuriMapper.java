package cn.edu.nwsuaf.mapper;

import java.util.List;

import cn.edu.nwsuaf.entity.Sysrolejuri;
import cn.edu.nwsuaf.entity.SysrolejuriExample;
import org.apache.ibatis.annotations.Param;

public interface SysrolejuriMapper {
    int countByExample(SysrolejuriExample example);

    int deleteByExample(SysrolejuriExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Sysrolejuri record);

    int insertSelective(Sysrolejuri record);

    List<Sysrolejuri> selectByExample(SysrolejuriExample example);

    Sysrolejuri selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Sysrolejuri record, @Param("example") SysrolejuriExample example);

    int updateByExample(@Param("record") Sysrolejuri record, @Param("example") SysrolejuriExample example);

    int updateByPrimaryKeySelective(Sysrolejuri record);

    int updateByPrimaryKey(Sysrolejuri record);
}