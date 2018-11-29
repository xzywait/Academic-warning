package cn.edu.nwsuaf.mapper;

import java.util.List;

import cn.edu.nwsuaf.entity.BtOpencourse;
import cn.edu.nwsuaf.entity.BtOpencourseExample;
import cn.edu.nwsuaf.model.CourseTuple;
import org.apache.ibatis.annotations.Param;

public interface BtOpencourseMapper {
    int countByExample(BtOpencourseExample example);

    int deleteByExample(BtOpencourseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BtOpencourse record);

    int insertSelective(BtOpencourse record);

    List<BtOpencourse> selectByExample(BtOpencourseExample example);

    BtOpencourse selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BtOpencourse record, @Param("example") BtOpencourseExample example);

    int updateByExample(@Param("record") BtOpencourse record, @Param("example") BtOpencourseExample example);

    int updateByPrimaryKeySelective(BtOpencourse record);

    int updateByPrimaryKey(BtOpencourse record);

    List<CourseTuple> selectTotalNumAndCredit(@Param("studentid") int studentid,
                                              @Param("yearname") String yearname,
                                              @Param("semestername") String semestername,
                                              @Param("coursenaturename") String coursenaturename);

    BtOpencourse selectByParmas(@Param("classid") int classid, @Param("courseid") int courseid, @Param("teacherid") int teacherid);
}