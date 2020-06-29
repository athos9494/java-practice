package club.banyuan;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Login {
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
        statement = connection.createStatement();
        String sql = "select * from users where nam = '"+name+"' and pwd = '"+password+"'";
        resultSet = statement.executeQuery(sql);
        if (resultSet.next()){
            System.out.println("success");
        }
        else {
            System.out.println("faile");
        }
    }
}
