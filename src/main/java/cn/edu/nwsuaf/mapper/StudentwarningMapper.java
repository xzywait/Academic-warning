package cn.edu.nwsuaf.mapper;

import java.util.List;

import cn.edu.nwsuaf.entity.Studentwarning;
import cn.edu.nwsuaf.entity.StudentwarningExample;
import cn.edu.nwsuaf.model.WarningModel;
import org.apache.ibatis.annotations.Param;

public interface StudentwarningMapper {
    int countByExample(StudentwarningExample example);

    int deleteByExample(StudentwarningExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Studentwarning record);

    int insertSelective(Studentwarning record);

    List<Studentwarning> selectByExample(StudentwarningExample example);

    Studentwarning selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Studentwarning record, @Param("example") StudentwarningExample example);

    int updateByExample(@Param("record") Studentwarning record, @Param("example") StudentwarningExample example);

    int updateByPrimaryKeySelective(Studentwarning record);

    int updateByPrimaryKey(Studentwarning record);

    List<WarningModel> selectWarningModelByExample(StudentwarningExample example);
}