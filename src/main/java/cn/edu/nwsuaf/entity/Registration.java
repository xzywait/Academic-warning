package cn.edu.nwsuaf.entity;

import java.util.Date;

public class Registration {
    private Integer id;

    private Integer yearid;

    private Integer semesterid;

    private Integer studentid;

    private Boolean status;

    private Date statisticstime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getYearid() {
        return yearid;
    }

    public void setYearid(Integer yearid) {
        this.yearid = yearid;
    }

    public Integer getSemesterid() {
        return semesterid;
    }

    public void setSemesterid(Integer semesterid) {
        this.semesterid = semesterid;
    }

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Date getStatisticstime() {
        return statisticstime;
    }

    public void setStatisticstime(Date statisticstime) {
        this.statisticstime = statisticstime;
    }
}