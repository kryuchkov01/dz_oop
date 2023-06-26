package Model;

public class Teacher extends User{
    
   private long TeachId;

    
    public Teacher(String firstName, String lastName, int age, long TeachId) {
        super(firstName, lastName, age);
        this.TeachId = TeachId;
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

    public long getTeachId() {
        return TeachId;
    }

    public void setTeachId(long teachId) {
        TeachId = teachId;
    }

    @Override
    public String toString() {
        return "Teacher [TeachId=" + TeachId +  
        ", FirstName=" + super.getFirstName() + 
        ", LastName=" + super.getLastName() + 
        ", age=" + super.getAge() +
        "]";
    }
    
}
