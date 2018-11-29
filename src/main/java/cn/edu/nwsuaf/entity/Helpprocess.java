package cn.edu.nwsuaf.entity;

import java.util.Date;

public class Helpprocess {
    private Integer id;

    private Integer helpid;

    private Integer helpformid;

    private Date helpdate;

    private String helpplace;

    private String problemanalyse;

    private String stageresult;

    private String effect;

    private String measures;

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

    public Integer getHelpformid() {
        return helpformid;
    }

    public void setHelpformid(Integer helpformid) {
        this.helpformid = helpformid;
    }

    public Date getHelpdate() {
        return helpdate;
    }

    public void setHelpdate(Date helpdate) {
        this.helpdate = helpdate;
    }

    public String getHelpplace() {
        return helpplace;
    }

    public void setHelpplace(String helpplace) {
        this.helpplace = helpplace == null ? null : helpplace.trim();
    }

    public String getProblemanalyse() {
        return problemanalyse;
    }

    public void setProblemanalyse(String problemanalyse) {
        this.problemanalyse = problemanalyse == null ? null : problemanalyse.trim();
    }

    public String getStageresult() {
        return stageresult;
    }

    public void setStageresult(String stageresult) {
        this.stageresult = stageresult == null ? null : stageresult.trim();
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect == null ? null : effect.trim();
    }

    public String getMeasures() {
        return measures;
    }

    public void setMeasures(String measures) {
        this.measures = measures == null ? null : measures.trim();
    }
}