package cn.edu.nwsuaf.mapper;

import java.util.List;

import cn.edu.nwsuaf.entity.Registration;
import cn.edu.nwsuaf.entity.RegistrationExample;
import org.apache.ibatis.annotations.Param;

public interface RegistrationMapper {
    int countByExample(RegistrationExample example);

    int deleteByExample(RegistrationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Registration record);

    int insertSelective(Registration record);

    List<Registration> selectByExample(RegistrationExample example);

    Registration selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Registration record, @Param("example") RegistrationExample example);

    int updateByExample(@Param("record") Registration record, @Param("example") RegistrationExample example);

    int updateByPrimaryKeySelective(Registration record);

    int updateByPrimaryKey(Registration record);
}