package cn.edu.nwsuaf.entity;

import java.util.Date;

public class Spets {
    private Integer id;

    private Integer studentid;

    private String spetsname;

    private Date spetstime;

    private Float spetscore;

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

    public String getSpetsname() {
        return spetsname;
    }

    public void setSpetsname(String spetsname) {
        this.spetsname = spetsname == null ? null : spetsname.trim();
    }

    public Date getSpetstime() {
        return spetstime;
    }

    public void setSpetstime(Date spetstime) {
        this.spetstime = spetstime;
    }

    public Float getSpetscore() {
        return spetscore;
    }

    public void setSpetscore(Float spetscore) {
        this.spetscore = spetscore;
    }
}