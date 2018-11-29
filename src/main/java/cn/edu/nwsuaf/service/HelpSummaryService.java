package cn.edu.nwsuaf.service;

import cn.edu.nwsuaf.entity.HelpsummaryWithBLOBs;
import cn.edu.nwsuaf.mapper.HelpsummaryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by xzy on 2017/5/17.
 */
@Service
public class HelpSummaryService {
    @Autowired
    private HelpsummaryMapper helpsummaryMapper;

    public int save(int helpid, String helpprocess, String helpresult, String helpsummary, Date summarydate) {
        HelpsummaryWithBLOBs helpsummaryWithBLOBs = new HelpsummaryWithBLOBs();
        helpsummaryWithBLOBs.setHelpid(helpid);
        helpsummaryWithBLOBs.setHelpprocess(helpprocess);
        helpsummaryWithBLOBs.setHelpresult(helpresult);
        helpsummaryWithBLOBs.setHelpsummary(helpsummary);
        helpsummaryWithBLOBs.setSummarydate(summarydate);
        return helpsummaryMapper.insert(helpsummaryWithBLOBs);
    }
}
