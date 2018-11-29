package cn.edu.nwsuaf.entity;

public class Parent {
    private Integer id;

    private Integer userid;

    private Integer studentid;

    private String relativetype;

    private String relativeappellation;

    private String relativename;

    private String relativetelephone;

    private String fixedphone;

    private String address;

    private String zipcode;

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

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public String getRelativetype() {
        return relativetype;
    }

    public void setRelativetype(String relativetype) {
        this.relativetype = relativetype == null ? null : relativetype.trim();
    }

    public String getRelativeappellation() {
        return relativeappellation;
    }

    public void setRelativeappellation(String relativeappellation) {
        this.relativeappellation = relativeappellation == null ? null : relativeappellation.trim();
    }

    public String getRelativename() {
        return relativename;
    }

    public void setRelativename(String relativename) {
        this.relativename = relativename == null ? null : relativename.trim();
    }

    public String getRelativetelephone() {
        return relativetelephone;
    }

    public void setRelativetelephone(String relativetelephone) {
        this.relativetelephone = relativetelephone == null ? null : relativetelephone.trim();
    }

    public String getFixedphone() {
        return fixedphone;
    }

    public void setFixedphone(String fixedphone) {
        this.fixedphone = fixedphone == null ? null : fixedphone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode == null ? null : zipcode.trim();
    }
}