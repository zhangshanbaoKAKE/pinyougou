package cn.pojo;

public class TbSpecification {
    private Integer id;

    private String specName;

    private String ex1;

    private String ex2;

    private String ex3;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSpecName() {
        return specName;
    }

    public void setSpecName(String specName) {
        this.specName = specName == null ? null : specName.trim();
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