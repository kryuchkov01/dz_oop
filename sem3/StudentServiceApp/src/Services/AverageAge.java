package Services;

import java.util.List;

import StudentDomen.User;

public class AverageAge<T extends User>{

    List<T> getAll();

    public static <T> AverAge(List<T> number){
        double meanAge = 0;
        for(T person : number){
            meanAge += person.getAge() ;
        }
        return meanAge/number.size();
    }

}
