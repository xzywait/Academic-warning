package cn.edu.nwsuaf.mapper;

import java.util.List;

import cn.edu.nwsuaf.entity.BtStudentteacheringplan;
import cn.edu.nwsuaf.entity.BtStudentteacheringplanExample;
import org.apache.ibatis.annotations.Param;

public interface BtStudentteacheringplanMapper {
    int countByExample(BtStudentteacheringplanExample example);

    int deleteByExample(BtStudentteacheringplanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BtStudentteacheringplan record);

    int insertSelective(BtStudentteacheringplan record);

    List<BtStudentteacheringplan> selectByExample(BtStudentteacheringplanExample example);

    BtStudentteacheringplan selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BtStudentteacheringplan record, @Param("example") BtStudentteacheringplanExample example);

    int updateByExample(@Param("record") BtStudentteacheringplan record, @Param("example") BtStudentteacheringplanExample example);

    int updateByPrimaryKeySelective(BtStudentteacheringplan record);

    int updateByPrimaryKey(BtStudentteacheringplan record);
}