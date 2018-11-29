package cn.edu.nwsuaf.entity;

public class BtGrade {
    private Integer id;

    private Integer yearid;

    private Integer semesterid;

    private String gradeno;

    private String gradename;

    private Boolean status;

    private String remark;

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

    public String getGradeno() {
        return gradeno;
    }

    public void setGradeno(String gradeno) {
        this.gradeno = gradeno == null ? null : gradeno.trim();
    }

    public String getGradename() {
        return gradename;
    }

    public void setGradename(String gradename) {
        this.gradename = gradename == null ? null : gradename.trim();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}