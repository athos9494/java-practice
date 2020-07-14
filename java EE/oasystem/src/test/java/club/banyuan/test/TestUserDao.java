package club.banyuan.test;

import club.banyuan.dao.UserDao;
import club.banyuan.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestUserDao {
    InputStream ins;
    SqlSession session;
    UserDao userDao;
    @Before
    public void init() throws IOException {
        // 加载配置文件
        ins = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 获取用于创建SqlSessionFactory对象的类的对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        // 创建SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = builder.build(ins);
        // 创建SqlSession对象
        session = sqlSessionFactory.openSession();
        // 获取接口的实现类对象
        // 动态代理设计模式，获取接口的实现类对象
        userDao = session.getMapper(UserDao.class);
    }
    @Test
    public void testAddUser(){
        User user = new User();
        user.setUserName("bbb");
        user.setUserName("123123");
        user.setIdNum("11");
        user.setMobile("12312345645");
        user.setAddress("江苏南京");
        user.setPostCode("210000");
        int i = userDao.add(user);
        System.out.println(i);
        System.out.println(user.getId());
    }
    @Test
    public void testGetLoginUser(){
        User user = new User();
        user.setUserName("%a%");
        user.setAddress("%ji%");
        List<User> users = userDao.getLoginUser(user);
        for (User u:users
             ) {
            System.out.println(u);
        }
    }

}
