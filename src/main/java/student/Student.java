package student;

public class Student {
    private int id;
    private String name;
    private String surname;
    private String birthdate;
    private String pesel;
    private String email;
    private String password;
    private String phoneNumber;
    private String grades;
    private String behaviourGrades;


    public Student() {}

    public Student(int id, String name, String surname, String birthdate, String pesel,
                   String email, String password, String phoneNumber, String grades,
                   String behaviourGrades) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
        this.pesel = pesel;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.grades = grades;
        this.behaviourGrades = behaviourGrades;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getPesel() {
        return pesel;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getGrades() {
        return grades;
    }

    public String getBehaviourGrades() {
        return behaviourGrades;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setGrades(String grades) {
        this.grades = grades;
    }

    public void setBehaviourGrades(String behaviourGrades) {
        this.behaviourGrades = behaviourGrades;
    }
}


