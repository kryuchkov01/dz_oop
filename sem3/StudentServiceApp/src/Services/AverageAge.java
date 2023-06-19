package Services;

import java.util.List;

import StudentDomen.User;

public interface AverageAge<T extends User>{

    List<T> getAll();

    public double AverAge(List<T> number){
        double meanAge = 0;
        for(T person : number){
            meanAge += person.getAge() ;
        }
        return meanAge/number.size();
    }

}
