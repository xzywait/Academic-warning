package cn.edu.nwsuaf.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.edu.nwsuaf.entity.Averagescore;
import cn.edu.nwsuaf.entity.Scoregradewarning;
import cn.edu.nwsuaf.entity.StudentwarningExample;
import cn.edu.nwsuaf.entity.Warninglevel;
import cn.edu.nwsuaf.model.WarningModel;
import cn.edu.nwsuaf.service.AveragescoreService;
import cn.edu.nwsuaf.service.ScoreGradeWarningService;
import cn.edu.nwsuaf.service.SemesterService;
import cn.edu.nwsuaf.service.SpetsService;
import cn.edu.nwsuaf.service.StudentWarningService;
import cn.edu.nwsuaf.service.WarningLevelService;
import cn.edu.nwsuaf.service.WarningTypeServie;
import cn.edu.nwsuaf.service.YearService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by xzy on 2017/5/6.
 */

/**
 * 学业预警标准
 */
@Controller
public class WarningStandardController {
    @Autowired
    private ScoreGradeWarningService scoreGradeWarningService;
    @Autowired
    private WarningLevelService warningLevelService;
    @Autowired
    private SemesterService semesterService;
    @Autowired
    private YearService yearService;
    @Autowired
    private AveragescoreService averagescoreService;
    @Autowired
    private WarningTypeServie warningTypeServie;
    @Autowired
    private SpetsService spetsService;
    @Autowired
    private StudentWarningService studentWarningService;

    @RequestMapping("/warningstandard")
    @ResponseBody
    public Map<String, Object> getWarningStandardByRemark(@RequestParam String remark) {
        Map<String, Object> map = new HashMap<String, Object>();
        List<Scoregradewarning> list = scoreGradeWarningService.getWarningStandardByRemark(remark);
        for (Scoregradewarning sw : list) {
            Warninglevel warninglevel = warningLevelService.getWarninglevelById(sw.getWarninglevelid());
            map.put(warninglevel.getWarninglevelname(), sw);
        }
        return map;
    }

    /**
     * 平均学分预警类
     *
     * @param studentid
     * @return
     */

    @RequestMapping("/averagescorewarn/{studentid}")
    @ResponseBody
    public List<WarningModel> getveragescorewarnbystudentid(@PathVariable int studentid) {
        List<Averagescore> averagescoreList = averagescoreService.getAveragescoreByStudentid(studentid);
        List<WarningModel> warningModelList = new ArrayList<WarningModel>();
        for (Averagescore averagescore : averagescoreList) {
            WarningModel model = new WarningModel();
            model.setWarningType("成绩预警");
            model.setWarningLevel(scoreGradeWarningService.getWarninglevelbyScore(averagescore.getAveragecreditscore()));
            model.setWarningyear(yearService.getYearById(averagescore.getYearid()).getYearname());
            model.setWarningSemester(semesterService.getSemesterById(averagescore.getSemesterid()).getSemestername());
            model.setWaringDate(averagescore.getStatisticstime());
            warningModelList.add(model);
        }
        return warningModelList;
    }

    /**
     * 所修学分预警
     *
     * @param studentid
     * @return
     * @throws ParseException
     */
    @RequestMapping("/creditwarn/{studentid}")
    @ResponseBody
    public List<WarningModel> getCreditWarnByStudentId(@PathVariable int studentid) throws ParseException {
        // TODO: 2017/5/11
        StudentwarningExample studentwarningExample = new StudentwarningExample();
        studentwarningExample.setOrderByClause("warningdate desc");
        studentwarningExample.createCriteria().andWarningtypeidEqualTo(1).andStudentidEqualTo(studentid);
        return studentWarningService.getWarningModelByExample(studentwarningExample);

    }

    /**
     * 其他类预警
     *
     * @param studentid
     * @return
     * @throws ParseException
     */
    @RequestMapping("/otherwarning/{studentid}")
    @ResponseBody
    public List<WarningModel> getOtherWarningByStudentId(@PathVariable int studentid) throws ParseException {
        // TODO: 2017/5/11
        StudentwarningExample studentwarningExample = new StudentwarningExample();
        studentwarningExample.setOrderByClause("warningdate desc");
        studentwarningExample.createCriteria().andWarningtypeidEqualTo(2).andStudentidEqualTo(studentid);
        return studentWarningService.getWarningModelByExample(studentwarningExample);

    }

    /**
     * 四六级预警
     *
     * @param studentid
     * @return
     * @throws ParseException
     */
    @RequestMapping("/spetswarning/{studentid}")
    @ResponseBody
    public List<WarningModel> getSpetsWarniByStudentId(@PathVariable int studentid) throws ParseException {
        // TODO: 2017/5/11 
        List<WarningModel> warningModelList = new ArrayList<WarningModel>();

        WarningModel model = new WarningModel();
        model.setWarningType("四级预警");
        model.setWarningLevel("红色");
        model.setWarningyear("2017");
        model.setWarningSemester("春");
        model.setWaringDate(new SimpleDateFormat("yyyy年MM月dd日").parse("2017年04月23日"));
        warningModelList.add(model);
        WarningModel model1 = new WarningModel();
        model1.setWarningType("四级预警");
        model1.setWarningLevel("橙色");
        model1.setWarningyear("2016");
        model1.setWarningSemester("秋");
        model1.setWaringDate(new SimpleDateFormat("yyyy年MM月dd日").parse("2016年10月26日"));
        warningModelList.add(model1);
        WarningModel model2 = new WarningModel();
        model2.setWarningType("四级预警");
        model2.setWarningLevel("黄色");
        model2.setWarningyear("2016");
        model2.setWarningSemester("春");
        model2.setWaringDate(new SimpleDateFormat("yyyy年MM月dd日").parse("2016年04月21日"));
        warningModelList.add(model2);
        return warningModelList;
    }

    /**
     * 首页红色、黄色、橙色
     *
     * @param studentid
     * @param warninglevelid
     * @return
     */
    @RequestMapping("/warninglevel/{studentid}")
    @ResponseBody
    public List<WarningModel> getWarningModelByType(@PathVariable int studentid, @RequestParam("warninglevelid") int warninglevelid) {
        StudentwarningExample studentwarningExample = new StudentwarningExample();
        studentwarningExample.createCriteria().andStudentidEqualTo(studentid).andWarninglevelidEqualTo(warninglevelid);
        return studentWarningService.getWarningModelByExample(studentwarningExample);
    }
}




