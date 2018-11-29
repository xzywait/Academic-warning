package cn.edu.nwsuaf.entity;

public class Warningtype {
    private Integer id;

    private String warningtypeno;

    private String warningtypename;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWarningtypeno() {
        return warningtypeno;
    }

    public void setWarningtypeno(String warningtypeno) {
        this.warningtypeno = warningtypeno == null ? null : warningtypeno.trim();
    }

    public String getWarningtypename() {
        return warningtypename;
    }

    public void setWarningtypename(String warningtypename) {
        this.warningtypename = warningtypename == null ? null : warningtypename.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}