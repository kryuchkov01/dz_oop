
import java.util.Iterator;
import java.util.List;
//sort groups by size

public class StudentGroup<T extends Comparable<T>, V> implements Iterable<Student<T, V>>, Comparable<StudentGroup<T, V>>{ //добавить итератор по группе
    private List<Student<T, V>> students;
    private V studCount;
    private V groupId;

    public StudentGroup(List<Student<T,V>> students) {
        this.students = students;

    }

    public List<Student<T,V>> getStudents() {
        return students;
    }

    public void setStudents(List<Student<T,V>> students) {
        this.students = students;
    }

    @Override
    public Iterator<Student<T,V>> iterator() {
        return new StudentGroupIterator(students);
    }

    public V getStudCount() {
        return studCount;
    }

    public void setStudCount(V studCount) {
        this.studCount = studCount;
    }

    public V getGroupId() {
        return groupId;
    }

    public void setGroupId(V groupId) {
        this.groupId = groupId;
    }

     @Override
    public int compareTo(StudentGroup o) { //сортировка по кол-ву студентов и номеру группы
        if(this.studCount==o.studCount)
        {
            if(this.groupId==o.groupId)
            {
               return 0; 
            }
            if(this.groupId<o.groupId)
            {
                return -1;
            }
            return 1;
        }
        if(this.studCount<o.studCount)
        {
            return -1;
        }
        return 1;
    }

    @Override
    public String toString() {
        return "StudentGroup [groupId=" + groupId + ", studCount=" + studCount + ", groupId=" + students + "]";
    }

    

}
