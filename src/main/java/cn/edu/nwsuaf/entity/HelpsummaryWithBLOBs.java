package cn.edu.nwsuaf.entity;

public class HelpsummaryWithBLOBs extends Helpsummary {
    private String helpprocess;

    private String helpsummary;

    public String getHelpprocess() {
        return helpprocess;
    }

    public void setHelpprocess(String helpprocess) {
        this.helpprocess = helpprocess == null ? null : helpprocess.trim();
    }

    public String getHelpsummary() {
        return helpsummary;
    }

    public void setHelpsummary(String helpsummary) {
        this.helpsummary = helpsummary == null ? null : helpsummary.trim();
    }
}