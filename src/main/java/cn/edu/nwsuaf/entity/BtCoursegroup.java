package cn.edu.nwsuaf.entity;

public class BtCoursegroup {
    private Integer id;

    private String coursegroupname;

    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCoursegroupname() {
        return coursegroupname;
    }

    public void setCoursegroupname(String coursegroupname) {
        this.coursegroupname = coursegroupname == null ? null : coursegroupname.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}