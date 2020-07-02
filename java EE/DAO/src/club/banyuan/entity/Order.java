package club.banyuan.entity;

import java.util.Date;

public class Order {
    private Integer id;
    private Integer userId;
<<<<<<< HEAD
    private Date createTime;
    private double cost;

=======
    private String loginName;
    private Date createTime;
    private double cost;

    public Order(Integer id, Integer userId, String loginName, Date createTime, double cost) {
        this.id = id;
        this.userId = userId;
        this.loginName = loginName;
        this.createTime = createTime;
        this.cost = cost;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }


>>>>>>> e8277cc3d614bdb14d97acb5b6a1a4eecd676677
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
