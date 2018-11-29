package cn.edu.nwsuaf.entity;

import java.util.Date;

public class Totalscore {
    private Integer id;

    private Integer studentid;

    private Float totalcreditscore;

    private Date statisticsdate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public Float getTotalcreditscore() {
        return totalcreditscore;
    }

    public void setTotalcreditscore(Float totalcreditscore) {
        this.totalcreditscore = totalcreditscore;
    }

    public Date getStatisticsdate() {
        return statisticsdate;
    }

    public void setStatisticsdate(Date statisticsdate) {
        this.statisticsdate = statisticsdate;
    }
}