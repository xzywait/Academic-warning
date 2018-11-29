package cn.edu.nwsuaf.mapper;

import java.util.List;

import cn.edu.nwsuaf.entity.Attachmentsfile;
import cn.edu.nwsuaf.entity.AttachmentsfileExample;
import org.apache.ibatis.annotations.Param;

public interface AttachmentsfileMapper {
    int countByExample(AttachmentsfileExample example);

    int deleteByExample(AttachmentsfileExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Attachmentsfile record);

    int insertSelective(Attachmentsfile record);

    List<Attachmentsfile> selectByExample(AttachmentsfileExample example);

    Attachmentsfile selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Attachmentsfile record, @Param("example") AttachmentsfileExample example);

    int updateByExample(@Param("record") Attachmentsfile record, @Param("example") AttachmentsfileExample example);

    int updateByPrimaryKeySelective(Attachmentsfile record);

    int updateByPrimaryKey(Attachmentsfile record);
}