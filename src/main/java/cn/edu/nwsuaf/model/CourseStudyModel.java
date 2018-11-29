package cn.edu.nwsuaf.model;

import org.springframework.stereotype.Component;

/**
 * Created by xzy on 2017/5/7.
 */
@Component
public class CourseStudyModel {
    private CourseTuple courseRequired;
    private CourseTuple courseSelected;
    private CourseTuple coursePassed;
    private CourseTuple courseUnpassed;
    private CourseTuple courseUnselected;

    public CourseStudyModel() {
    }

    public CourseTuple getCourseRequired() {
        return courseRequired;
    }

    public void setCourseRequired(CourseTuple courseRequired) {
        this.courseRequired = courseRequired;
    }

    public CourseTuple getCourseSelected() {
        return courseSelected;
    }

    public void setCourseSelected(CourseTuple courseSelected) {
        this.courseSelected = courseSelected;
    }

    public CourseTuple getCoursePassed() {
        return coursePassed;
    }

    public void setCoursePassed(CourseTuple coursePassed) {
        this.coursePassed = coursePassed;
    }

    public CourseTuple getCourseUnpassed() {
        return courseUnpassed;
    }

    public void setCourseUnpassed(CourseTuple courseUnpassed) {
        this.courseUnpassed = courseUnpassed;
    }

    public CourseTuple getCourseUnselected() {
        return courseUnselected;
    }

    public void setCourseUnselected(CourseTuple courseUnselected) {
        this.courseUnselected = courseUnselected;
    }

    @Override
    public String toString() {
        return "CourseStudyModel{" +
                "courseRequired=" + courseRequired +
                ", courseSelected=" + courseSelected +
                ", coursePassed=" + coursePassed +
                ", courseUnpassed=" + courseUnpassed +
                ", courseUnselected=" + courseUnselected +
                '}';
    }

    public CourseStudyModel(CourseTuple courseRequired, CourseTuple courseSelected, CourseTuple coursePassed, CourseTuple courseUnpassed, CourseTuple courseUnselected) {

        this.courseRequired = courseRequired;
        this.courseSelected = courseSelected;
        this.coursePassed = coursePassed;
        this.courseUnpassed = courseUnpassed;
        this.courseUnselected = courseUnselected;
    }
}
