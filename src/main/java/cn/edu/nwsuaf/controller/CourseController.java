package cn.edu.nwsuaf.controller;

import cn.edu.nwsuaf.entity.BtCourse;
import cn.edu.nwsuaf.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by xzy on 2017/5/6.
 */
@Controller
public class CourseController {
    @Autowired
    private CourseService courseService;

    public BtCourse getCourseById(int id) {
        return courseService.getCourseById(id);
    }

}
