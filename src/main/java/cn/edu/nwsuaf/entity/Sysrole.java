package cn.edu.nwsuaf.entity;

public class Sysrole {
    private Integer id;

    private String rolecode;

    private String rolename;

    private String roledescription;

    private String roleindexpage;

    private Boolean status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRolecode() {
        return rolecode;
    }

    public void setRolecode(String rolecode) {
        this.rolecode = rolecode == null ? null : rolecode.trim();
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public String getRoledescription() {
        return roledescription;
    }

    public void setRoledescription(String roledescription) {
        this.roledescription = roledescription == null ? null : roledescription.trim();
    }

    public String getRoleindexpage() {
        return roleindexpage;
    }

    public void setRoleindexpage(String roleindexpage) {
        this.roleindexpage = roleindexpage == null ? null : roleindexpage.trim();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}