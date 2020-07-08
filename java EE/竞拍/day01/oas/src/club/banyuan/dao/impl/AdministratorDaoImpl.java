package club.banyuan.dao.impl;

import club.banyuan.dao.AdministratorDao;
import club.banyuan.entity.Administrator;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdministratorDaoImpl extends BaseDaoImpl implements AdministratorDao {
    public AdministratorDaoImpl(Connection connection) {
        super(connection);
    }

    @Override
    public Administrator getLoginAdmin(String adminName, String adminPwd) throws SQLException {
        String sql = "select* from administrator where adminName = ? and adminPwd = ?";
        Object[] objects = new Object[]{adminName,adminPwd};
        ResultSet resultSet = executeQuery(sql,objects);
        Administrator administrator = null;
        try{
            if (resultSet.next()){
                administrator = (Administrator) tableToClass(resultSet);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return administrator;
    }

    @Override
    public Object tableToClass(ResultSet rs) throws Exception {
        return new Administrator(rs.getString(1), rs.getString(2));
    }
}
