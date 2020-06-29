package club.banyuan;

import java.sql.*;

public class JdbcUtils {
    private static String URL = "jdbc:mysql://localhost:3306/";
    private static String USER = "root";
    private static String PASSWORD = "ZZzs12138";
    private static String DB = "jdbc_practice";

    public static Connection getConnection(String deName) throws SQLException {
        String url = URL + DB;
        if (deName != null && deName != ""){
            url = URL+ deName;
        }
        Connection connection = DriverManager.getConnection(url,USER,PASSWORD);
        return connection;
    }
    public static void close(Connection connection, Statement statement) throws SQLException {
        if (statement!=null){
            statement.close();
        }
        if(connection!=null){
            connection.close();

        }
    }
    public static void close(Connection connection, Statement statement, ResultSet resultSet) throws SQLException {
        if(resultSet!= null){
            resultSet.close();
        }
        close(connection,statement);

    }
}
