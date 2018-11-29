package cn.edu.nwsuaf.controller;

import cn.edu.nwsuaf.entity.BtDepartment;
import cn.edu.nwsuaf.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by xzy on 2017/5/6.
 */
@Controller
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    public BtDepartment getDepartmentByID(int id) {
        return departmentService.getDepartmentByID(id);
    }
}
