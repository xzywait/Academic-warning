package cn.edu.nwsuaf.controller;

import java.util.List;

import cn.edu.nwsuaf.model.CourseTuple;
import cn.edu.nwsuaf.service.CourseStudyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by xzy on 2017/5/6.
 */
@Controller
public class StudentTeachPlanController {

    @Autowired
    private CourseStudyService courseStudyService;

    @RequestMapping("/courseStudy")
    @ResponseBody
    public List<CourseTuple> getCourseStudyTupleByParams(@RequestParam(value = "studentid", required = false) int studentid,
                                                         @RequestParam(value = "yearname", required = false) String yearname,
                                                         @RequestParam(value = "semestername", required = false) String semestername,
                                                         @RequestParam(value = "coursenaturename", required = false) String coursenaturename) {
        if ("".equals(coursenaturename)) {
            coursenaturename = null;
        }
        if ("".equals(yearname)) {
            yearname = null;
        }
        if ("".equals(semestername)) {
            semestername = null;
        }
        return courseStudyService.getCourseTupleByParams(studentid, yearname, semestername, coursenaturename);


    }

}
