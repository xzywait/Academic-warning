package cn.edu.nwsuaf.mapper;

import java.util.List;

import cn.edu.nwsuaf.entity.Usuallycheckwanging;
import cn.edu.nwsuaf.entity.UsuallycheckwangingExample;
import cn.edu.nwsuaf.model.UsuallyWarnModel;
import org.apache.ibatis.annotations.Param;

public interface UsuallycheckwangingMapper {
    int countByExample(UsuallycheckwangingExample example);

    int deleteByExample(UsuallycheckwangingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Usuallycheckwanging record);

    int insertSelective(Usuallycheckwanging record);

    List<Usuallycheckwanging> selectByExample(UsuallycheckwangingExample example);

    Usuallycheckwanging selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Usuallycheckwanging record, @Param("example") UsuallycheckwangingExample example);

    int updateByExample(@Param("record") Usuallycheckwanging record, @Param("example") UsuallycheckwangingExample example);

    int updateByPrimaryKeySelective(Usuallycheckwanging record);

    int updateByPrimaryKey(Usuallycheckwanging record);

    List<UsuallyWarnModel> selectUsuallyWarnByStudentId(@Param("studentid") int studentid);
}