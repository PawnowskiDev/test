package student;

import database.DbConnector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentService {


    public Student createStudentFromResultSet (ResultSet resultSet)
        throws SQLException {
        Student student  = new Student();
        student.setId(resultSet.getInt("id"));
        student.setName(resultSet.getString("name"));
        student.setSurname(resultSet.getString("surename"));
        student.setBirthdate(resultSet.getString("birthdate"));
        student.setPesel(resultSet.getString("pesel"));
        student.setEmail(resultSet.getString("email"));
        student.setPassword(resultSet.getString("password"));
        student.setPhoneNumber(resultSet.getString("phoneNumber"));
        student.setGrades(resultSet.getString("grades"));
        student.setBehaviourGrades(resultSet.getString("behaviourGrade"));

        return student;
    }


    public Student getStudentById (int studentId)
        throws SQLException {
        Connection connection = DbConnector.getConnection();
        String QUERY = "SELECT * FROM student WHERE id = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(QUERY)) {
            preparedStatement.setInt(1, studentId);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                return createStudentFromResultSet(resultSet);
            }
        } finally {
            connection.close();
        }
        return null;
    }

    public Student getStudentByPesel (String pesel)
            throws SQLException {
        Connection connection = DbConnector.getConnection();
        String QUERY = "SELECT * FROM student WHERE pesel = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(QUERY)) {
            preparedStatement.setString(1, pesel);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                return createStudentFromResultSet(resultSet);
            }
        }
        return null;
    }

}
