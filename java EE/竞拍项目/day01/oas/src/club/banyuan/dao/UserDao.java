package club.banyuan.dao;

import club.banyuan.entity.User;

public interface UserDao extends IBaseDao{
    public int add(User user);
    public User getLoginUser(String userName,String userPwd);
    public int getRegistUser(String userName,String userPwd,Integer idNum,String mobile,String address,String postCode);
}
