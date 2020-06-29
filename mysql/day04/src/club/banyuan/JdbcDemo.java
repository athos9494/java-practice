package club.banyuan;

import java.sql.*;

public class JdbcDemo {
    public static void main(String[] args) throws SQLException {
        Statement statement = null;
        Connection connection = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "ZZzs12138");
            statement = connection.createStatement();
//            statement.executeUpdate("insert into student values (05,'田七','1990-08-08')");
            resultSet = statement.executeQuery("select * from student");
            int id = 0;
            String name = null;
            Date birth = null;
            while (resultSet.next()) {
                id = resultSet.getInt(1);
                name = resultSet.getString(2);
                birth = resultSet.getDate(3);
                System.out.println("id :" + id + "\tname:" + name + "\tdate" + birth);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        finally {
            resultSet.close();
            statement.close();
            connection.close();

        }
    }
}
