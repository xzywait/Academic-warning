package cn.edu.nwsuaf.entity;

import java.util.Date;

public class Averagescore {
    private Integer id;

    private Integer semesterid;

    private Integer yearid;

    private Integer studentid;

    private Float averagecreditscore;

    private Date statisticstime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSemesterid() {
        return semesterid;
    }

    public void setSemesterid(Integer semesterid) {
        this.semesterid = semesterid;
    }

    public Integer getYearid() {
        return yearid;
    }

    public void setYearid(Integer yearid) {
        this.yearid = yearid;
    }

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public Float getAveragecreditscore() {
        return averagecreditscore;
    }

    public void setAveragecreditscore(Float averagecreditscore) {
        this.averagecreditscore = averagecreditscore;
    }

    public Date getStatisticstime() {
        return statisticstime;
    }

    public void setStatisticstime(Date statisticstime) {
        this.statisticstime = statisticstime;
    }
}