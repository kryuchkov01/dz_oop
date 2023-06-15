package StudentDomen;
import java.util.Iterator;
import java.util.List;
//sort groups by size

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup>{ //добавить итератор по группе
    private List<Student> students;
    private int studCount;
    private int groupId;

    public StudentGroup(List<Student> students) {
        this.students = students;

    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(students);
    }

    public int getStudCount() {
        return studCount;
    }

    public void setStudCount(int studCount) {
        this.studCount = studCount;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
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
