package Services;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Student;

public class StudentService {
    private int count;
    private List<Student> students;
    
    public StudentService() {
        this.students = new ArrayList<Student>();
    }
}
