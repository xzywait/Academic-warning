package cn.edu.nwsuaf.service;

import java.util.List;

import cn.edu.nwsuaf.entity.Averagescore;
import cn.edu.nwsuaf.entity.AveragescoreExample;
import cn.edu.nwsuaf.mapper.AveragescoreMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xzy on 2017/5/11.
 */
@Service
public class AveragescoreService {
    @Autowired
    private AveragescoreMapper averagescoreMapper;

    public List<Averagescore> getAveragescoreByStudentid(int studentid) {
        AveragescoreExample example = new AveragescoreExample();
        example.createCriteria().andStudentidEqualTo(studentid);
        example.setOrderByClause("statisticstime desc");
        return averagescoreMapper.selectByExample(example);
    }

}
