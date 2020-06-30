package club.banyuan;

import club.banyuan.dao.ProductDao;
import club.banyuan.dao.UserDao;
import club.banyuan.dao.impl.ProductDaoImpl;
import club.banyuan.dao.impl.UserDaoImpl;
import club.banyuan.entity.User;
import club.banyuan.utils.JdbcUtils;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

//一、准备工作
//1、导入jdbc的jar
//2、复制util/jdbcUtil，dao/IBaseDao、dao/impl/BaseDaoImpl到各自包下
//3、复制配置文件db.properties到src目录
//二、自定义dao
//1、在dao包下创建自定义接口（继承通用BaseDao接口）
//2、在dao/impl下创建自定义接口的实现类
//        以及继承通用接口的实现类BaseDaoImpl
//3、实现自定义接口中的方法


public class TestMain {
    public static void main(String[] args) throws IOException, SQLException {
//        Properties properties = new Properties();
//        InputStream is = TestMain.class.getClassLoader()
//                            .getResourceAsStream("db.properties");
//        properties.load(is);
//        String url = properties.getProperty("URL");
//        String username = properties.getProperty("USERNAME");
//        String pwd = properties.getProperty("PWD");

//        System.out.println(url+"  "+username+"  "+pwd);

        Connection conn = JdbcUtils.getConnection();
        UserDao userDao = new UserDaoImpl(conn);
//        User newUser = new User(null,"kkks","realName","123",1,"dfs@sdf.com","12345666673");
//        int id = userDao.add(newUser);
//        System.out.println(id);

        User user = userDao.getLoginUser("kkk","123");
        System.out.println(user.getEmail());

        ProductDao productDao = new ProductDaoImpl(conn);
        System.out.println(productDao.getProductById(1));
        System.out.println(productDao.getProductByName("华为"));

    }
}
