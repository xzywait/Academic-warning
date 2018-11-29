package cn.edu.nwsuaf.entity;

public class BtStudentteacheringplan {
    private Integer id;

    private Integer courseid;

    private Integer coursegroupid;

    private Integer coursenatureid;

    private Integer semesterid;

    private Integer yearid;

    private Integer studentid;

    private Float scorerequire;

    private Integer numberrequire;

    private Float credit;

    private Float totalhours;

    private Float theoryhours;

    private Float experimentalhours;

    private Float practicalhours;

    private String exammethod;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public Integer getCoursegroupid() {
        return coursegroupid;
    }

    public void setCoursegroupid(Integer coursegroupid) {
        this.coursegroupid = coursegroupid;
    }

    public Integer getCoursenatureid() {
        return coursenatureid;
    }

    public void setCoursenatureid(Integer coursenatureid) {
        this.coursenatureid = coursenatureid;
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

    public Float getScorerequire() {
        return scorerequire;
    }

    public void setScorerequire(Float scorerequire) {
        this.scorerequire = scorerequire;
    }

    public Integer getNumberrequire() {
        return numberrequire;
    }

    public void setNumberrequire(Integer numberrequire) {
        this.numberrequire = numberrequire;
    }

    public Float getCredit() {
        return credit;
    }

    public void setCredit(Float credit) {
        this.credit = credit;
    }

    public Float getTotalhours() {
        return totalhours;
    }

    public void setTotalhours(Float totalhours) {
        this.totalhours = totalhours;
    }

    public Float getTheoryhours() {
        return theoryhours;
    }

    public void setTheoryhours(Float theoryhours) {
        this.theoryhours = theoryhours;
    }

    public Float getExperimentalhours() {
        return experimentalhours;
    }

    public void setExperimentalhours(Float experimentalhours) {
        this.experimentalhours = experimentalhours;
    }

    public Float getPracticalhours() {
        return practicalhours;
    }

    public void setPracticalhours(Float practicalhours) {
        this.practicalhours = practicalhours;
    }

    public String getExammethod() {
        return exammethod;
    }

    public void setExammethod(String exammethod) {
        this.exammethod = exammethod == null ? null : exammethod.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}