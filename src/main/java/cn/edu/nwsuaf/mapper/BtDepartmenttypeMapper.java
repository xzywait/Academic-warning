package cn.edu.nwsuaf.mapper;

import java.util.List;

import cn.edu.nwsuaf.entity.BtDepartmenttype;
import cn.edu.nwsuaf.entity.BtDepartmenttypeExample;
import org.apache.ibatis.annotations.Param;

public interface BtDepartmenttypeMapper {
    int countByExample(BtDepartmenttypeExample example);

    int deleteByExample(BtDepartmenttypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BtDepartmenttype record);

    int insertSelective(BtDepartmenttype record);

    List<BtDepartmenttype> selectByExample(BtDepartmenttypeExample example);

    BtDepartmenttype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BtDepartmenttype record, @Param("example") BtDepartmenttypeExample example);

    int updateByExample(@Param("record") BtDepartmenttype record, @Param("example") BtDepartmenttypeExample example);

    int updateByPrimaryKeySelective(BtDepartmenttype record);

    int updateByPrimaryKey(BtDepartmenttype record);
}