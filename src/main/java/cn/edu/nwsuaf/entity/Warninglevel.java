package cn.edu.nwsuaf.entity;

public class Warninglevel {
    private Integer id;

    private String warninglevelno;

    private String warninglevelname;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWarninglevelno() {
        return warninglevelno;
    }

    public void setWarninglevelno(String warninglevelno) {
        this.warninglevelno = warninglevelno == null ? null : warninglevelno.trim();
    }

    public String getWarninglevelname() {
        return warninglevelname;
    }

    public void setWarninglevelname(String warninglevelname) {
        this.warninglevelname = warninglevelname == null ? null : warninglevelname.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}