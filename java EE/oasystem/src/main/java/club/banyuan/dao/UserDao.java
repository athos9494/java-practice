package club.banyuan.dao;

import club.banyuan.entity.User;

import java.util.List;

public interface UserDao {
    public int add(User user);
    public List<User> getLoginUser(User user);
    public int getRegistUser(String userName,String userPwd,Integer idNum,String mobile,String address,String postCode);
}
