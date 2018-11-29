package cn.edu.nwsuaf.model;

import java.util.Date;

import org.springframework.stereotype.Component;

/**
 * Created by xzy on 2017/5/7.
 */
@Component
public class UsuallyWarnModel {
    private String warncourse;
    private String warncontent;
    private String warnlevel;
    private Date warndate;

    public UsuallyWarnModel() {
    }

    public UsuallyWarnModel(String warncourse, String warncontent, String warnlevel, Date warndate) {
        this.warncourse = warncourse;
        this.warncontent = warncontent;
        this.warnlevel = warnlevel;
        this.warndate = warndate;
    }

    public String getWarncourse() {

        return warncourse;
    }

    public void setWarncourse(String warncourse) {
        this.warncourse = warncourse;
    }

    public String getWarncontent() {
        return warncontent;
    }

    public void setWarncontent(String warncontent) {
        this.warncontent = warncontent;
    }

    public String getWarnlevel() {
        return warnlevel;
    }

    public void setWarnlevel(String warnlevel) {
        this.warnlevel = warnlevel;
    }

    public Date getWarndate() {
        return warndate;
    }

    public void setWarndate(Date warndate) {
        this.warndate = warndate;
    }

    @Override
    public String toString() {
        return "UsuallyWarnModel{" +
                "warncourse='" + warncourse + '\'' +
                ", warncontent='" + warncontent + '\'' +
                ", warnlevel='" + warnlevel + '\'' +
                ", warndate=" + warndate +
                '}';
    }
}
