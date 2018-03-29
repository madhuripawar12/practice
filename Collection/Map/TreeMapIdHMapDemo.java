package Collection.Map;

import ComparatorDemo.StringSort;

import java.util.IdentityHashMap;
import java.util.TreeMap;

/**
 * Created by mahadev on 28/3/18.
 */
public class TreeMapIdHMapDemo {
    public static void main(String[] args) {
        IdentityHashMap idMap=new IdentityHashMap (  );
        String s1=new String ( "Rutu" );
        String s2=new String ( "Kirti" );
        String s3=new String ( "Rutu" );
        String s4=new String ( "Bhagyashri" );

        idMap.put ( s1,20 );
        idMap.put ( s2,21 );
        idMap.put ( s3,22 );
        idMap.put ( s4,23 );
        System.out.println ("Identity Hash Map");
        System.out.println (idMap);

        TreeMap tMap=new TreeMap ( idMap );
        System.out.println ("TreeMap");
        System.out.println (tMap);
    }
}
