package cn.edu.nwsuaf.controller;

import cn.edu.nwsuaf.entity.Sysuserinfo;
import cn.edu.nwsuaf.entity.SysuserinfoExample;
import cn.edu.nwsuaf.entity.Sysuserscope;
import cn.edu.nwsuaf.entity.SysuserscopeExample;
import cn.edu.nwsuaf.service.UserScopeService;
import cn.edu.nwsuaf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xzy on 2017/5/31.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserScopeService scopeService;

    /**
     * 添加系统用户
     *
     * @param sysuserinfo
     * @return
     */
    @RequestMapping("/add")
    @ResponseBody
    public int addUser(@ModelAttribute Sysuserinfo sysuserinfo) {
        return userService.addUser(sysuserinfo);
    }

    /**
     * 添加用户管理范围
     *
     * @param sysuserinfo
     * @param scope
     * @return
     */
    @RequestMapping("/adduserscope")
    public String addRoleScope(@ModelAttribute Sysuserinfo sysuserinfo, @RequestParam("scope") String scope) {
        SysuserinfoExample example = new SysuserinfoExample();
        example.createCriteria().andUsernameEqualTo(sysuserinfo.getUsername());
        int userid = userService.selectByExample(example).get(0).getId();
        Sysuserscope userscope = new Sysuserscope();
        userscope.setUserid(userid);
        userscope.setScope(scope);
        scopeService.addUserScope(userscope);
        return "/index/administratorindex";
    }

    /**
     * 查询用户权限管理范围
     *
     * @param username
     * @param model
     * @return
     */
    @RequestMapping("/listuserscope")
    public String listUserScope(@RequestParam("username") String username, Model model) {
        SysuserinfoExample sysuserinfoExample = new SysuserinfoExample();
        sysuserinfoExample.createCriteria().andUsernameEqualTo(username);
        Sysuserinfo user = userService.selectByExample(sysuserinfoExample).get(0);
        SysuserscopeExample example = new SysuserscopeExample();
        example.createCriteria().andUseridEqualTo(user.getId());
        List<Sysuserscope> scopeList = scopeService.listByExample(example);
        List<String[]> resultList = new ArrayList<String[]>();
        for (Sysuserscope scope : scopeList) {
            String[] result = new String[2];
            result[0] = userService.selectById(scope.getUserid()).getUsername();
            result[1] = scope.getScope();
            resultList.add(result);
        }
        model.addAttribute("userscopeList", resultList);

        return "/index/administratorindex";
    }

}
