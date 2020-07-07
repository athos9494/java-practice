package club.banyuan.entity;

import javax.xml.crypto.Data;
import java.util.Date;

public class Address {
    private Integer id;
    private Integer userId;
    private String address;
    private Date createTime;
    private Integer isDefault;
    private String remark;

    public Address() {
    }

    public Address(Integer userId, String address, Date createTime, Integer isDefault, String remark) {
        this.userId = userId;
        this.address = address;
        this.createTime = createTime;
        this.isDefault = isDefault;
        this.remark = remark;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}