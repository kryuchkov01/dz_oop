package Services;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Employee;
import StudentDomen.PersonComparator;

public class EmployeeService implements iPersonService<Employee>{
    private int count;
    private List<Employee> employees;

    public EmployeeService() {
        this.employees = new ArrayList<Employee>();
    }

    @Override
    public List<Employee> getAll() {
        return employees;
    }

    @Override
    public void create(String firstName, String lastName, int age) {
        Employee per = new Employee(firstName, lastName, age, "basic"); //в классе Employee последнее String
        count++;
        employees.add(per);
    }

    public List<Employee> getSortedByFIOEmployeesList()
    {
        List<Employee> newEmplList =  new ArrayList<Employee>(employees);
        employees.sort(new PersonComparator<Employee>());
        return newEmplList;
    }
    
}
