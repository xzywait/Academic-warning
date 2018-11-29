package cn.edu.nwsuaf.entity;

import java.util.Date;

public class Student {
    private Integer id;

    private Integer userid;

    private Integer gradeid;

    private Integer classid;

    private String studentnumber;

    private String studentname;

    private String sex;

    private Date graduationdate;

    private String telephone;

    private String email;

    private Boolean isroll;

    private Boolean isinschool;

    private Byte status;

    private String qq;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getGradeid() {
        return gradeid;
    }

    public void setGradeid(Integer gradeid) {
        this.gradeid = gradeid;
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public String getStudentnumber() {
        return studentnumber;
    }

    public void setStudentnumber(String studentnumber) {
        this.studentnumber = studentnumber == null ? null : studentnumber.trim();
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname == null ? null : studentname.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Date getGraduationdate() {
        return graduationdate;
    }

    public void setGraduationdate(Date graduationdate) {
        this.graduationdate = graduationdate;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Boolean getIsroll() {
        return isroll;
    }

    public void setIsroll(Boolean isroll) {
        this.isroll = isroll;
    }

    public Boolean getIsinschool() {
        return isinschool;
    }

    public void setIsinschool(Boolean isinschool) {
        this.isinschool = isinschool;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }
}