package cn.edu.nwsuaf.mapper;

import java.util.List;

import cn.edu.nwsuaf.entity.Parent;
import cn.edu.nwsuaf.entity.ParentExample;
import org.apache.ibatis.annotations.Param;

public interface ParentMapper {
    int countByExample(ParentExample example);

    int deleteByExample(ParentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Parent record);

    int insertSelective(Parent record);

    List<Parent> selectByExample(ParentExample example);

    Parent selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Parent record, @Param("example") ParentExample example);

    int updateByExample(@Param("record") Parent record, @Param("example") ParentExample example);

    int updateByPrimaryKeySelective(Parent record);

    int updateByPrimaryKey(Parent record);
}