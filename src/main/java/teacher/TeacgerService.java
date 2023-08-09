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
                teacher.setTeacherId(resultSet.getInt("id"));
                teacher.setTeacherName(resultSet.getString("name"));
                teacher.setTeacherSurname(resultSet.getString("surename"));
                teacher.setTeacherEmail(resultSet.getString("email"));
                teacher.setTeacherPassword(resultSet.getString("password"));
                teacher.setTeacherPhoneNumber(resultSet.getString("phoneNumber"));

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
