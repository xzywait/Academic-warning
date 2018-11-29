package cn.edu.nwsuaf.mapper;

import java.util.List;

import cn.edu.nwsuaf.entity.Absentcoursewarning;
import cn.edu.nwsuaf.entity.AbsentcoursewarningExample;
import cn.edu.nwsuaf.model.AbsentCourseModel;
import org.apache.ibatis.annotations.Param;

public interface AbsentcoursewarningMapper {
    int countByExample(AbsentcoursewarningExample example);

    int deleteByExample(AbsentcoursewarningExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Absentcoursewarning record);

    int insertSelective(Absentcoursewarning record);

    List<Absentcoursewarning> selectByExample(AbsentcoursewarningExample example);

    Absentcoursewarning selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Absentcoursewarning record, @Param("example") AbsentcoursewarningExample example);

    int updateByExample(@Param("record") Absentcoursewarning record, @Param("example") AbsentcoursewarningExample example);

    int updateByPrimaryKeySelective(Absentcoursewarning record);

    int updateByPrimaryKey(Absentcoursewarning record);

    List<AbsentCourseModel> selectAbsentCourseWarnByStudentId(@Param("studentid") int studentid);

}