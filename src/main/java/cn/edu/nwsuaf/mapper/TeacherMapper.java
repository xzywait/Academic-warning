package cn.edu.nwsuaf.mapper;

import cn.edu.nwsuaf.entity.Student;
import cn.edu.nwsuaf.entity.Teacher;
import cn.edu.nwsuaf.entity.TeacherExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherMapper {
    int countByExample(TeacherExample example);

    int deleteByExample(TeacherExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    List<Teacher> selectByExample(TeacherExample example);

    Teacher selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Teacher record, @Param("example") TeacherExample example);

    int updateByExample(@Param("record") Teacher record, @Param("example") TeacherExample example);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);

    List<Student> selectwarningstudentbyclassid(@Param("classid") int classid, @Param("studentname") String studentname);
}