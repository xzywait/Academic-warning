package cn.edu.nwsuaf.entity;

public class Help {
    private Integer id;

    private Integer yearid;

    private Integer semesterid;

    private Integer studentwarningid;

    private Integer studentid;

    private Integer userid;

    private String helpresult;

    private Boolean status;

    private String helpplan;

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

    public Integer getStudentwarningid() {
        return studentwarningid;
    }

    public void setStudentwarningid(Integer studentwarningid) {
        this.studentwarningid = studentwarningid;
    }

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getHelpresult() {
        return helpresult;
    }

    public void setHelpresult(String helpresult) {
        this.helpresult = helpresult == null ? null : helpresult.trim();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getHelpplan() {
        return helpplan;
    }

    public void setHelpplan(String helpplan) {
        this.helpplan = helpplan == null ? null : helpplan.trim();
    }
}