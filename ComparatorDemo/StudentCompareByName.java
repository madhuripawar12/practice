package ComparatorDemo;

import java.util.Comparator;

/**
 * Created by mahadev on 22/3/18.
 */
public class StudentCompareByName implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Student s1=(Student)o1;
        Student s2=(Student)o2;

        return StringSort.DictSort ( s1.name,s2.name );

    //    return s1.name.compareTo ( s2.name );

    }
}
