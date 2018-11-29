package cn.edu.nwsuaf.service;

import java.util.List;

import cn.edu.nwsuaf.entity.StudentwarningExample;
import cn.edu.nwsuaf.mapper.StudentwarningMapper;
import cn.edu.nwsuaf.model.WarningModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xzy on 2017/5/12.
 */
@Service
public class StudentWarningService {
    @Autowired
    private StudentwarningMapper studentwarningMapper;

    public int getCountWarning(StudentwarningExample studentwarningExample) {
        return studentwarningMapper.countByExample(studentwarningExample);
    }

    public List<WarningModel> getWarningModelByExample(StudentwarningExample studentwarningExample) {
        return studentwarningMapper.selectWarningModelByExample(studentwarningExample);
    }

    public Integer getCountsbyExample(StudentwarningExample studentwarningExample) {
        return studentwarningMapper.countByExample(studentwarningExample);
    }
}
