package club.banyuan.entity;

import java.util.Date;

public class Auction {
    private Integer id;
    private Integer userId;
    private String userName;
    private Integer lotsId;
    private Date createTime;
    private Double price;

    public Auction() {
        super();
    }

    @Override
    public String toString() {
        return "Auction{" +
                "id=" + id +
                ", userId=" + userId +
                ", userName='" + userName + '\'' +
                ", lotsId=" + lotsId +
                ", createTime=" + createTime +
                ", price=" + price +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Auction(Integer id, Integer userId, String userName, Integer lotsId, Date createTime, Double price) {

        this.id = id;
        this.userId = userId;
        this.userName = userName;
        this.lotsId = lotsId;
        this.createTime = createTime;
        this.price = price;
    }

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

    public Integer getLotsId() {
        return lotsId;
    }

    public void setLotsId(Integer lotsId) {
        this.lotsId = lotsId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
