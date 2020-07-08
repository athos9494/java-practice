package club.banyuan.service;

import club.banyuan.entity.Administrator;

import java.sql.SQLException;

public interface AdministratorService {
    public Administrator login(String adminName,String adminPwd) throws SQLException;
}
