package Services;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.PersonComparator;
import StudentDomen.Teacher;

public class TeacherService implements iPersonService<Teacher>{
    private int ID;
    private List<Teacher> teachers;
    
    public TeacherService() {
        this.teachers = new ArrayList<Teacher>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String firstName, String lastName, int age) {
        Teacher per = new Teacher(firstName, lastName, age, ID);
        ID++;
        teachers.add(per);
    }

    public List<Teacher> getSortedByFIOTeachersList()
    {
        List<Teacher> newTeachList =  new ArrayList<Teacher>(teachers);
        teachers.sort(new PersonComparator<Teacher>());
        return newTeachList;
    }
    
}
