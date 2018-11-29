package cn.edu.nwsuaf.mapper;

import java.util.List;

import cn.edu.nwsuaf.entity.Sysrole;
import cn.edu.nwsuaf.entity.SysroleExample;
import org.apache.ibatis.annotations.Param;

public interface SysroleMapper {
    int countByExample(SysroleExample example);

    int deleteByExample(SysroleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Sysrole record);

    int insertSelective(Sysrole record);

    List<Sysrole> selectByExample(SysroleExample example);

    Sysrole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Sysrole record, @Param("example") SysroleExample example);

    int updateByExample(@Param("record") Sysrole record, @Param("example") SysroleExample example);

    int updateByPrimaryKeySelective(Sysrole record);

    int updateByPrimaryKey(Sysrole record);
}