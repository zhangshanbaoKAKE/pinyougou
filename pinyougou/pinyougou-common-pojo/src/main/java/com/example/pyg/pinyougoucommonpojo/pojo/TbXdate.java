package com.example.pyg.pinyougoucommonpojo.pojo;

public class TbXdate {
    private Integer xdateid;

    private String xdatename;

    private String ex1;

    private String ex2;

    private String ex3;

    public Integer getXdateid() {
        return xdateid;
    }

    public void setXdateid(Integer xdateid) {
        this.xdateid = xdateid;
    }

    public String getXdatename() {
        return xdatename;
    }

    public void setXdatename(String xdatename) {
        this.xdatename = xdatename == null ? null : xdatename.trim();
    }

    public String getEx1() {
        return ex1;
    }

    public void setEx1(String ex1) {
        this.ex1 = ex1 == null ? null : ex1.trim();
    }

    public String getEx2() {
        return ex2;
    }

    public void setEx2(String ex2) {
        this.ex2 = ex2 == null ? null : ex2.trim();
    }

    public String getEx3() {
        return ex3;
    }

    public void setEx3(String ex3) {
        this.ex3 = ex3 == null ? null : ex3.trim();
    }
}