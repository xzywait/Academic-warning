package cn.edu.nwsuaf.entity;

public class Otherwarninglevel {
    private Integer id;

    private Integer warningtypeid;

    private Integer warninglevelid;

    private String standard;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWarningtypeid() {
        return warningtypeid;
    }

    public void setWarningtypeid(Integer warningtypeid) {
        this.warningtypeid = warningtypeid;
    }

    public Integer getWarninglevelid() {
        return warninglevelid;
    }

    public void setWarninglevelid(Integer warninglevelid) {
        this.warninglevelid = warninglevelid;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard == null ? null : standard.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}