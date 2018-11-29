package cn.edu.nwsuaf.service;

import java.util.List;

import cn.edu.nwsuaf.entity.Absentcoursewarning;
import cn.edu.nwsuaf.entity.AbsentcoursewarningExample;
import cn.edu.nwsuaf.entity.Absentexamwarning;
import cn.edu.nwsuaf.entity.AbsentexamwarningExample;
import cn.edu.nwsuaf.entity.Usuallycheckwanging;
import cn.edu.nwsuaf.entity.UsuallycheckwangingExample;
import cn.edu.nwsuaf.mapper.AbsentcoursewarningMapper;
import cn.edu.nwsuaf.mapper.AbsentexamwarningMapper;
import cn.edu.nwsuaf.mapper.UsuallycheckwangingMapper;
import cn.edu.nwsuaf.model.AbsentCourseModel;
import cn.edu.nwsuaf.model.AbsentExamModel;
import cn.edu.nwsuaf.model.UsuallyWarnModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xzy on 2017/5/7.
 */
@Service
public class ProcessWarningService {
    @Autowired
    private UsuallycheckwangingMapper usuallycheckwangingMapper;
    @Autowired
    private AbsentcoursewarningMapper absentcoursewarningMapper;
    @Autowired
    private AbsentexamwarningMapper absentexamwarningMapper;

    public List<Usuallycheckwanging> getUsuallyCheckWarnByStudentId(int studentid) {
        UsuallycheckwangingExample example = new UsuallycheckwangingExample();
        example.createCriteria().andStudentidEqualTo(studentid);
        return usuallycheckwangingMapper.selectByExample(example);
    }

    public List<UsuallyWarnModel> findUsualWarnModelByStudentId(int stduentid) {
        return usuallycheckwangingMapper.selectUsuallyWarnByStudentId(stduentid);
    }

    public List<Absentexamwarning> getAbsentExamWarningByStudentId(int studentid) {
        AbsentexamwarningExample example = new AbsentexamwarningExample();
        example.createCriteria().andStudentidEqualTo(studentid);
        return absentexamwarningMapper.selectByExample(example);
    }

    public List<AbsentExamModel> findAbsentExamModelByStudentId(int studentid) {
        return absentexamwarningMapper.selectAbsentExamWarnByStudentId(studentid);
    }

    public List<Absentcoursewarning> getAbsentCourseWarningByStudentId(int studentid) {
        AbsentcoursewarningExample example = new AbsentcoursewarningExample();
        example.createCriteria().andStudentidEqualTo(studentid);
        return absentcoursewarningMapper.selectByExample(example);
    }

    public List<AbsentCourseModel> findAbsentCourseWarningByStudentId(int studentid) {
        return absentcoursewarningMapper.selectAbsentCourseWarnByStudentId(studentid);
    }

}
