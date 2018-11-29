package cn.edu.nwsuaf.service;

import java.util.List;

import cn.edu.nwsuaf.entity.Spets;
import cn.edu.nwsuaf.entity.SpetsExample;
import cn.edu.nwsuaf.mapper.SpetsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xzy on 2017/5/8.
 */
@Service
public class SpetsService {
    @Autowired
    private SpetsMapper spetsMapper;

    public List<Spets> getSpetsByStudentId(int studentid) {
        SpetsExample example = new SpetsExample();
        example.setOrderByClause("spetstime desc");
        example.createCriteria().andStudentidEqualTo(studentid);
        return spetsMapper.selectByExample(example);
    }
}
