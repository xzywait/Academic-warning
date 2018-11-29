package cn.edu.nwsuaf.controller;

import cn.edu.nwsuaf.entity.Student;
import cn.edu.nwsuaf.entity.Sysrole;
import cn.edu.nwsuaf.entity.Sysuserinfo;
import cn.edu.nwsuaf.entity.Teacher;
import cn.edu.nwsuaf.service.ClassService;
import cn.edu.nwsuaf.service.DepartmentService;
import cn.edu.nwsuaf.service.LoginService;
import cn.edu.nwsuaf.service.MajorService;
import cn.edu.nwsuaf.service.StudentService;
import cn.edu.nwsuaf.service.SysroleService;
import cn.edu.nwsuaf.service.TeacherService;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by xzy on 2017/5/4.
 */
@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;
    @Autowired
    private StudentService studentService;
    @Autowired
    private TeacherService teacherService;
    @Autowired
    private ClassService classService;
    @Autowired
    private MajorService majorService;
    @Autowired
    private DepartmentService departmentService;
    @Autowired
    private SysroleService sysroleService;

    @RequestMapping(value = "login")
    public String login(@RequestParam(value = "username") String username,
                        @RequestParam(value = "password") String password,
                        HttpSession session) {
        Sysuserinfo sysuserinfo = loginService.logincheck(username, password);
        if (sysuserinfo != null) {
            Sysrole sysrole = sysroleService.getRoleById(sysuserinfo.getRoleid());

            switch (sysrole.getRolename()) {
                case "学生":
                    Student student = studentService.findByUser(sysuserinfo);
                    session.setAttribute("student", student);
                    break;
                case "教师":
                    Teacher teacher = teacherService.findByUser(sysuserinfo);
                    session.setAttribute("teacher", teacher);
                    break;
                default:
                    Teacher defaultTeacher = teacherService.findByUser(sysuserinfo);
                    session.setAttribute("teacher", defaultTeacher);

            }
            return "redirect:" + sysrole.getRoleindexpage();
        } else {

            return "redirect:/index.jsp";
        }

    }
}
