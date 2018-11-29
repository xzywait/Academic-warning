package cn.edu.nwsuaf.model;

import org.springframework.stereotype.Component;

/**
 * Created by xzy on 2017/5/15.
 */
@Component
public class HelpModel {


    private int helpid;
    private String helppeoplename;
    private String warningtypename;
    private String warninglevelname;
    private String helpplan;
    private String helpresult;

    public int getHelpid() {
        return helpid;
    }

    public void setHelpid(int helpid) {
        this.helpid = helpid;
    }

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

    public String getHelpresult() {
        return helpresult;
    }

    public void setHelpresult(String helpresult) {
        this.helpresult = helpresult;
    }
}
