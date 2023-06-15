import StudentDomen.Student;
import StudentDomen.StudentFlow;
import StudentDomen.StudentGroup;
import StudentDomen.Teacher;
import StudentDomen.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        User u1 = new User("Sergey", "Ivanov", 25);
        Student s1 = new Student("Sergey", "Ivanov", 23, 101);
        Student s2 = new Student("Andrey", "Sidorov", 23, 111);
        Student s3 = new Student("Ivan", "Petrov", 23, 121);
        Student s4 = new Student("Igor", "Ivanov", 21, 301);
        Student s5 = new Student("Dasha", "Cvetkova", 21, 171);
        Student s6 = new Student("Lena", "Ivanova", 21, 104);
        Teacher t1 = new Teacher("Andrey", "Kryuchkov", 29, 10047);
        
        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);

        List<Student> listStud2 = new ArrayList<Student>();
        listStud2.add(new Student("Kirill", "Sidorov", 23, 131));
        listStud2.add(new Student("Alexandr", "Pechorin", 24, 114));
        listStud2.add(new Student("Valeria", "Petrova", 24, 211));
        listStud2.add(new Student("Karina", "Sergeeva", 21, 117));
        
        List<Student> listStud3 = new ArrayList<Student>();
        listStud3.add(new Student("Igor", "Alexeev", 23, 201));
        listStud3.add(new Student("Irina", "Andreeeva", 22, 511));
        listStud3.add(new Student("Iosiph", "Stalin", 23, 145));
        listStud3.add(new Student("Vladimir", "Lenin", 24, 311));
        listStud3.add(new Student("Arina", "Gitler", 23, 041));

        List<Student> listStud4 = new ArrayList<Student>();
        listStud3.add(new Student("Adam", "Smith", 23, 201));
        listStud3.add(new Student("Irina", "Andreeeva", 22, 511));
        listStud3.add(new Student("Antoshka", "Stalin", 23, 145));
        listStud3.add(new Student("Vladimir", "Lenin", 24, 311));
        listStud3.add(new Student("Karl", "Marks", 23, 041));        
       
        StudentGroup group1 = new StudentGroup(listStud);
        StudentGroup group2 = new StudentGroup(listStud2);
        StudentGroup group3 = new StudentGroup(listStud3);
        StudentGroup group4 = new StudentGroup(listStud4);

        group1.setStudCount(6);
        group2.setStudCount(4);
        group3.setStudCount(5);
        group4.setStudCount(5);

        group1.setGroupId(101);
        group2.setGroupId(202);
        group3.setGroupId(303);
        group4.setGroupId(204);


        List<StudentGroup> flow1 = new ArrayList<StudentGroup>();
        flow1.add(group1);
        flow1.add(group2);
        flow1.add(group3);
        flow1.add(group4);

        StudentFlow flow = new StudentFlow(flow1);
        flow.setFlowNumber(16);
        flow.setGroupCount(3);

        for(StudentGroup group : flow)  //пройтись сортировкой по потоку групп
        {
            System.err.println("Группа № "+group.getGroupId());
            for(Student stud : group){
                System.out.println(stud);
            }
            System.out.println("Кол-во студентов в группе :"+group.getStudCount());
            System.out.println();
        }

        Collections.sort(flow.getGroups());

        System.out.println("После сортировки :");
        for(StudentGroup group : flow)  
        {
            System.err.println("Группа № "+group.getGroupId());
            for(Student stud : group){
                System.out.println(stud);
            }
            System.out.println("Кол-во студентов в группе :"+group.getStudCount());
             System.out.println();
        }



        // System.out.println();
        // Collections.sort(group1.getStudents());

        // for(Student stud : group1)
        // {
        //     System.out.println(stud);
        // }
        

        // System.out.println(u1);
        // System.out.println(s1);
        // System.out.println(t1);
        // System.out.println(group1);
    }
}
