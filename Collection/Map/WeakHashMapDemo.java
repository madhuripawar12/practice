package Collection.Map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/**
 * Created by mahadev on 27/3/18.
 */
public class WeakHashMapDemo {
    public static void main(String[] args) throws InterruptedException {
        WeakHashMap wmap=new WeakHashMap (  );
        wmap.put ( "Kirti",20 );
        wmap.put ( "Rutu" ,21 );
        wmap.put ( "Bhagyashri",20 );
        wmap.putIfAbsent ( "Rutu",22 );
        wmap.put ( "Nisha",19 );
        wmap.put ( 12,"Namrata" );
        wmap.put (  "Namrata",23);

        System.out.println ("Rutu is Present ??: "+wmap.containsKey ( "Rutu" ));
        System.out.println ();
        Set set=wmap.entrySet ();
        Iterator itr=set.iterator ();
        while (itr.hasNext ()){
            Map.Entry me= (Map.Entry) itr.next ();
            System.out.println ("Key  "+me.getKey ()+"  "+" value  "+me.getValue ());
        }

        wmap.remove ( 12 );
        System.out.println ("\nAfter Removing 12");
        itr=set.iterator ();
        while (itr.hasNext ()){
            Map.Entry me= (Map.Entry) itr.next ();
            System.out.println ("Key  "+me.getKey ()+"  "+" value  "+me.getValue ());
        }
        System.out.println ();
        System.out.println ("All keys : "+wmap.keySet ());
        System.out.println ("Is 22 value is present: "+wmap.containsValue ( 22 ));
        System.out.println ("Value of key Rutu:" +wmap.get ( "Rutu" ));
        System.out.println ("All Values: "+wmap.values ());
        System.out.println ();
        wmap.remove ("Namrata"  );
        System.gc ();
        System.out.println (""+wmap);


    }

}
