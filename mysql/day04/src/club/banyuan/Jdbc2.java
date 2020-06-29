package club.banyuan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Jdbc2 {
    public static void main(String[] args) throws SQLException {
        Statement statement = null;
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1?characterEncoding = utf8", "root", "ZZzs12138");
            statement = connection.createStatement();
//            statement.executeUpdate("insert into student values (02,'李四','1993-04-04')");
//            statement.executeUpdate("insert into student values (03,'王五','1993-04-04')");
//            statement.executeUpdate("insert into student values (04,'赵六','1993-04-04')");
            statement.executeUpdate("update student set birth = '1994-09-06'where id = 3");

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
