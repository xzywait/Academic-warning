package cn.edu.nwsuaf.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.edu.nwsuaf.model.AbsentCourseModel;
import cn.edu.nwsuaf.model.AbsentExamModel;
import cn.edu.nwsuaf.model.UsuallyWarnModel;
import cn.edu.nwsuaf.service.ProcessWarningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by xzy on 2017/5/7.
 */
@Controller
public class ProcessWarningController {
    @Autowired
    private ProcessWarningService processWarningService;

    @RequestMapping("/processwarning")
    @ResponseBody
    public Map<String, Object> getProcessWarningByStudentId(int studentid) {
        Map<String, Object> map = new HashMap<String, Object>();
        List<UsuallyWarnModel> usuallyWarnModelList =
                processWarningService.findUsualWarnModelByStudentId(studentid);
        List<AbsentExamModel> absentExamModelList =
                processWarningService.findAbsentExamModelByStudentId(studentid);
        List<AbsentCourseModel> absentCourseModelList =
                processWarningService.findAbsentCourseWarningByStudentId(studentid);


        map.put("usual", usuallyWarnModelList);
        map.put("course", absentCourseModelList);
        map.put("exam", absentExamModelList);

        return map;
    }
}
