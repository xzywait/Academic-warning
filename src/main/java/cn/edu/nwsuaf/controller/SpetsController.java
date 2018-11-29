package cn.edu.nwsuaf.controller;

import java.util.List;

import cn.edu.nwsuaf.entity.Spets;
import cn.edu.nwsuaf.service.SpetsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by xzy on 2017/5/8.
 */
@Controller
public class SpetsController {
    @Autowired
    private SpetsService spetsService;

    @RequestMapping(value = "/spets")
    @ResponseBody
    public List<Spets> getSpetsByStudentId(@RequestParam(value = "studentid") int studentid) {
        return spetsService.getSpetsByStudentId(studentid);
    }
}
