package ComparatorDemo;

/**
 * Created by mahadev on 22/3/18.
 */
public class Student implements Comparable{
    int rollNo;
    String name;
    Student(int rollNo,String name){
        this.rollNo=rollNo;
        this.name=name;
    }

    @Override
    public int compareTo(Object o) {
        Student s=(Student)o;
        if(this.rollNo<s.rollNo)
            return -1;
        if(this.rollNo>s.rollNo)
            return 1;
        return 0;
    }

    @Override
    public String toString() {
        return this.rollNo+" "+this.name+" ";
    }
}
