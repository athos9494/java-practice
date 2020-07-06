package club.banyuan.service.impl;

import club.banyuan.dao.UserDao;
import club.banyuan.dao.impl.UserDaoImpl;
import club.banyuan.entity.User;
import club.banyuan.service.UserService;
import club.banyuan.utils.JdbcUtils;

import java.sql.SQLException;

public class UserServiceImpl implements UserService {
    @Override
    public User login(String username, String password) throws SQLException {
        UserDao userDao = new UserDaoImpl(JdbcUtils.getConnection());
        return userDao.getLoginUser(username,password);
    }

    @Override
    public int regist(String loginName, String username, String password, String email, String mobile) throws SQLException {
        UserDao userDao = new UserDaoImpl(JdbcUtils.getConnection());
        return userDao.getRegistUser(loginName,username,password,email,mobile);
    }


}
