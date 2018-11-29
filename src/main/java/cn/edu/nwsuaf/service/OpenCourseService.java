package cn.edu.nwsuaf.service;

import java.util.List;

import cn.edu.nwsuaf.entity.BtOpencourse;
import cn.edu.nwsuaf.entity.BtOpencourseExample;
import cn.edu.nwsuaf.mapper.BtOpencourseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xzy on 2017/5/6.
 */
@Service
public class OpenCourseService {
    @Autowired
    private BtOpencourseMapper opencourseMapper;

    public BtOpencourse getOpenCourseById(int id) {
        return opencourseMapper.selectByPrimaryKey(id);
    }

    public List<BtOpencourse> getOpenCoursesByExample(BtOpencourseExample opencourseExample) {
        return opencourseMapper.selectByExample(opencourseExample);
    }
}
