package cn.edu.nwsuaf.mapper;

import java.util.List;

import cn.edu.nwsuaf.entity.BtSemester;
import cn.edu.nwsuaf.entity.BtSemesterExample;
import org.apache.ibatis.annotations.Param;

public interface BtSemesterMapper {
    int countByExample(BtSemesterExample example);

    int deleteByExample(BtSemesterExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BtSemester record);

    int insertSelective(BtSemester record);

    List<BtSemester> selectByExample(BtSemesterExample example);

    BtSemester selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BtSemester record, @Param("example") BtSemesterExample example);

    int updateByExample(@Param("record") BtSemester record, @Param("example") BtSemesterExample example);

    int updateByPrimaryKeySelective(BtSemester record);

    int updateByPrimaryKey(BtSemester record);
}