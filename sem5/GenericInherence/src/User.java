
public class User<T, V> {
    
    private T FirstName;
    private T LastName;
    private V age;
    
    
    public User(T firstName, T lastName, V age) {
        FirstName = firstName;
        LastName = lastName;
        this.age = age;
    }

    public T getFirstName() {
        return FirstName;
    }

    public void setFirstName(T firstName) {
        FirstName = firstName;
    }

    public T getLastName() {
        return LastName;
    }

    public void setLastName(T lastName) {
        LastName = lastName;
    }

    public V getAge() {
        return age;
    }

    public void setAge(V age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User [FirstName=" + FirstName + ", LastName=" + LastName + ", age=" + age + "]";
    }

    
   
}
