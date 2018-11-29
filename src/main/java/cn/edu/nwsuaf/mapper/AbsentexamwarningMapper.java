package cn.edu.nwsuaf.mapper;

import java.util.List;

import cn.edu.nwsuaf.entity.Absentexamwarning;
import cn.edu.nwsuaf.entity.AbsentexamwarningExample;
import cn.edu.nwsuaf.model.AbsentExamModel;
import org.apache.ibatis.annotations.Param;

public interface AbsentexamwarningMapper {
    int countByExample(AbsentexamwarningExample example);

    int deleteByExample(AbsentexamwarningExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Absentexamwarning record);

    int insertSelective(Absentexamwarning record);

    List<Absentexamwarning> selectByExample(AbsentexamwarningExample example);

    Absentexamwarning selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Absentexamwarning record, @Param("example") AbsentexamwarningExample example);

    int updateByExample(@Param("record") Absentexamwarning record, @Param("example") AbsentexamwarningExample example);

    int updateByPrimaryKeySelective(Absentexamwarning record);

    int updateByPrimaryKey(Absentexamwarning record);

    List<AbsentExamModel> selectAbsentExamWarnByStudentId(@Param("studentid") int studentid);
}