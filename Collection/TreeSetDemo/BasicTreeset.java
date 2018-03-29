package Collection.TreeSetDemo;

import java.util.TreeSet;

/**
 * Created by mahadev on 23/3/18.
 */
public class BasicTreeset {
    public static void main(String[] args) {
        TreeSet set=new TreeSet (  );
        System.out.println ("Is Set Empty:"+set.isEmpty ());
        set.add ( 10 );
        set.add(5);
        set.add ( 6 );
        set.add ( 87 );
        set.add ( 4 );
        System.out.println ("Atfer INSERTING elements:");
        System.out.println ("Is Set Empty:"+set.isEmpty ());

        System.out.println (set);
    }

}
