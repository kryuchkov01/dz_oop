package Controllers;

import Services.EmployeeService;
import StudentDomen.Employee;


public class EmployeeController implements iPersonController<Employee>{

private final EmployeeService empServ = new EmployeeService();

    @Override
    public void create(String firstName, String lastName, int age) {
        empServ.create(firstName, lastName, age);
    }

    static public <T extends Employee> void paySalary(T person){
        System.out.println(person.getFirstName() + " выплачена зарплата 10000р.");
    }
    
}
