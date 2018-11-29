package cn.edu.nwsuaf.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.edu.nwsuaf.entity.BtClass;
import cn.edu.nwsuaf.entity.BtDepartment;
import cn.edu.nwsuaf.entity.BtMajor;
import cn.edu.nwsuaf.entity.Student;
import cn.edu.nwsuaf.entity.StudentwarningExample;
import cn.edu.nwsuaf.service.ClassService;
import cn.edu.nwsuaf.service.DepartmentService;
import cn.edu.nwsuaf.service.MajorService;
import cn.edu.nwsuaf.service.StudentService;
import cn.edu.nwsuaf.service.StudentWarningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by xzy on 2017/4/25.
 */
@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private ClassService classService;
    @Autowired
    private MajorService majorService;
    @Autowired
    private DepartmentService departmentService;
    @Autowired
    private StudentWarningService studentWarningService;

    @RequestMapping("/student/{id}")
    @ResponseBody
    public Map<String, Object> getStudentById(@PathVariable int id) {
        Student student = studentService.findByPrimaryKey(id);
        BtClass btClass = classService.getClassByid(student.getClassid());
        BtMajor btMajor = majorService.getMajorByid(btClass.getMajorid());
        BtDepartment btDepartment = departmentService.getDepartmentByID(btMajor.getDepartmentid());
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("student", student);
        map.put("btclass", btClass);
        map.put("btmajor", btMajor);
        map.put("btDepartment", btDepartment);
        return map;
    }

    @RequestMapping("/warningtimes/{id}")
    @ResponseBody
    public List<Integer> getWarningTimesByParams(@PathVariable int id) {

        List<Integer> timesList = new ArrayList<Integer>();
        Calendar calendar = Calendar.getInstance();
        calendar.set(calendar.get(Calendar.YEAR) - 1, 0, 1);
        Date lastyear = calendar.getTime();
        System.out.print(new SimpleDateFormat("yyyy-mm-dd").format(lastyear));
        StudentwarningExample example1 = new StudentwarningExample();
        example1.createCriteria().andStudentidEqualTo(id).andWarningtypeidEqualTo(1).andWarningdateBetween(lastyear, new Date());
        StudentwarningExample example2 = new StudentwarningExample();
        example2.createCriteria().andStudentidEqualTo(id).andWarningtypeidEqualTo(2).andWarningdateBetween(lastyear, new Date());
        StudentwarningExample example3 = new StudentwarningExample();
        example3.createCriteria().andStudentidEqualTo(id).andWarningtypeidEqualTo(1);
        StudentwarningExample example4 = new StudentwarningExample();
        example4.createCriteria().andStudentidEqualTo(id).andWarningtypeidEqualTo(2);
        timesList.add(studentWarningService.getCountsbyExample(example1));
        timesList.add(studentWarningService.getCountsbyExample(example2));

        timesList.add(studentWarningService.getCountsbyExample(example3));
        timesList.add(studentWarningService.getCountsbyExample(example4));

        return timesList;
    }
}
