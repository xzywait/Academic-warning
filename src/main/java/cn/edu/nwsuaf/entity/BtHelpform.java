package cn.edu.nwsuaf.entity;

public class BtHelpform {
    private Integer id;

    private String helpformname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHelpformname() {
        return helpformname;
    }

    public void setHelpformname(String helpformname) {
        this.helpformname = helpformname == null ? null : helpformname.trim();
    }
}