package Collection.TreeSetDemo;



import java.util.Comparator;

/**
 * Created by mahadev on 23/3/18.
 */
public class HumanComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Human h=(Human)o1;
        Human h1=(Human)o2;
        int result = h.name.compareTo ( h1.name );
        System.out.println (result);
        return result;

    }
}
