package cn.edu.nwsuaf.entity;

import java.util.Date;

public class Helpsummary {
    private Integer id;

    private Integer helpid;

    private String helpresult;

    private Date summarydate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHelpid() {
        return helpid;
    }

    public void setHelpid(Integer helpid) {
        this.helpid = helpid;
    }

    public String getHelpresult() {
        return helpresult;
    }

    public void setHelpresult(String helpresult) {
        this.helpresult = helpresult == null ? null : helpresult.trim();
    }

    public Date getSummarydate() {
        return summarydate;
    }

    public void setSummarydate(Date summarydate) {
        this.summarydate = summarydate;
    }
}