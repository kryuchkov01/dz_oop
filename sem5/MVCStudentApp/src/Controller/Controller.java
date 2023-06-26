package Controller;

import java.util.ArrayList;
import java.util.List;

import Model.Model;
import Model.Student;
import View.View;
import View.ViewEng;

public class Controller {
    private iGetView view;
    private iGetModel model;
    private ViewEng viewEng;
    private List<Student> students;

    public Controller(iGetView view, iGetModel model, ViewEng viewEng) {
        this.view = view;
        this.model = model;
        this.viewEng = viewEng;
        this.students = new ArrayList<Student>();
    }
    
    public void getAllStudents()
    {
        students = model.getAllStudents();
    }

    public boolean testData(){
        if(students.size()>0){
            return true;
        }
        else{
            return false;
        }
    }

    public void update()
    {
        //MVP
        getAllStudents();
        if(testData()){
            view.printAllStudents(students);
            viewEng.printAllStudents(students);
        }
        else{
            System.out.println("List of students is empty.");
        }

        //MVC
        // view.printAllStudents(model.getAllStudents());
    } 

    public void run()
    {
        Commands com = Commands.NONE;
        boolean getNewIteration = true;
        while(getNewIteration)
        {
            String command = view.prompt("Введите команду:");
            com = Commands.valueOf(command.toUpperCase());
            switch(com)
            {
                case EXIT:
                    getNewIteration=false;
                    System.out.println("Выход из программы!");
                    break;
                case LIST:
                    getAllStudents();
                    view.printAllStudents(students);
                    break;
                case DELETE:
                    
            }

        }
    }
}
