package cn.pojo;

public class TbOperatorSecond {
    private Integer id;

    private String secondlevel;

    private Integer operatorhomeId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSecondlevel() {
        return secondlevel;
    }

    public void setSecondlevel(String secondlevel) {
        this.secondlevel = secondlevel == null ? null : secondlevel.trim();
    }

    public Integer getOperatorhomeId() {
        return operatorhomeId;
    }

    public void setOperatorhomeId(Integer operatorhomeId) {
        this.operatorhomeId = operatorhomeId;
    }
}