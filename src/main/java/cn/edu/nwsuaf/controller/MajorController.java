package cn.edu.nwsuaf.controller;

import cn.edu.nwsuaf.entity.BtMajor;
import cn.edu.nwsuaf.service.MajorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by xzy on 2017/5/6.
 */
@Controller
@RequestMapping("/major")
public class MajorController {
    @Autowired
    private MajorService majorService;

    @RequestMapping("/{majorid}")
    @ResponseBody
    public BtMajor getMajor(@PathVariable int majorid) {
        return majorService.getMajorByid(majorid);
    }
}
