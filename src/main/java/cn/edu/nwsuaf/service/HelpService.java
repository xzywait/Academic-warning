package cn.edu.nwsuaf.service;

import cn.edu.nwsuaf.mapper.HelpMapper;
import cn.edu.nwsuaf.model.HelpDetailModel;
import cn.edu.nwsuaf.model.HelpModel;
import cn.edu.nwsuaf.model.HelpSummaryDetailModel;
import cn.edu.nwsuaf.model.HelpSummaryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xzy on 2017/5/15.
 */
@Service
public class HelpService {
    @Autowired
    private HelpMapper helpMapper;

    public List<HelpModel> getHelpModelByStudentId(int studentid) {
        return helpMapper.getHelpModelByStudentId(studentid);
    }

    public List<HelpDetailModel> getHelpDetailModelByStudentId(int studentid, int helpid) {
        return helpMapper.getHelpDetailModelByStudentId(studentid, helpid);
    }

    public List<HelpSummaryModel> getHelpSummaryModelByStudentId(int studentid) {
        return helpMapper.getHelpSummaryModelByStudentId(studentid);
    }

    public List<HelpSummaryDetailModel> getHelpSummaryDetailModelByStudentId(int studentid, int helpsummaryid) {
        return helpMapper.getHelpSummaryDetailModelByStudentId(studentid, helpsummaryid);
    }
}
