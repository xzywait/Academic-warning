package cn.edu.nwsuaf.entity;

public class BtDepartmenttype {
    private Integer id;

    private String departmenttypename;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmenttypename() {
        return departmenttypename;
    }

    public void setDepartmenttypename(String departmenttypename) {
        this.departmenttypename = departmenttypename == null ? null : departmenttypename.trim();
    }
}