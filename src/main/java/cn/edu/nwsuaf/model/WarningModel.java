package cn.edu.nwsuaf.model;

import java.util.Date;

import org.springframework.stereotype.Component;

/**
 * Created by xzy on 2017/5/11.
 */
@Component
public class WarningModel {

    private String warningType;
    private String warningLevel;
    private String warningyear;
    private String warningSemester;
    private Date waringDate;

    public String getWarningType() {
        return warningType;
    }

    public void setWarningType(String warningType) {
        this.warningType = warningType;
    }

    public String getWarningLevel() {
        return warningLevel;
    }

    public void setWarningLevel(String warningLevel) {
        this.warningLevel = warningLevel;
    }

    public String getWarningyear() {
        return warningyear;
    }

    public void setWarningyear(String warningyear) {
        this.warningyear = warningyear;
    }

    public String getWarningSemester() {
        return warningSemester;
    }

    public void setWarningSemester(String warningSemester) {
        this.warningSemester = warningSemester;
    }

    public Date getWaringDate() {
        return waringDate;
    }

    public void setWaringDate(Date waringDate) {
        this.waringDate = waringDate;
    }

    @Override
    public String toString() {
        return "WarningModel{" +
                "warningType='" + warningType + '\'' +
                ", warningLevel='" + warningLevel + '\'' +
                ", warningyear='" + warningyear + '\'' +
                ", warningSemester='" + warningSemester + '\'' +
                ", waringDate=" + waringDate +
                '}';
    }
}
