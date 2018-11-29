package cn.edu.nwsuaf.service;

import cn.edu.nwsuaf.entity.BtDepartment;
import cn.edu.nwsuaf.mapper.BtDepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xzy on 2017/5/6.
 */
@Service
public class DepartmentService {
    @Autowired
    private BtDepartmentMapper departmentMapper;

    public BtDepartment getDepartmentByID(int id) {
        return departmentMapper.selectByPrimaryKey(id);
    }
}
