package cn.edu.nwsuaf.mapper;

import java.util.List;

import cn.edu.nwsuaf.entity.Score;
import cn.edu.nwsuaf.entity.ScoreExample;
import cn.edu.nwsuaf.model.CourseTuple;
import org.apache.ibatis.annotations.Param;

public interface ScoreMapper {
    int countByExample(ScoreExample example);

    int deleteByExample(ScoreExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Score record);

    int insertSelective(Score record);

    List<Score> selectByExample(ScoreExample example);

    Score selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Score record, @Param("example") ScoreExample example);

    int updateByExample(@Param("record") Score record, @Param("example") ScoreExample example);

    int updateByPrimaryKeySelective(Score record);

    int updateByPrimaryKey(Score record);

    List<CourseTuple> selectPassedNumAndCredit(@Param("studentid") int studentid,
                                               @Param("yearname") String yearname,
                                               @Param("semestername") String semestername,
                                               @Param("coursenaturename") String coursenaturename);

    List<CourseTuple> selectSelectedNumAndCredit(@Param("studentid") int studentid,
                                                 @Param("yearname") String yearname,
                                                 @Param("semestername") String semestername,
                                                 @Param("coursenaturename") String coursenaturename);

}