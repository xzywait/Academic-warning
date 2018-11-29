package cn.edu.nwsuaf.service;

import java.util.List;

import cn.edu.nwsuaf.entity.BtStudentteacheringplan;
import cn.edu.nwsuaf.entity.BtStudentteacheringplanExample;
import cn.edu.nwsuaf.mapper.BtStudentteacheringplanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xzy on 2017/5/6.
 */
@Service
public class StudentTeachPlanService {
    @Autowired
    private BtStudentteacheringplanMapper studentteacheringplanMapper;

    /**
     * 获取总共需要修的学分
     *
     * @param studentid
     * @return
     */
    public int getTotalRequireScoreByStudentId(int studentid) {
        BtStudentteacheringplanExample example = new BtStudentteacheringplanExample();
        example.createCriteria().andStudentidEqualTo(studentid);

        List<BtStudentteacheringplan> list = studentteacheringplanMapper.selectByExample(example);
        System.out.println(list.size() + "条数据");
        int totalScore = 0;
        for (BtStudentteacheringplan plan : list) {
            totalScore += plan.getScorerequire();
        }
        return totalScore;
    }
}
