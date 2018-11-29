package cn.edu.nwsuaf.service;

import cn.edu.nwsuaf.entity.BtSemester;
import cn.edu.nwsuaf.mapper.BtSemesterMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xzy on 2017/5/6.
 */
@Service
public class SemesterService {
    @Autowired
    private BtSemesterMapper semesterMapper;

    public BtSemester getSemesterById(int id) {
        return semesterMapper.selectByPrimaryKey(id);
    }
}
