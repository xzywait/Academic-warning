package cn.edu.nwsuaf.entity;

public class BtCoursenature {
    private Integer id;

    private String coursenaturename;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCoursenaturename() {
        return coursenaturename;
    }

    public void setCoursenaturename(String coursenaturename) {
        this.coursenaturename = coursenaturename == null ? null : coursenaturename.trim();
    }
}