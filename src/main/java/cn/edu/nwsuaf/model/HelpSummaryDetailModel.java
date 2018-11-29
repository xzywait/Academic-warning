package cn.edu.nwsuaf.model;

import org.springframework.stereotype.Component;

/**
 * Created by xzy on 2017/5/17.
 */
@Component
public class HelpSummaryDetailModel {
    private String helppeoplename;
    private String warningtypename;
    private String warninglevelname;
    private String yearname;
    private String semestername;
    private String helpprocess;
    private String helpresult;
    private String helpsummary;

    public String getWarningtypename() {
        return warningtypename;
    }

    public void setWarningtypename(String warningtypename) {
        this.warningtypename = warningtypename;
    }

    public String getHelppeoplename() {
        return helppeoplename;
    }

    public void setHelppeoplename(String helppeoplename) {
        this.helppeoplename = helppeoplename;
    }

    public String getWarninglevelname() {
        return warninglevelname;
    }

    public void setWarninglevelname(String warninglevelname) {
        this.warninglevelname = warninglevelname;
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

    public String getHelpprocess() {
        return helpprocess;
    }

    public void setHelpprocess(String helpprocess) {
        this.helpprocess = helpprocess;
    }

    public String getHelpresult() {
        return helpresult;
    }

    public void setHelpresult(String helpresult) {
        this.helpresult = helpresult;
    }

    public String getHelpsummary() {
        return helpsummary;
    }

    public void setHelpsummary(String helpsummary) {
        this.helpsummary = helpsummary;
    }
}
