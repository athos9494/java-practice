package club.banyuan.service;

import club.banyuan.entity.User;

import java.sql.SQLException;

public interface UserService {
    public User login(String username, String password) throws SQLException;
    public int regist(String loginName,String username,String password,String email,String mobile) throws SQLException;
}
