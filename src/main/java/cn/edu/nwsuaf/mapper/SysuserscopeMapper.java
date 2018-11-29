package cn.edu.nwsuaf.mapper;

import java.util.List;

import cn.edu.nwsuaf.entity.Sysuserscope;
import cn.edu.nwsuaf.entity.SysuserscopeExample;
import org.apache.ibatis.annotations.Param;

public interface SysuserscopeMapper {
    int countByExample(SysuserscopeExample example);

    int deleteByExample(SysuserscopeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Sysuserscope record);

    int insertSelective(Sysuserscope record);

    List<Sysuserscope> selectByExample(SysuserscopeExample example);

    Sysuserscope selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Sysuserscope record, @Param("example") SysuserscopeExample example);

    int updateByExample(@Param("record") Sysuserscope record, @Param("example") SysuserscopeExample example);

    int updateByPrimaryKeySelective(Sysuserscope record);

    int updateByPrimaryKey(Sysuserscope record);
}