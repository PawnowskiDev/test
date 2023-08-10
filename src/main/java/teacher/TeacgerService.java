package teacher;

import database.DbConnector;
import student.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TeacgerService {

    public Teacher getTeacherById (int teacherId)
            throws SQLException {
        Connection connection = DbConnector.getConnection();
        String QUERY = "SELECT * FROM teacher WHERE id = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(QUERY)) {
            preparedStatement.setInt(1, teacherId);
            ResultSet resultSet= preparedStatement.executeQuery();

            if (resultSet.next()) {

                Teacher teacher = new Teacher();
                teacher.setId(resultSet.getInt("id"));
                teacher.setName(resultSet.getString("name"));
                teacher.setSurname(resultSet.getString("surename"));
                teacher.setEmail(resultSet.getString("email"));
                teacher.setPassword(resultSet.getString("password"));
                teacher.setPhoneNumber(resultSet.getString("phoneNumber"));

                return teacher;
            }
        }
        return null;
    }

    public List<Teacher> getTeacherByFullName (String name, String surname)
            throws SQLException {
        Connection connection = DbConnector.getConnection();
        String QUERY = "SELECT * FRP, teacher WHERE name = ? AND surname = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(QUERY)) {
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, surname);
            ResultSet resultSet = preparedStatement.executeQuery();

            List<Teacher> teachers = new ArrayList<>();

            while (resultSet.next()) {
                Teacher teacher = new Teacher();
                // ustawiianie danych nauczyciela na podstawie wyników zapytania
                teachers.add(teacher);
            }
            return teachers;
        }
    }
}
