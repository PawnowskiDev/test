package teacher;

public class Teacher {

    // todo tak samo jak w klasie student

    private int teacherId;
    private String teacherName;
    private String teacherSurname;
    private String teacherEmail;
    private String teacherPassword;
    private String teacherPhoneNumber;
    private String teacherSchoolSubcjet;

    public Teacher() {
    }

    public int getTeacherId() {
        return teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String getTeacherSurname() {
        return teacherSurname;
    }

    public String getTeacherEmail() {
        return teacherEmail;
    }

    public String getTeacherPassword() {
        return teacherPassword;
    }

    public String getTeacherPhoneNumber() {
        return teacherPhoneNumber;
    }

    public String getTeacherSchoolSubcjet() {
        return teacherSchoolSubcjet;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public void setTeacherSurname(String teacherSurname) {
        this.teacherSurname = teacherSurname;
    }

    public void setTeacherEmail(String teacherEmail) {
        this.teacherEmail = teacherEmail;
    }

    public void setTeacherPassword(String teacherPassword) {
        this.teacherPassword = teacherPassword;
    }

    public void setTeacherPhoneNumber(String teacherPhoneNumber) {
        this.teacherPhoneNumber = teacherPhoneNumber;
    }

    public void setTeacherSchoolSubcjet(String teacherSchoolSubcjet) {
        this.teacherSchoolSubcjet = teacherSchoolSubcjet;
    }
}
