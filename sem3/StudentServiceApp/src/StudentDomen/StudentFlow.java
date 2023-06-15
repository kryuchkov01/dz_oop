package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentFlow implements Iterable<StudentGroup>{
    
    private List<StudentGroup> groups;
    private int flowNumber;
    private int groupCount;

    public StudentFlow(List<StudentGroup> groups) {
        this.groups = groups;
    }

    public List<StudentGroup> getGroups() {
        return groups;
    }

    public void setGroups(List<StudentGroup> groups) {
        this.groups = groups;
    }

    public int getFlowNumber() {
        return flowNumber;
    }

    public void setFlowNumber(int flowNumber) {
        this.flowNumber = flowNumber;
    }

    public int getGroupCount() {
        return groupCount;
    }

    public void setGroupCount(int groupCount) {
        this.groupCount = groupCount;
    }

    @Override
    public Iterator<StudentGroup> iterator(){
        return new Iterator<StudentGroup>(){
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index<groups.size(); 
            }
            @Override
            public StudentGroup next() {
                if(!hasNext())
                {
                    return null;
                }
                return groups.get(index++); 
            }
        };

        
    }

    @Override
    public String toString() {
        return "StudentFlow [flowNumber=" + flowNumber + ", groupCount=" + groupCount +"groups=" + groups + "]"; //+ groupId(?)
    }

    
    
}
