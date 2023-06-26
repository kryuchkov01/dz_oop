package View;

import java.util.List;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;

public class ViewEng implements iGetView{
    public void printAllStudents(List<Student> students) {

        System.out.println("-----------Output:List of students-----------");
        for(Student stud : students){
            System.out.println(stud);
        }
        System.out.println("-----------End of the List.-----------");
    }

    @Override
    public String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        return in.nextLine();
    }
}
