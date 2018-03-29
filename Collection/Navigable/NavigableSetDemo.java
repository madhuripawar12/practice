package Collection.Navigable;

import java.util.TreeSet;

/**
 * Created by mahadev on 28/3/18.
 */
public class NavigableSetDemo {
    public static void main(String[] args) {
        TreeSet set=new TreeSet (  );
        System.out.println ("Is Set Empty:"+set.isEmpty ());
        set.add ( 10 );
        set.add(5);
        set.add ( 6 );
        set.add ( 20 );
        set.add ( 15 );
        set.add ( 25 );
        set.add ( 87 );
        set.add ( 4 );
        System.out.println ("Atfer INSERTING elements:");
        System.out.println ("Is Set Empty:"+set.isEmpty ());

        System.out.println (set);
        System.out.println ("Floor for 20: "+set.floor ( 20 ));
        System.out.println ("Lower for 20: "+set.lower ( 20 ));
        System.out.println ("Ceiling For 20: "+set.ceiling ( 20 ));
        System.out.println ("Heigher For 20: "+set.higher ( 20 ));
        System.out.println ("Descending Set: "+set.descendingSet ());
        System.out.println ("Polling First And Last Entry: ");
        System.out.println ("First Entry: "+set.pollFirst ());
        System.out.println ("Last Entry: "+set.pollLast ());
        System.out.println ("Set:"+set);
    }
}
