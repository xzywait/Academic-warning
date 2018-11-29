package cn.edu.nwsuaf.controller;

import cn.edu.nwsuaf.entity.BtClass;
import cn.edu.nwsuaf.entity.BtDepartment;
import cn.edu.nwsuaf.entity.Student;
import cn.edu.nwsuaf.entity.Teacher;
import cn.edu.nwsuaf.service.ClassService;
import cn.edu.nwsuaf.service.DepartmentService;
import cn.edu.nwsuaf.service.OpenCourseService;
import cn.edu.nwsuaf.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xzy on 2017/5/13.
 */
@Controller
public class TeacherController {
    @Autowired
    private TeacherService teacherService;
    @Autowired
    private OpenCourseService openCourseService;
    @Autowired
    private ClassService classService;
    @Autowired
    private DepartmentService departmentService;

    @RequestMapping("/teacher/{id}")
    @ResponseBody
    public Map<String, Object> getStudentById(@PathVariable int id, HttpSession session) {
        Teacher teacher = teacherService.getTeacherById(id);
        BtDepartment btDepartment = departmentService.getDepartmentByID(teacher.getDepartmentid());

        List<BtClass> classList = classService.getClassByTeacherId(id);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("teacher", teacher);
        map.put("btclass", classList);
        session.setAttribute("btclass", classList);
        map.put("btDepartment", btDepartment);
        return map;
    }

    @RequestMapping("/teacher/getWarningStudent")
    @ResponseBody
    public List<Student> getWarningStudentByClassId(@RequestParam("classid") int classid, @RequestParam(value = "studentname", required = false) String studentname) {
        return teacherService.selectwarningstudentbyclassid(classid, studentname);
    }
}
