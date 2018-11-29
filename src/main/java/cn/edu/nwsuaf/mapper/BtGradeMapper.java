package cn.edu.nwsuaf.mapper;

import java.util.List;

import cn.edu.nwsuaf.entity.BtGrade;
import cn.edu.nwsuaf.entity.BtGradeExample;
import org.apache.ibatis.annotations.Param;

public interface BtGradeMapper {
    int countByExample(BtGradeExample example);

    int deleteByExample(BtGradeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BtGrade record);

    int insertSelective(BtGrade record);

    List<BtGrade> selectByExample(BtGradeExample example);

    BtGrade selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BtGrade record, @Param("example") BtGradeExample example);

    int updateByExample(@Param("record") BtGrade record, @Param("example") BtGradeExample example);

    int updateByPrimaryKeySelective(BtGrade record);

    int updateByPrimaryKey(BtGrade record);
}