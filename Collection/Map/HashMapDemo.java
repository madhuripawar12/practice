package Collection.Map;

import MallApp.Item;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by mahadev on 26/3/18.
 */
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap hashMap=new HashMap (  );
        hashMap.put ( "Kirti",20 );
        hashMap.put ( "Rutu" ,21 );
        hashMap.put ( "Bhagyashri",20 );
        hashMap.put ( "Rutu",22 );
        hashMap.put ( "Nisha",19 );
        hashMap.put ( 12,"Namrata" );

        System.out.println ("Rutu is Present ??: "+hashMap.containsKey ( "Rutu" ));
        System.out.println ();
        Set set=hashMap.entrySet ();
        Iterator itr=set.iterator ();
        while (itr.hasNext ()){
            Map.Entry me= (Map.Entry) itr.next ();
            System.out.println ("Key  "+me.getKey ()+"  "+" value  "+me.getValue ());

        }
    }
}
