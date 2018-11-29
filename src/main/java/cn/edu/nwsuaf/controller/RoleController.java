package cn.edu.nwsuaf.controller;

import cn.edu.nwsuaf.entity.Sysrole;
import cn.edu.nwsuaf.service.SysroleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * Created by xzy on 2017/6/1.
 */
@Controller
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private SysroleService sysroleService;

    @RequestMapping("/add")
    public String addRole(@ModelAttribute Sysrole sysrole) {
        sysroleService.addRole(sysrole);
        return "redirect:/page/index/administratorindex.jsp";
    }

    @RequestMapping("/list")
    public String listRole(HttpSession session) {
        session.setAttribute("roleList", sysroleService.listRole());
        return "redirect:/page/index/administratorindex.jsp";
    }
}
