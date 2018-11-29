package cn.edu.nwsuaf.mapper;

import java.util.List;

import cn.edu.nwsuaf.entity.BtCourseopentype;
import cn.edu.nwsuaf.entity.BtCourseopentypeExample;
import org.apache.ibatis.annotations.Param;

public interface BtCourseopentypeMapper {
    int countByExample(BtCourseopentypeExample example);

    int deleteByExample(BtCourseopentypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BtCourseopentype record);

    int insertSelective(BtCourseopentype record);

    List<BtCourseopentype> selectByExample(BtCourseopentypeExample example);

    BtCourseopentype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BtCourseopentype record, @Param("example") BtCourseopentypeExample example);

    int updateByExample(@Param("record") BtCourseopentype record, @Param("example") BtCourseopentypeExample example);

    int updateByPrimaryKeySelective(BtCourseopentype record);

    int updateByPrimaryKey(BtCourseopentype record);
}