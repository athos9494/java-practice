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
        String sql = "insert into user(id,userName,userPwd,idNum,mobile,address,postCode) values(null,?,?,?,?,?,?)";
        Object[] params = new Object[]{user.getUserName()
                ,user.getUserName(),user.getUserPwd(),user.getIdNum(),user.getMobile(),user.getAddress(),user.getPostCode()};
        int i= executeInsert(sql,params);
        return i;
    }

    @Override
    public int getRegistUser(String userName, String userPwd, Integer idNum, String mobile, String address, String postCode) {
        return 0;
    }

    @Override
    public User getLoginUser(String userName, String userPwd) {
        String sql = "select * from user where loginName=? and password=?";
        ResultSet rs = executeQuery(sql,new Object[]{userName,userPwd});
        User user = null;
        try {
            if(rs.next()){
                user = tableToClass(rs);
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return user;
    }

    @Override
    public User tableToClass(ResultSet rs) throws Exception {
        User user = new User(rs.getInt(1),
                rs.getString(2),
                rs.getString(3),
                rs.getInt(4),rs.getString(5),
                rs.getString(6),rs.getString(7));

        return user;
    }
}
