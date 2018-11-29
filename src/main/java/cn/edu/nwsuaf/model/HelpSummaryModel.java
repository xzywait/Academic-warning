package cn.edu.nwsuaf.model;

import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by xzy on 2017/5/17.
 */
@Component
public class HelpSummaryModel {
    private int helpSummaryId;
    private String warningtypename;
    private String warninglevelname;
    private Date summarydate;
    private String yearname;
    private String semestername;

    public int getHelpSummaryId() {
        return helpSummaryId;
    }

    public void setHelpSummaryId(int helpSummaryId) {
        this.helpSummaryId = helpSummaryId;
    }

    public String getWarningtypename() {
        return warningtypename;
    }

    public void setWarningtypename(String warningtypename) {
        this.warningtypename = warningtypename;
    }

    public String getWarninglevelname() {
        return warninglevelname;
    }

    public void setWarninglevelname(String warninglevelname) {
        this.warninglevelname = warninglevelname;
    }

    public Date getSummarydate() {
        return summarydate;
    }

    public void setSummarydate(Date summarydate) {
        this.summarydate = summarydate;
    }

    public String getYearname() {
        return yearname;
    }

    public void setYearname(String yearname) {
        this.yearname = yearname;
    }

    public String getSemestername() {
        return semestername;
    }

    public void setSemestername(String semestername) {
        this.semestername = semestername;
    }
}
