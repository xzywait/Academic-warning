package cn.edu.nwsuaf.service;

import java.util.List;

import cn.edu.nwsuaf.entity.ParentExample;
import cn.edu.nwsuaf.entity.StudentExample;
import cn.edu.nwsuaf.entity.Sysuserinfo;
import cn.edu.nwsuaf.entity.SysuserinfoExample;
import cn.edu.nwsuaf.entity.TeacherExample;
import cn.edu.nwsuaf.mapper.ParentMapper;
import cn.edu.nwsuaf.mapper.StudentMapper;
import cn.edu.nwsuaf.mapper.SysroleMapper;
import cn.edu.nwsuaf.mapper.SysuserinfoMapper;
import cn.edu.nwsuaf.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xzy on 2017/5/5.
 */
@Service
public class LoginService {
    @Autowired
    SysuserinfoMapper sysuserinfoMapper;
    @Autowired
    StudentMapper studentMapper;
    @Autowired
    TeacherMapper teacherMapper;
    @Autowired
    ParentMapper parentMapper;
    @Autowired
    SysroleMapper sysroleMapper;


    public Sysuserinfo logincheck(String username, String password) {
        //验证用户名和密码
        SysuserinfoExample sysuserinfoExample = new SysuserinfoExample();
        sysuserinfoExample.createCriteria().andUsernameEqualTo(username)
                .andPasswordEqualTo(password);
        List<Sysuserinfo> sysuserinfoList = sysuserinfoMapper
                .selectByExample(sysuserinfoExample);
        if (sysuserinfoList.size() > 0) {
            return sysuserinfoList.get(0);
        } else {
            return null;
        }
    }

    public Object getRealRole(Sysuserinfo sysuserinfo) {
        int roleid = sysuserinfo.getRoleid();
        String role = sysroleMapper.selectByPrimaryKey(roleid).getRolename();
        if (role.equals("学生")) {
            StudentExample studentExample = new StudentExample();
            studentExample.createCriteria().andUseridEqualTo(sysuserinfo.getId());
            return studentMapper.selectByExample(studentExample).get(0);
        } else if (role.equals("教师")) {
            TeacherExample teacherExample = new TeacherExample();
            teacherExample.createCriteria().andUseridEqualTo(sysuserinfo.getId());
            return teacherMapper.selectByExample(teacherExample).get(0);
        } else if (role.equals("家长")) {
            ParentExample parentExample = new ParentExample();
            parentExample.createCriteria().andUseridEqualTo(sysuserinfo.getId());
            return parentMapper.selectByExample(parentExample).get(0);
        } else {
            //以后再加
            return null;
        }

    }
}
