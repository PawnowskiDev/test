package admin;

import database.DbConnector;
import org.mindrot.jbcrypt.BCrypt;
import user.User;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;

public class Admin extends User {

    // todo tak samo jak w klasie student


    // todo Metoda logowania admina
    public boolean login(String email, String password) {
        return email.equals(getEmail()) && password.equals(getPassword());
    }

    public void createUser(String tableName, String name, String surname, String email, String password, String phoneNumber,
                           String additionalField1, String additionalField2, String additionalField3, String additionalField4) {

        String QUERY = "INSERT INTO" + tableName + "(name, surname, email, password, phoneNumber, additionalField1, " +
                       "additionalField2, additionalField3, additionalField4) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        // Sol i haszowanie hasła
        String salt = BCrypt.gensalt(12);
        String hashedPassword = BCrypt.hashpw(password, salt);

        try (PreparedStatement preparedStatement = DbConnector.getConnection().prepareStatement(QUERY)) {
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, surname);
            preparedStatement.setString(3, email);
            preparedStatement.setString(4,password);
            preparedStatement.setString(5, phoneNumber);
            preparedStatement.setString(6, additionalField1);
            preparedStatement.setString(7, additionalField2);
            preparedStatement.setString(8, additionalField3);
            preparedStatement.setString(9, additionalField4);

            if (additionalField1 != null && additionalField2 != null) {
                preparedStatement.setString(6, additionalField1);
                preparedStatement.setString(7, additionalField2);
                preparedStatement.setString(8, additionalField3);
                preparedStatement.setString(9, additionalField4);
            } else {
                preparedStatement.setNull(6, Types.VARCHAR);
                preparedStatement.setNull(7, Types.VARCHAR);
                preparedStatement.setNull(8, Types.VARCHAR);
                preparedStatement.setNull(9, Types.VARCHAR);
            }


            int rowsInserted = preparedStatement.executeUpdate();

            if (rowsInserted > 0) {
                System.out.println("Nowy użytkownik dodany pomyślnie.");
            } else {
                System.out.println("Nie udało się dodać nowego użytkownika.");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}

