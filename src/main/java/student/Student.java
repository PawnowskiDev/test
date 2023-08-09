package student;

import user.User;

public class Student extends User {

    private String pesel;
    private String birthdate;

    public Student() {}

    public Student(int id, String name, String surname, String birthdate, String pesel,
                   String email, String password, String phoneNumber, String grades,
                   String behaviourGrades) {
        this.setId(id);
        this.setName(name);
        this.setSurname(surname);
        this.birthdate = birthdate;
        this.pesel = pesel;
        this.setEmail(email);
        this.setPassword(password);
        this.setPhoneNumber(phoneNumber);
    }

    public String getPesel() {
        return pesel;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
}


