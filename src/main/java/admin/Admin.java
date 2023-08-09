package admin;

import user.User;

public class Admin extends User {

    // todo tak samo jak w klasie student


    // todo Metoda logowania admina
    public boolean login(String email, String password) {
        return email.equals(getEmail()) && password.equals(getPassword());
    }

    // todo Metoda tworzenia nowego nauczyciela
    public void createTeacher(String name, String surname, String email, String password, String phoneNumber) {
    }

    // todo Metoda tworzenia nowego studenta
    public void createStudent(String name, String surname, String studentId, String email, String password) {
    }

    // todo Metoda tworzenia nowego rodzica1
    public void createParent1(String name, String surname, String email, String password) {
    }

    // todo Metoda tworzenia nowego rodzica2
    public void createParent2(String name, String surname, String email, String password) {
    }
}

