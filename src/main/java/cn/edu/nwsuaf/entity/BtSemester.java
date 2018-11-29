package cn.edu.nwsuaf.entity;

public class BtSemester {
    private Integer id;

    private String semesterno;

    private String semestername;

    private Boolean status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSemesterno() {
        return semesterno;
    }

    public void setSemesterno(String semesterno) {
        this.semesterno = semesterno == null ? null : semesterno.trim();
    }

    public String getSemestername() {
        return semestername;
    }

    public void setSemestername(String semestername) {
        this.semestername = semestername == null ? null : semestername.trim();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}