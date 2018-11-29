package cn.edu.nwsuaf.entity;

public class BtScoretype {
    private Integer id;

    private String scoretypename;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getScoretypename() {
        return scoretypename;
    }

    public void setScoretypename(String scoretypename) {
        this.scoretypename = scoretypename == null ? null : scoretypename.trim();
    }
}