package com.example.pyg.pinyougoucommonpojo.pojo;

import java.util.Date;

public class TbView {
    private Integer viewid;

    private Integer userid;

    private Date viewtime;

    private String ex1;

    private String ex2;

    private String ex3;

    public Integer getViewid() {
        return viewid;
    }

    public void setViewid(Integer viewid) {
        this.viewid = viewid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getViewtime() {
        return viewtime;
    }

    public void setViewtime(Date viewtime) {
        this.viewtime = viewtime;
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