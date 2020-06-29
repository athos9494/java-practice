package club.banyuan;

import java.sql.*;
import java.util.Scanner;

public class Login1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String name = sc.nextLine();
        System.out.println("请输入密码:");
        String password = sc.nextLine();
        try {
            login(name, password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
    public static void login(String name ,String password) throws SQLException {
        Statement statement = null;
        Connection connection = null;
        ResultSet resultSet = null;
        connection = JdbcUtils.getConnection(null);
        String sql = "select * from users where nam =? and pwd = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,name);
        preparedStatement.setString(2,password);
        resultSet = preparedStatement.executeQuery();
        if (resultSet.next()){
            System.out.println("success");
        }
        else {
            System.out.println("faile");
        }

        JdbcUtils.close(connection,preparedStatement,resultSet);
    }
}
