package club.banyuan.dao;

import club.banyuan.entity.User;

public interface UserDao extends IBaseDao{
    public int add(User user);
    public User getLoginUser(String loginName,String password);
    public int getRegistUser(String loginName,String username,String password,String email,String mobile);
}
