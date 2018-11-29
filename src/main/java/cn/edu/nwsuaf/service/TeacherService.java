package cn.edu.nwsuaf.service;

import cn.edu.nwsuaf.entity.Student;
import cn.edu.nwsuaf.entity.Sysuserinfo;
import cn.edu.nwsuaf.entity.Teacher;
import cn.edu.nwsuaf.entity.TeacherExample;
import cn.edu.nwsuaf.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xzy on 2017/5/5.
 */
@Service
public class TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;

    public Teacher findByUser(Sysuserinfo sysuserinfo) {
        TeacherExample teacherExample = new TeacherExample();
        teacherExample.createCriteria().andUseridEqualTo(sysuserinfo.getId());
        return teacherMapper.selectByExample(teacherExample).get(0);
    }

    public Teacher getTeacherById(int id) {
        return teacherMapper.selectByPrimaryKey(id);
    }

    public Teacher findByUserId(int userid) {
        TeacherExample example = new TeacherExample();
        example.createCriteria().andUseridEqualTo(userid);
        List<Teacher> teacherList = teacherMapper.selectByExample(example);
        if (null != teacherList && (!teacherList.isEmpty())) {
            return teacherList.get(0);
        }
        return null;
    }

    public Teacher getTeacherByPrimarykey(int id) {
        return teacherMapper.selectByPrimaryKey(id);
    }

    public List<Student> selectwarningstudentbyclassid(int classid, String studentname) {
        if (studentname.equals("")) {
            studentname = null;
        }
        return teacherMapper.selectwarningstudentbyclassid(classid, studentname);
    }
}
