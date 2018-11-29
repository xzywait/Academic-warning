package cn.edu.nwsuaf.entity;

public class BtScoremark {
    private Integer id;

    private String scoremarkname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getScoremarkname() {
        return scoremarkname;
    }

    public void setScoremarkname(String scoremarkname) {
        this.scoremarkname = scoremarkname == null ? null : scoremarkname.trim();
    }
}