package cn.edu.nwsuaf.entity;

public class Scoregradewarning {
    private Integer id;
    /**
     * 预警类型：（学分，成绩，考试、其他）
     */
    private Integer warningtypeid;
    /**
     * 预警级别：红橙黄
     */
    private Integer warninglevelid;
    /**
     * 下限
     */
    private Float lowstandard;
    /**
     * 上限
     */
    private Float highstandard;
    /**
     * 学期还是累计
     */
    private String dateline;
    /**
     * 分值类型：百分制还是百分比
     */
    private String scoretype;
    /**
     * 备注
     */
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

    public Float getLowstandard() {
        return lowstandard;
    }

    public void setLowstandard(Float lowstandard) {
        this.lowstandard = lowstandard;
    }

    public Float getHighstandard() {
        return highstandard;
    }

    public void setHighstandard(Float highstandard) {
        this.highstandard = highstandard;
    }

    public String getDateline() {
        return dateline;
    }

    public void setDateline(String dateline) {
        this.dateline = dateline == null ? null : dateline.trim();
    }

    public String getScoretype() {
        return scoretype;
    }

    public void setScoretype(String scoretype) {
        this.scoretype = scoretype == null ? null : scoretype.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}