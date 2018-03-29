package Collection.Map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by mahadev on 27/3/18.
 */
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap linkedHashMap=new LinkedHashMap (  );
        linkedHashMap.put ( "Kirti",20 );
        linkedHashMap.put ( "Rutu" ,21 );
        linkedHashMap.put ( "Bhagyashri",20 );
        linkedHashMap.put ( "Rutu",22 );
        linkedHashMap.put ( "Nisha",19 );
        linkedHashMap.put ( 12,"Namrata" );

        System.out.println ("Rutu is Present ??: "+linkedHashMap.containsKey ( "Rutu" ));
        System.out.println ();
        Set set=linkedHashMap.entrySet ();
        Iterator itr=set.iterator ();
        while (itr.hasNext ()){
            Map.Entry me= (Map.Entry) itr.next ();
            System.out.println ("Key  "+me.getKey ()+"  "+" value  "+me.getValue ());
        }
        System.out.println ("All keys : "+linkedHashMap.keySet ());
        System.out.println ("Is 22 value is present: "+linkedHashMap.containsValue ( 22 ));
        System.out.println ("Value of key Rutu:" +linkedHashMap.get ( "Rutu" ));
        System.out.println ("All Values: "+linkedHashMap.values ());


    }
}
