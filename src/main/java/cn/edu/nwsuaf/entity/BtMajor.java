package cn.edu.nwsuaf.entity;

public class BtMajor {
    private Integer id;

    private Integer departmentid;

    private String majorno;

    private String majorname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    public String getMajorno() {
        return majorno;
    }

    public void setMajorno(String majorno) {
        this.majorno = majorno == null ? null : majorno.trim();
    }

    public String getMajorname() {
        return majorname;
    }

    public void setMajorname(String majorname) {
        this.majorname = majorname == null ? null : majorname.trim();
    }
}