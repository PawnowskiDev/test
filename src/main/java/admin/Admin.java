package admin;

public class Admin {

    // todo tak samo jak w klasie student

    private String adminId;
    private String adminName;
    private String adminSurname;
    private String adminEmail;
    private String adminPassword;
    private String adminPhoneNumber;


    // todo Metoda logowania admina
    public boolean login(String email, String password) {
        return email.equals(adminEmail) && password.equals(adminPassword);
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

