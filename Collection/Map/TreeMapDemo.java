package Collection.Map;

import java.util.TreeMap;

/**
 * Created by mahadev on 27/3/18.
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap tMap=new TreeMap (  );
        tMap.put ( "Kirti",20 );
        tMap.put ( "Rutu",22 );
        tMap.put ( "Ankita",21 );
        tMap.put ( "Rutu",25);
        tMap.put ( "Bhagi",28 );
        System.out.println (tMap);
        System.out.println (""+tMap.ceilingEntry ( "Rutu" ));
        System.out.println (""+tMap.ceilingKey ( "Rutu" ));
        System.out.println (""+tMap.firstEntry ());
        System.out.println (""+tMap.descendingKeySet ());
        System.out.println (""+tMap.descendingMap ());
        System.out.println (""+tMap.floorEntry ("Rutu" ));
        System.out.println (""+tMap.floorKey ("Rutu"));
        System.out.println (tMap);
        System.out.println (tMap.lowerEntry ( "Rutu" ));
        System.out.println (tMap.lowerKey ( "Rutu" ));
        System.out.println ();
        System.out.println (tMap.higherEntry ( "Kirti" ));
        System.out.println (tMap.higherKey ( "Ritu" ));

        System.out.println (""+tMap.pollFirstEntry ());
        System.out.println (" "+tMap.pollLastEntry ());
        System.out.println (tMap);
    }

}
