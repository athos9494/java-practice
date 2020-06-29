package club.banyuan;

import javax.xml.transform.Result;
import java.sql.*;


public class Jdbc3 {
    public static void main(String[] args) throws SQLException {
        Statement statement = null;
        Connection connection = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1?characterEncoding = utf8", "root", "ZZzs12138");
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from student");
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                Date date = resultSet.getDate(3);
                System.out.println("id:" + id + "\t name:" + name + "\t date:" + date);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            resultSet.close();

            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }
}
