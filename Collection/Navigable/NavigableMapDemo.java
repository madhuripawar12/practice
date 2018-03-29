package Collection.Navigable;

import java.util.TreeMap;

/**
 * Created by mahadev on 28/3/18.
 */
public class NavigableMapDemo {
    public static void main(String[] args) {
        TreeMap tMap=new TreeMap (  );
        tMap.put ( 25,"Rutu" );
        tMap.put ( 21,"Kirti" );
        tMap.put ( 15,"Nisha" );
        tMap.put ( 35,"Bhagyashri" );
        tMap.put ( 34,"Pooja" );

        System.out.println (tMap);
        System.out.println ("Floor Entry For 25: "+tMap.floorEntry ( 25 ));
        System.out.println ("Floor Key For 25: "+tMap.floorKey ( 25 ));
        System.out.println ("Lower Entry For 25: "+tMap.lowerEntry ( 25 ));
        System.out.println ("Lower Key For 25: " +tMap.lowerKey ( 25 ));
        System.out.println ("Ceiling Entry For 25: "+tMap.ceilingEntry ( 25 ));
        System.out.println ("Ceiling Key For 25: "+tMap.ceilingKey (  25));
        System.out.println ("Heigher Entry For 25: "+tMap.higherEntry ( 25 ));
        System.out.println ("Heigher Key For 25: "+tMap.higherKey ( 25 ));

        System.out.println ("Descending Map: "+tMap.descendingMap ());
        System.out.println ("Descending Key Set: "+tMap.descendingKeySet ());
        System.out.println ("Polling First n Last Element: ");
        System.out.println ("First Entry: "+tMap.pollFirstEntry ());
        System.out.println ("Last Entry: "+tMap.pollLastEntry ());
        System.out.println ("TreeMap: "+tMap);
    }
}
