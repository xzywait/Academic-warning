package cn.edu.nwsuaf.mapper;

import java.util.List;

import cn.edu.nwsuaf.entity.BtDepartment;
import cn.edu.nwsuaf.entity.BtDepartmentExample;
import org.apache.ibatis.annotations.Param;

public interface BtDepartmentMapper {
    int countByExample(BtDepartmentExample example);

    int deleteByExample(BtDepartmentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BtDepartment record);

    int insertSelective(BtDepartment record);

    List<BtDepartment> selectByExample(BtDepartmentExample example);

    BtDepartment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BtDepartment record, @Param("example") BtDepartmentExample example);

    int updateByExample(@Param("record") BtDepartment record, @Param("example") BtDepartmentExample example);

    int updateByPrimaryKeySelective(BtDepartment record);

    int updateByPrimaryKey(BtDepartment record);
}