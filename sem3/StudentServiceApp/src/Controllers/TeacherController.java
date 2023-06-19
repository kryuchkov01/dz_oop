package Controllers;

import Services.TeacherService;
import StudentDomen.Teacher;

public class TeacherController implements iPersonController<Teacher>{

    private final TeacherService teacherServ = new TeacherService();

    @Override
    public void create(String firstName, String lastName, int age) {
        teacherServ.create(firstName, lastName, age);
    }
    
    static public <T extends Teacher> void payBonus(T person){
        System.out.println(person.getFirstName() + " выплачена премия 12000р. по результатам городской олимпиады");
    }
}
