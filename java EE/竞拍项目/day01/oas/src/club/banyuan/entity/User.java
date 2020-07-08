package club.banyuan.entity;

public class User {
    Integer id;
    String userName;
    String userPwd;
    Integer idNum;
    String mobile;
    String address;
    String postCode;

    public User(){}

    public User(Integer id,String userName,String userPwd,Integer idNum,String mobile,String address,String postCode){
        this.id = id;
        this.userName = userName;
        this.userPwd = userPwd;
        this.idNum = idNum;
        this.mobile = mobile;
        this.address = address;
        this.postCode = postCode;

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

    public Integer getIdNum() {
        return idNum;
    }

    public void setIdNum(Integer idNum) {
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

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
}
