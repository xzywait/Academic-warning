package cn.edu.nwsuaf.mapper;

import cn.edu.nwsuaf.entity.Help;
import cn.edu.nwsuaf.entity.HelpExample;
import cn.edu.nwsuaf.model.HelpDetailModel;
import cn.edu.nwsuaf.model.HelpModel;
import cn.edu.nwsuaf.model.HelpSummaryDetailModel;
import cn.edu.nwsuaf.model.HelpSummaryModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HelpMapper {
    int countByExample(HelpExample example);

    int deleteByExample(HelpExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Help record);

    int insertSelective(Help record);

    List<Help> selectByExampleWithBLOBs(HelpExample example);

    List<Help> selectByExample(HelpExample example);

    Help selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Help record, @Param("example") HelpExample example);

    int updateByExampleWithBLOBs(@Param("record") Help record, @Param("example") HelpExample example);

    int updateByExample(@Param("record") Help record, @Param("example") HelpExample example);

    int updateByPrimaryKeySelective(Help record);

    int updateByPrimaryKeyWithBLOBs(Help record);

    int updateByPrimaryKey(Help record);

    List<HelpModel> getHelpModelByStudentId(@Param("studentid") int studentid);

    List<HelpDetailModel> getHelpDetailModelByStudentId(@Param("studentid") int studentid,
                                                        @Param("helpid") int helpid);

    List<HelpSummaryModel> getHelpSummaryModelByStudentId(@Param("studentid") int studentid);

    List<HelpSummaryDetailModel> getHelpSummaryDetailModelByStudentId(@Param("studentid") int studentid,
                                                                      @Param("helpsummaryid") int helpsummaryid);

}