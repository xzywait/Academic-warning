package cn.edu.nwsuaf.mapper;

import java.util.List;

import cn.edu.nwsuaf.entity.BtCoursenature;
import cn.edu.nwsuaf.entity.BtCoursenatureExample;
import org.apache.ibatis.annotations.Param;

public interface BtCoursenatureMapper {
    int countByExample(BtCoursenatureExample example);

    int deleteByExample(BtCoursenatureExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BtCoursenature record);

    int insertSelective(BtCoursenature record);

    List<BtCoursenature> selectByExample(BtCoursenatureExample example);

    BtCoursenature selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BtCoursenature record, @Param("example") BtCoursenatureExample example);

    int updateByExample(@Param("record") BtCoursenature record, @Param("example") BtCoursenatureExample example);

    int updateByPrimaryKeySelective(BtCoursenature record);

    int updateByPrimaryKey(BtCoursenature record);
}