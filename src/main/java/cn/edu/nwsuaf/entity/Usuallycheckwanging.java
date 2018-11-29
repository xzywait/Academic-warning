package cn.edu.nwsuaf.entity;

import java.util.Date;

public class Usuallycheckwanging {
    private Integer id;

    private Integer warninglevelid;

    private Integer opencourseid;

    private Integer studentid;

    private String warningcontent;

    private Date statisticstime;

    private Date warningdate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWarninglevelid() {
        return warninglevelid;
    }

    public void setWarninglevelid(Integer warninglevelid) {
        this.warninglevelid = warninglevelid;
    }

    public Integer getOpencourseid() {
        return opencourseid;
    }

    public void setOpencourseid(Integer opencourseid) {
        this.opencourseid = opencourseid;
    }

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public String getWarningcontent() {
        return warningcontent;
    }

    public void setWarningcontent(String warningcontent) {
        this.warningcontent = warningcontent == null ? null : warningcontent.trim();
    }

    public Date getStatisticstime() {
        return statisticstime;
    }

    public void setStatisticstime(Date statisticstime) {
        this.statisticstime = statisticstime;
    }

    public Date getWarningdate() {
        return warningdate;
    }

    public void setWarningdate(Date warningdate) {
        this.warningdate = warningdate;
    }
}