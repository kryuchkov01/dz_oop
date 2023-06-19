package StudentDomen;

public class Employee extends User{
    

    private String special;

    public Employee(String firstName, String lastName, int age, String special) {
        super(firstName, lastName, age);
        this.special = special;
    }


    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    @Override
    public int getAge() {

        return super.getAge();
    }

    @Override
    public String getFirstName() {
       
        return super.getFirstName();
    }

    @Override
    public String getLastName() {
        
        return super.getLastName();
    }

    @Override
    public void setAge(int age) {
        
        super.setAge(age);
    }

    @Override
    public void setFirstName(String firstName) {
        
        super.setFirstName(firstName);
    }

    @Override
    public void setLastName(String lastName) {
        
        super.setLastName(lastName);
    }

    @Override
    public String toString() {
        return "Employee [FirstName=" + super.getFirstName() + 
        ", LastName=" + super.getLastName() + 
        ", age=" + super.getAge() + ", special=" + special + "]";
    }

    
}

