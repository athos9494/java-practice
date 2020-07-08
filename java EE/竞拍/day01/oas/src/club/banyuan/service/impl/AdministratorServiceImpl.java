package club.banyuan.service.impl;

import club.banyuan.dao.AdministratorDao;
import club.banyuan.dao.impl.AdministratorDaoImpl;
import club.banyuan.entity.Administrator;
import club.banyuan.service.AdministratorService;
import club.banyuan.utils.JdbcUtils;

import java.sql.SQLException;

public class AdministratorServiceImpl implements AdministratorService {
    @Override
    public Administrator login(String adminName, String adminPwd) throws SQLException {
        AdministratorDao administratorDao = new AdministratorDaoImpl(JdbcUtils.getConnection());
        return administratorDao.getLoginAdmin(adminName,adminPwd);
    }
}
