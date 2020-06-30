package club.banyuan;

import java.awt.desktop.SystemEventListener;
import java.sql.*;
import java.util.*;

public class Login {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入用户名:");
//        String name = sc.nextLine();
//        System.out.println("请输入密码:");
//        String password = sc.nextLine();
//        register(name,password);
//        login(name, password);
        select_commodity();
    }

    public static void select_commodity() {
        Statement statement = null;
        Connection connection = null;
        ResultSet resultSet = null;
        Map <Integer,String>map = new HashMap<>();
        List <Map>list =new ArrayList();

        try {
            connection = JdbcUtils.getConnection(null);
            statement = connection.createStatement();
            String sql = "select * from commodity where c_name = '华为'";
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                  int id  = resultSet.getInt(1);
                  String name =  resultSet.getString(2);
                  map.put(id,name);
            }
            System.out.println(map);


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                JdbcUtils.close(connection,statement,resultSet);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

    }
    /*
     * 注册账号
     * */
//    public static void register(String names,String password){
//
//        Statement statement = null;
//        Connection connection = null;
//        try {
//            connection = JdbcUtils.getConnection(null);
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//        try {
//            statement = connection.createStatement();
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//        String sql = "insert into users values ('"+names+"','"+password+"')";
////        users 表使用workbench创建
//        try {
//            statement.executeUpdate(sql);
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//        System.out.println("注册成功");
//        try {
//            JdbcUtils.close(connection,statement);
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//    }
//    /*
//     * 登录账号
//     * */
//    public static void login(String name, String password) {
//        PreparedStatement preparedStatement = null;
//        Connection connection = null;
//        ResultSet resultSet = null;
//        try {
//            connection = JdbcUtils.getConnection(null);
//            String sql = "select * from users where u_name = ? and u_pwd = ?";
//            preparedStatement = connection.prepareStatement(sql);
//            preparedStatement.setString(1, name);
//            preparedStatement.setString(2, password);
//            resultSet = preparedStatement.executeQuery();
//            if (resultSet.next()) {
//                System.out.println("登录成功");
//            } else {
//                System.out.println("登录失败");
//
//            }
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        } finally {
//
//            try {
//                JdbcUtils.close(connection, preparedStatement, resultSet);
//            } catch (SQLException throwables) {
//                throwables.getStackTrace();
//            }
//        }
//    }
}
