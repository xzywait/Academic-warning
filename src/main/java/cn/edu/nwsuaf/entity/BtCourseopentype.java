package cn.edu.nwsuaf.entity;

public class BtCourseopentype {
    private Integer id;

    private String courseopentypename;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCourseopentypename() {
        return courseopentypename;
    }

    public void setCourseopentypename(String courseopentypename) {
        this.courseopentypename = courseopentypename == null ? null : courseopentypename.trim();
    }
}