package cn.edu.nwsuaf.entity;

import java.util.Date;

public class Absentexamwarning {
    private Integer id;

    private Integer opencourseid;

    private Integer studentid;

    private Date statisticstime;

    private Date warningdate;

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

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
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