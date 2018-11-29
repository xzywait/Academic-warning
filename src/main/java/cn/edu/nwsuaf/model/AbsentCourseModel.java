package cn.edu.nwsuaf.model;

import java.util.Date;

import org.springframework.stereotype.Component;

/**
 * Created by xzy on 2017/5/7.
 */
@Component
public class AbsentCourseModel {
    private String course;
    private String warnlevel;
    private int absenttimes;
    private Date date;

    public AbsentCourseModel() {
    }

    public String getCourse() {

        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getWarnlevel() {
        return warnlevel;
    }

    public void setWarnlevel(String warnlevel) {
        this.warnlevel = warnlevel;
    }

    public int getAbsenttimes() {
        return absenttimes;
    }

    public void setAbsenttimes(int absenttimes) {
        this.absenttimes = absenttimes;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


}
