

public class Student<T extends Comparable<T>, V> extends User<T, V> implements Comparable<Student<T, V>>{
    
    private V StudId;
    
    public Student(T firstName, T lastName, V age, V StudId) {
        super(firstName, lastName, age);
        this.StudId = StudId;
    }

    @Override
    public V getAge() {

        return super.getAge();
    }

    @Override
    public T getFirstName() {
       
        return super.getFirstName();
    }

    @Override
    public T getLastName() {
        
        return super.getLastName();
    }

    @Override
    public void setAge(V age) {
        
        super.setAge(age);
    }

    @Override
    public void setFirstName(T firstName) {
        
        super.setFirstName(firstName);
    }

    @Override
    public void setLastName(T lastName) {
        
        super.setLastName(lastName);
    }

    public V getStudId() {
        return StudId;
    }

    public void setStudId(V studId) {
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
    public int compareTo(Student<T, V> o) {
        return super.firstName.compareTo(o.firstName);
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
