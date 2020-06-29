package club.banyuan;

import java.sql.*;


public class Jdbc4 {
    public static void main(String[] args) throws SQLException {
        Statement statement = null;
        Connection connection = null;
        ResultSet resultSet = null;
        try {
            connection = JdbcUtils.getConnection(null);
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
            JdbcUtils.close(connection,statement,resultSet);
        }
    }
}
