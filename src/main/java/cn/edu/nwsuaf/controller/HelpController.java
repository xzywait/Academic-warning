package cn.edu.nwsuaf.controller;

import cn.edu.nwsuaf.model.HelpDetailModel;
import cn.edu.nwsuaf.model.HelpModel;
import cn.edu.nwsuaf.model.HelpSummaryDetailModel;
import cn.edu.nwsuaf.model.HelpSummaryModel;
import cn.edu.nwsuaf.service.HelpService;
import cn.edu.nwsuaf.service.HelpSummaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

/**
 * Created by xzy on 2017/5/15.
 */
@Controller
public class HelpController {
    @Autowired
    private HelpService helpService;
    @Autowired
    private HelpSummaryService helpSummaryService;

    /**
     * 通过学生id获取帮扶列表
     *
     * @param studentid
     * @return
     */
    @RequestMapping("/help/{studentid}")
    @ResponseBody
    public List<HelpModel> getHelpModelByStudentId(@PathVariable int studentid) {
        return helpService.getHelpModelByStudentId(studentid);
    }

    /**
     * 通过学生id和帮扶id
     * 获取学生帮扶详细
     *
     * @param studentid
     * @param helpid
     * @return
     */
    @RequestMapping("/helpdetail/{studentid}")
    @ResponseBody
    public HelpDetailModel getHelpDetailModelByStudentId(@PathVariable int studentid,
                                                         @RequestParam("helpid") int helpid) {
        return helpService.getHelpDetailModelByStudentId(studentid, helpid).get(0);
    }

    /**
     * 通过学生id获取学生帮扶总结
     *
     * @param studentid
     * @return
     */
    @RequestMapping("/helpsummary/{studentid}")
    @ResponseBody
    public List<HelpSummaryModel> getHelpSummaryModelByStudentId(@PathVariable int studentid) {
        return helpService.getHelpSummaryModelByStudentId(studentid);
    }

    /**
     * 通过学生id和帮扶总结id获取
     * 单个帮扶总结
     *
     * @param studentid
     * @param helpsummaryid
     * @return
     */
    @RequestMapping("/helpsummarydetail/{studentid}")
    @ResponseBody
    public HelpSummaryDetailModel getHelpSummaryDetailModelByStudentId(@PathVariable int studentid,
                                                                       @RequestParam("helpsummaryid") int helpsummaryid) {
        return helpService.getHelpSummaryDetailModelByStudentId(studentid, helpsummaryid).get(0);
    }

    /**
     * 学编写帮扶总结
     *
     * @param helpid
     * @param helpprocess
     * @param helpresult
     * @param helpsummary
     * @return
     */
    @RequestMapping(value = "/helpsummary/add")
    @ResponseBody
    public int save(@RequestParam("helpid") int helpid,
                    @RequestParam("helpprocess") String helpprocess,
                    @RequestParam("helpresult") String helpresult,
                    @RequestParam("helpsummary") String helpsummary) {
        Date date = new Date();
        return helpSummaryService.save(helpid, helpprocess, helpresult, helpsummary, date);
    }

}
