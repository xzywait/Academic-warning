package cn.edu.nwsuaf.mapper;

import java.util.List;

import cn.edu.nwsuaf.entity.BtCourse;
import cn.edu.nwsuaf.entity.BtCourseExample;
import org.apache.ibatis.annotations.Param;

public interface BtCourseMapper {
    int countByExample(BtCourseExample example);

    int deleteByExample(BtCourseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BtCourse record);

    int insertSelective(BtCourse record);

    List<BtCourse> selectByExample(BtCourseExample example);

    BtCourse selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BtCourse record, @Param("example") BtCourseExample example);

    int updateByExample(@Param("record") BtCourse record, @Param("example") BtCourseExample example);

    int updateByPrimaryKeySelective(BtCourse record);

    int updateByPrimaryKey(BtCourse record);
}