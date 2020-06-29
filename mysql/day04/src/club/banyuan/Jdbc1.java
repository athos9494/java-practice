package club.banyuan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Jdbc1 {
    public static void main(String[] args) throws SQLException {
        Statement statement = null;
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1?characterEncoding = utf8", "root", "ZZzs12138");
            statement = connection.createStatement();
            statement.executeUpdate("create table student ( id int primary key auto_increment," + "name varchar(20) not null, birth date)"
            );
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(statement!=null){
                statement.close();
            }
            if(connection!=null){
                connection.close();
            }
        }
    }
}
