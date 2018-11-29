package cn.edu.nwsuaf.controller;

import cn.edu.nwsuaf.entity.BtClass;
import cn.edu.nwsuaf.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by xzy on 2017/5/6.
 */
@Controller
@RequestMapping("/class")
public class ClassController {
    @Autowired
    private ClassService classService;

    @RequestMapping("/{id}")
    @ResponseBody
    public BtClass getClassById(@PathVariable int id) {
        return classService.getClassByid(id);
    }
}
