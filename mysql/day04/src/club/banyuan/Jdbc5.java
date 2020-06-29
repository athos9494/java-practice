package club.banyuan;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class Jdbc5 {
    public static void main(String[] args) throws SQLException {
        Statement statement = null;
        Connection connection = null;
        ResultSet resultSet = null;
        List<Student>studentList =new ArrayList<>();
        try {
            connection = JdbcUtils.getConnection(null);
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from student");
            while (resultSet.next()) {
                Student student = new Student();
                student.setId(resultSet.getInt(1));
                student.setName(resultSet.getString(2));
                student.setBirth(resultSet.getDate(3));
                studentList.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.close(connection,statement,resultSet);
        }
        for (Student s:studentList
             ) {
            System.out.println(s);
        }
    }
}
