package cn.edu.nwsuaf.entity;

import java.util.Date;

public class BtYear {
    private Integer id;

    private String yearno;

    private String yearname;

    private Date year;

    private Boolean status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getYearno() {
        return yearno;
    }

    public void setYearno(String yearno) {
        this.yearno = yearno == null ? null : yearno.trim();
    }

    public String getYearname() {
        return yearname;
    }

    public void setYearname(String yearname) {
        this.yearname = yearname == null ? null : yearname.trim();
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}