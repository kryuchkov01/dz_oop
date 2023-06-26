import java.io.File;
import java.util.ArrayList;
import java.util.List;

import View.View;

import Controller.Controller;
import Controller.iGetModel;
import Controller.iGetView;
import Model.FileModel;
import Model.Model;
import Model.Student;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        Student s1 = new Student("Sergey", "Ivanov", 23, 101);
        Student s2 = new Student("Andrey", "Sidorov", 23, 111);
        Student s3 = new Student("Ivan", "Petrov", 23, 121);
        Student s4 = new Student("Igor", "Ivanov", 21, 301);
        Student s5 = new Student("Dasha", "Cvetkova", 21, 171);
        Student s6 = new Student("Lena", "Ivanova", 21, 104);

        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);

        FileModel fModel = new FileModel("StudentsDB.txt");
        // fModel.saveAllStudentToFile(listStud);

        iGetModel model = new Model(listStud);
        iGetModel newFModel = fModel;
        iGetView view = new View();
        

        Controller controller = new Controller(view, newFModel);
        // controller.update();
        controller.run();


    }
}
