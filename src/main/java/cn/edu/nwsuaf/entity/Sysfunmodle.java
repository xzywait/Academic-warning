package cn.edu.nwsuaf.entity;

public class Sysfunmodle {
    private Integer id;

    private String funmodlecode;

    private String funparentcode;

    private String funmodlename;

    private Boolean status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFunmodlecode() {
        return funmodlecode;
    }

    public void setFunmodlecode(String funmodlecode) {
        this.funmodlecode = funmodlecode == null ? null : funmodlecode.trim();
    }

    public String getFunparentcode() {
        return funparentcode;
    }

    public void setFunparentcode(String funparentcode) {
        this.funparentcode = funparentcode == null ? null : funparentcode.trim();
    }

    public String getFunmodlename() {
        return funmodlename;
    }

    public void setFunmodlename(String funmodlename) {
        this.funmodlename = funmodlename == null ? null : funmodlename.trim();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}