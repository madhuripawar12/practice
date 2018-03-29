package Collection.Map;

import java.util.TreeMap;
import java.util.WeakHashMap;

/**
 * Created by mahadev on 28/3/18.
 */
public class TreeMapWHMapDemo {
    public static void main(String[] args) {
        WeakHashMap wMap=new WeakHashMap (  );
        wMap.put ( "Kirti",20 );
        wMap.put ( "Rutu" ,21 );
        wMap.put ( "Bhagyashri",20 );
        wMap.putIfAbsent ( "Rutu",22 );
        wMap.put ( "Nisha",19 );

        wMap.put (  "Namrata",23);

        System.out.println ("WeakHashMap:");
        System.out.println (wMap);
        wMap.remove ("Namrata"  );
        System.gc ();
        System.out.println ("After Removing Namrata From Weak Hash Map:\n"+wMap);

        TreeMap tMap=new TreeMap ( wMap );
        System.out.println ("Tree Map:");
        System.out.println (tMap);
        wMap.remove ("Bhagyashri"  );
        System.gc ();
        System.out.println ("After Removing Bhagyashri From TreeMap:\n"+tMap);



    }
}
