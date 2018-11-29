package cn.edu.nwsuaf.controller;

import cn.edu.nwsuaf.service.AbsentCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by xzy on 2017/5/9.
 */
@Controller
@RequestMapping("/absentCourse")
public class AbsentCourseRecordController {

    @Autowired
    private AbsentCourseService absentCourseService;


    @RequestMapping("/addRecord")
    @ResponseBody
    public int addRecord(@RequestParam("studentnumber") String studentnumber
            , @RequestParam("coursename") String coursename
            , @RequestParam("classname") String classname
            , @RequestParam("absenttimes") int absenttimes
            , @RequestParam("warninglevelname") String warninglevelname
            , @RequestParam("teacherid") int teacherid) {

        return absentCourseService.save(studentnumber, coursename, absenttimes, warninglevelname, teacherid, classname);

    }
}
