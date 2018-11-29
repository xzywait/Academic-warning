package cn.edu.nwsuaf.mapper;

import java.util.List;

import cn.edu.nwsuaf.entity.Warningtype;
import cn.edu.nwsuaf.entity.WarningtypeExample;
import org.apache.ibatis.annotations.Param;

public interface WarningtypeMapper {
    int countByExample(WarningtypeExample example);

    int deleteByExample(WarningtypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Warningtype record);

    int insertSelective(Warningtype record);

    List<Warningtype> selectByExample(WarningtypeExample example);

    Warningtype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Warningtype record, @Param("example") WarningtypeExample example);

    int updateByExample(@Param("record") Warningtype record, @Param("example") WarningtypeExample example);

    int updateByPrimaryKeySelective(Warningtype record);

    int updateByPrimaryKey(Warningtype record);
}