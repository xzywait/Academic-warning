package cn.edu.nwsuaf.mapper;

import cn.edu.nwsuaf.entity.BtClass;
import cn.edu.nwsuaf.entity.BtClassExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BtClassMapper {
    int countByExample(BtClassExample example);

    int deleteByExample(BtClassExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BtClass record);

    int insertSelective(BtClass record);

    List<BtClass> selectByExample(BtClassExample example);

    BtClass selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BtClass record, @Param("example") BtClassExample example);

    int updateByExample(@Param("record") BtClass record, @Param("example") BtClassExample example);

    int updateByPrimaryKeySelective(BtClass record);

    int updateByPrimaryKey(BtClass record);

    List<BtClass> selectByTeacherid(@Param("teacherid") int teacherid);
}