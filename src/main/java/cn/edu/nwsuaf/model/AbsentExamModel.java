package cn.edu.nwsuaf.model;

import java.util.Date;

import org.springframework.stereotype.Component;

/**
 * Created by xzy on 2017/5/7.
 */
@Component
public class AbsentExamModel {
    private String Course;
    private String year;
    private String semester;
    private Date date;

    public AbsentExamModel() {
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String course) {
        Course = course;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


}
