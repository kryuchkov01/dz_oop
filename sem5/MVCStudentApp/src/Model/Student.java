package Model;

public class Student extends User implements Comparable<Student>{
    
    private long StudId;
    
    public Student(String firstName, String lastName, int age, long StudId) {
        super(firstName, lastName, age);
        this.StudId = StudId;
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

    public long getStudId() {
        return StudId;
    }

    public void setStudId(long studId) {
        StudId = studId;
    }

    @Override
    public String toString() {
        return "Student [FirstName=" + super.getFirstName() + 
        ", LastName=" + super.getLastName() + 
        ", age=" + super.getAge() +
        ", StudId=" + StudId +
        "]";
    }

    @Override
    public int compareTo(Student o) {

        System.out.println(super.getFirstName()+" - "+o.getFirstName());
        if(super.getAge()==o.getAge())
        {
            if(this.StudId==o.StudId)
            {
                return 0;
            }
            if(this.StudId<o.StudId)
            {
                return -1;
            }
            return 1;
        }
        if(super.getAge()<o.getAge())
        {
            return -1;
        }
        return 1;
    }

    // @Override
    // public int compareTo(Student o) {
    //     if(this.StudId==o.StudId)
    //     {
    //         return 0;
    //     }
    //     if(this.StudId<o.StudId)
    //     {
    //         return -1;
    //     }
    //     return 1;
    // }



    
}
