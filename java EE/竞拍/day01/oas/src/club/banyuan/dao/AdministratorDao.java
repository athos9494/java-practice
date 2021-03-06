package club.banyuan.dao;

import club.banyuan.dao.IBaseDao;
import club.banyuan.entity.Administrator;

import java.sql.SQLException;

public interface AdministratorDao extends IBaseDao {
    public Administrator getLoginAdministrator(String adminName, String adminPwd) throws SQLException;
}
