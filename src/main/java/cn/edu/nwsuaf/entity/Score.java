package cn.edu.nwsuaf.entity;

import java.util.Date;

public class Score {
    private Integer id;

    private Integer opencourseid;

    private Integer scoremarkid;

    private Integer studentid;

    private Float totalscore;

    private Float finalscore;

    private Float dailyscore;

    private Date statisticsdate;

    private String passremark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOpencourseid() {
        return opencourseid;
    }

    public void setOpencourseid(Integer opencourseid) {
        this.opencourseid = opencourseid;
    }

    public Integer getScoremarkid() {
        return scoremarkid;
    }

    public void setScoremarkid(Integer scoremarkid) {
        this.scoremarkid = scoremarkid;
    }

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public Float getTotalscore() {
        return totalscore;
    }

    public void setTotalscore(Float totalscore) {
        this.totalscore = totalscore;
    }

    public Float getFinalscore() {
        return finalscore;
    }

    public void setFinalscore(Float finalscore) {
        this.finalscore = finalscore;
    }

    public Float getDailyscore() {
        return dailyscore;
    }

    public void setDailyscore(Float dailyscore) {
        this.dailyscore = dailyscore;
    }

    public Date getStatisticsdate() {
        return statisticsdate;
    }

    public void setStatisticsdate(Date statisticsdate) {
        this.statisticsdate = statisticsdate;
    }

    public String getPassremark() {
        return passremark;
    }

    public void setPassremark(String passremark) {
        this.passremark = passremark == null ? null : passremark.trim();
    }
}