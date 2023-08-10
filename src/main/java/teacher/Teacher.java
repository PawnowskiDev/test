package teacher;

import user.User;

public class Teacher extends User {

    public Teacher() {
    }

    public Teacher(int id, String name, String surname, String email, String password, String phoneNumber) {
        super(id, name, surname, email, password, phoneNumber);
    }


}
