package Controllers;

import java.util.List;

import StudentDomen.User;

public interface iPersonController<T extends User> {

    void create(String firstName, String lastName, int age);
}
