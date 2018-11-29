package cn.edu.nwsuaf.entity;

public class BtClass {
    private Integer id;

    private Integer majorid;

    private Integer classteacherid;

    private Integer instructorid;

    private String classno;

    private String classname;

    private Integer majorlength;

    private Integer classsize;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMajorid() {
        return majorid;
    }

    public void setMajorid(Integer majorid) {
        this.majorid = majorid;
    }

    public Integer getClassteacherid() {
        return classteacherid;
    }

    public void setClassteacherid(Integer classteacherid) {
        this.classteacherid = classteacherid;
    }

    public Integer getInstructorid() {
        return instructorid;
    }

    public void setInstructorid(Integer instructorid) {
        this.instructorid = instructorid;
    }

    public String getClassno() {
        return classno;
    }

    public void setClassno(String classno) {
        this.classno = classno == null ? null : classno.trim();
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
    }

    public Integer getMajorlength() {
        return majorlength;
    }

    public void setMajorlength(Integer majorlength) {
        this.majorlength = majorlength;
    }

    public Integer getClasssize() {
        return classsize;
    }

    public void setClasssize(Integer classsize) {
        this.classsize = classsize;
    }
}