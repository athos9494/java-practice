package club.banyuan.dao;

import club.banyuan.entity.User;

import java.util.List;

public interface UserDao {
    public int add(User user);
    public User getLoginUser(User user);
}
