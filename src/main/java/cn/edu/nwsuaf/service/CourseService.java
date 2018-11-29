package cn.edu.nwsuaf.service;

import cn.edu.nwsuaf.entity.BtCourse;
import cn.edu.nwsuaf.mapper.BtCourseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xzy on 2017/5/6.
 */
@Service
public class CourseService {
    @Autowired
    private BtCourseMapper courseMapper;

    public BtCourse getCourseById(int id) {

        return courseMapper.selectByPrimaryKey(id);
    }
}
