package cn.edu.nwsuaf.mapper;

import java.util.List;

import cn.edu.nwsuaf.entity.BtCoursegroup;
import cn.edu.nwsuaf.entity.BtCoursegroupExample;
import org.apache.ibatis.annotations.Param;

public interface BtCoursegroupMapper {
    int countByExample(BtCoursegroupExample example);

    int deleteByExample(BtCoursegroupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BtCoursegroup record);

    int insertSelective(BtCoursegroup record);

    List<BtCoursegroup> selectByExample(BtCoursegroupExample example);

    BtCoursegroup selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BtCoursegroup record, @Param("example") BtCoursegroupExample example);

    int updateByExample(@Param("record") BtCoursegroup record, @Param("example") BtCoursegroupExample example);

    int updateByPrimaryKeySelective(BtCoursegroup record);

    int updateByPrimaryKey(BtCoursegroup record);
}