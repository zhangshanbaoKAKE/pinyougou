package com.example.pyg.pinyougoucommonpojo.pojo;

public class TbOperatorHome {
    private Integer id;

    private String stairmanage;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStairmanage() {
        return stairmanage;
    }

    public void setStairmanage(String stairmanage) {
        this.stairmanage = stairmanage == null ? null : stairmanage.trim();
    }
}