package cn.edu.nwsuaf.model;

/**
 * Created by xzy on 2017/5/7.
 */
public class CourseTuple {
    /**
     * 总门数
     */
    private int courseTotalNum;
    /**
     * 总学分
     */
    private int courseTotalCredit;


    public int getCourseTotalNum() {
        return courseTotalNum;
    }

    public void setCourseTotalNum(int courseTotalNum) {
        this.courseTotalNum = courseTotalNum;
    }

    public int getCourseTotalCredit() {
        return courseTotalCredit;
    }

    public void setCourseTotalCredit(int courseTotalCredit) {
        this.courseTotalCredit = courseTotalCredit;
    }

    public CourseTuple() {

    }

    public CourseTuple(int courseTotalNum, int courseTotalCredit) {
        this.courseTotalNum = courseTotalNum;
        this.courseTotalCredit = courseTotalCredit;
    }

    @Override
    public String toString() {
        return "CourseTuple{" +
                "courseTotalNum=" + courseTotalNum +
                ", courseTotalCredit=" + courseTotalCredit +
                '}';
    }
}
