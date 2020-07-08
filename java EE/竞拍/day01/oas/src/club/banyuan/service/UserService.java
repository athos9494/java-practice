package club.banyuan.service;

import club.banyuan.entity.User;

import java.sql.SQLException;

public interface UserService {
    public User login(String userName,String userPwd)throws SQLException;
    public int regist(User user) throws SQLException;
}
