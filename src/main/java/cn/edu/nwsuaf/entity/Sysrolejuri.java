package cn.edu.nwsuaf.entity;

public class Sysrolejuri {
    private Integer id;

    private Integer roleid;

    private Integer funmodleid;

    private String rolemenucode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getFunmodleid() {
        return funmodleid;
    }

    public void setFunmodleid(Integer funmodleid) {
        this.funmodleid = funmodleid;
    }

    public String getRolemenucode() {
        return rolemenucode;
    }

    public void setRolemenucode(String rolemenucode) {
        this.rolemenucode = rolemenucode == null ? null : rolemenucode.trim();
    }
}