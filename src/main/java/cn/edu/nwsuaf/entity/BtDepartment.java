package cn.edu.nwsuaf.entity;

public class BtDepartment {
    private Integer id;

    private Integer departmenttypeid;

    private String departmentno;

    private String departmentname;

    private String departmentshort;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDepartmenttypeid() {
        return departmenttypeid;
    }

    public void setDepartmenttypeid(Integer departmenttypeid) {
        this.departmenttypeid = departmenttypeid;
    }

    public String getDepartmentno() {
        return departmentno;
    }

    public void setDepartmentno(String departmentno) {
        this.departmentno = departmentno == null ? null : departmentno.trim();
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname == null ? null : departmentname.trim();
    }

    public String getDepartmentshort() {
        return departmentshort;
    }

    public void setDepartmentshort(String departmentshort) {
        this.departmentshort = departmentshort == null ? null : departmentshort.trim();
    }
}