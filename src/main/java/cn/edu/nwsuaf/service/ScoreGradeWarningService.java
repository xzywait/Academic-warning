package cn.edu.nwsuaf.service;

import java.util.List;

import cn.edu.nwsuaf.entity.Scoregradewarning;
import cn.edu.nwsuaf.entity.ScoregradewarningExample;
import cn.edu.nwsuaf.mapper.ScoregradewarningMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xzy on 2017/5/6.
 */
@Service
public class ScoreGradeWarningService {
    @Autowired
    private ScoregradewarningMapper scoregradewarningMapper;

    public List<Scoregradewarning> getWarningStandardByRemark(String remark) {
        ScoregradewarningExample example = new ScoregradewarningExample();
        example.createCriteria().andRemarkEqualTo(remark);
        return scoregradewarningMapper.selectByExample(example);
    }

    public String getWarninglevelbyScore(float score) {
        if (score < 65.0) {
            return "红色";
        } else if (score < 68.0) {
            return "橙色";
        } else if (score < 70.0) {
            return "黄色";
        } else {
            return null;
        }
    }

}
