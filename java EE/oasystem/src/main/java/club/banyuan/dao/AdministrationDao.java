package club.banyuan.dao;

import club.banyuan.entity.Administrator;

import java.sql.SQLException;

public interface AdministrationDao {
    public Administrator getLoginAdministrator(String adminName, String adminPwd) throws SQLException;
}
