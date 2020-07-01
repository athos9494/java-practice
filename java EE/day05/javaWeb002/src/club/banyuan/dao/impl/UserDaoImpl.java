package club.banyuan.dao.impl;

import club.banyuan.dao.UserDao;
import club.banyuan.entity.User;

import java.sql.Connection;
import java.sql.ResultSet;

public class UserDaoImpl extends BaseDaoImpl implements UserDao {

    public UserDaoImpl(Connection conn){
        super(conn);
    }

    @Override
    public int add(User user) {
        String sql = "insert into user(id,loginName,userName,password,sex,email,mobile) values(null,?,?,?,?,?,?)";
        Object[] params = new Object[]{user.getLoginName()
                ,user.getUserName(),user.getPassword(),user.getSex(),user.getEmail(),user.getMobile()};
        int i= executeInsert(sql,params);
        return i;
    }


    @Override
    public User getLoginUser(String loginName, String pwd) {
        String sql = "select id,loginName,userName,password,sex,email,mobile from user where loginName=? and password=?";
        ResultSet resultSet = executeQuery(sql, new Object[]{loginName,pwd});
        User user = null;
        try {
            while (resultSet.next()){
                user = tableToClass(resultSet);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return user;
    }

    @Override
    public User tableToClass(ResultSet rs) throws Exception {
        User user = new User(rs.getInt(1),
                rs.getString(2),
                rs.getString(3),
                null,rs.getInt(5),
                rs.getString(6),rs.getString(7));


        return user;
    }
}