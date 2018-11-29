package cn.edu.nwsuaf.entity;

import java.util.Date;

public class Studentwarning {
    private Integer id;

    private Integer warningtypeid;

    private Integer warninglevelid;

    private Integer yearid;

    private Integer semesterid;

    private Integer studentid;

    private Date warningdate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWarningtypeid() {
        return warningtypeid;
    }

    public void setWarningtypeid(Integer warningtypeid) {
        this.warningtypeid = warningtypeid;
    }

    public Integer getWarninglevelid() {
        return warninglevelid;
    }

    public void setWarninglevelid(Integer warninglevelid) {
        this.warninglevelid = warninglevelid;
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

    public Date getWarningdate() {
        return warningdate;
    }

    public void setWarningdate(Date warningdate) {
        this.warningdate = warningdate;
    }
}