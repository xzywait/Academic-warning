package cn.edu.nwsuaf.service;

import java.util.List;

import cn.edu.nwsuaf.entity.Student;
import cn.edu.nwsuaf.entity.StudentExample;
import cn.edu.nwsuaf.entity.Sysuserinfo;
import cn.edu.nwsuaf.mapper.StudentMapper;
import cn.edu.nwsuaf.mapper.StudentwarningMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xzy on 2017/5/5.
 */
@Service
public class StudentService {
    @Autowired
    StudentMapper studentMapper;
    @Autowired
    StudentwarningMapper studentwarningMapper;


    public Student findByUser(Sysuserinfo sysuserinfo) {
        StudentExample studentExample = new StudentExample();
        studentExample.createCriteria().andUseridEqualTo(sysuserinfo.getId());
        return studentMapper.selectByExample(studentExample).get(0);
    }

    public Student findByUserId(int userid) {
        StudentExample example = new StudentExample();
        example.createCriteria().andUseridEqualTo(userid);
        List<Student> studentList = studentMapper.selectByExample(example);
        if (null != studentList && (!studentList.isEmpty())) {
            return studentList.get(0);
        }
        return null;
    }

    public Student findByPrimaryKey(int id) {
        return studentMapper.selectByPrimaryKey(id);
    }

}
