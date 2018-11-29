package cn.edu.nwsuaf.service;

import java.util.List;

import cn.edu.nwsuaf.entity.Student;
import cn.edu.nwsuaf.entity.StudentExample;
import cn.edu.nwsuaf.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xzy on 2017/4/25.
 */
@Service
public class TestService {
    @Autowired
    private StudentMapper studentMapper;

    public Student getStudentById(int stuId) {
        StudentExample example = new StudentExample();
        StudentExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(stuId);
        List<Student> list = studentMapper.selectByExample(example);
        if (list != null && list.size() > 0) {
            Student student = list.get(0);
            return student;
        }

        return null;
    }
}
