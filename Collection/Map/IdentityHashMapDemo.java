package Collection.Map;

import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by mahadev on 27/3/18.
 */
public class IdentityHashMapDemo {
    public static void main(String[] args) {
        IdentityHashMap idHashMap=new IdentityHashMap (  );

        idHashMap.put ( "Kirti",20 );
        idHashMap.put ( "Rutu" ,21 );
        idHashMap.put ( "Bhagyashri",20 );
        idHashMap.put ( "Rutu",22 );
        idHashMap.put ( "Nisha",19 );
        idHashMap.put ( 12,"Namrata" );

        System.out.println ("Rutu is Present ??: "+idHashMap.containsKey ( "Rutu" ));
        System.out.println ();
        Set set=idHashMap.entrySet ();
        Iterator itr=set.iterator ();
        while (itr.hasNext ()){
            Map.Entry me= (Map.Entry) itr.next ();
            System.out.println ("Key  "+me.getKey ()+"  "+" value  "+me.getValue ());
        }

        System.out.println ("All keys : "+idHashMap.keySet ());
        System.out.println ("Is 22 value is present: "+idHashMap.containsValue ( 22 ));
        System.out.println ("Value of key Rutu:" +idHashMap.get ( "Rutu" ));
        System.out.println ("All Values: "+idHashMap.values ());
        System.out.println ("Total Elements:"+idHashMap.size ());
    }
}
