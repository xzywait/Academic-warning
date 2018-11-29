package cn.edu.nwsuaf.entity;

public class BtCourse {
    private Integer id;

    private Integer scoretypeid;

    private String courseno;

    private String coursename;

    private String courseshort;

    private Float credit;

    private Float totalhours;

    private Float theoryhours;

    private Float experimentalhours;

    private Float practicalhours;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getScoretypeid() {
        return scoretypeid;
    }

    public void setScoretypeid(Integer scoretypeid) {
        this.scoretypeid = scoretypeid;
    }

    public String getCourseno() {
        return courseno;
    }

    public void setCourseno(String courseno) {
        this.courseno = courseno == null ? null : courseno.trim();
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename == null ? null : coursename.trim();
    }

    public String getCourseshort() {
        return courseshort;
    }

    public void setCourseshort(String courseshort) {
        this.courseshort = courseshort == null ? null : courseshort.trim();
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
}