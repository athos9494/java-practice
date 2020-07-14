package club.banyuan.entity;

public class User {
    Integer id;
    String userName;
    String userPwd;
    String idNum;
    String mobile;
    String address;
    String postcode;

    public User(){}

    public User(Integer id,String userName,String userPwd,String idNum,String mobile,String address,String postcode){
        this.id = id;
        this.userName = userName;
        this.userPwd = userPwd;
        this.idNum = idNum;
        this.mobile = mobile;
        this.address = address;
        this.postcode = postcode;

    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostCode(String postcode) {
        this.postcode = postcode;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", idNum='" + idNum + '\'' +
                ", mobile='" + mobile + '\'' +
                ", address='" + address + '\'' +
                ", postcode='" + postcode + '\'' +
                '}';
    }
}
