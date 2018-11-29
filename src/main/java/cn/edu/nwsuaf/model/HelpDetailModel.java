package cn.edu.nwsuaf.model;

import org.springframework.stereotype.Component;

/**
 * Created by xzy on 2017/5/17.
 */
@Component
public class HelpDetailModel {
    private String helppeoplename;
    private String warningtypename;
    private String warninglevelname;
    private String helpplan;
    private String measures;
    private String yearname;
    private String semestername;
    private String helpplace;
    private String helpresult;

    public String getHelppeoplename() {
        return helppeoplename;
    }

    public void setHelppeoplename(String helppeoplename) {
        this.helppeoplename = helppeoplename;
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

    public String getHelpplan() {
        return helpplan;
    }

    public void setHelpplan(String helpplan) {
        this.helpplan = helpplan;
    }

    public String getMeasures() {
        return measures;
    }

    public void setMeasures(String measures) {
        this.measures = measures;
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

    public String getHelpplace() {
        return helpplace;
    }

    public void setHelpplace(String helpplace) {
        this.helpplace = helpplace;
    }

    public String getHelpresult() {
        return helpresult;
    }

    public void setHelpresult(String helpresult) {
        this.helpresult = helpresult;
    }
}
