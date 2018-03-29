package Collection;

import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by mahadev on 16/3/18.
 */
public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList (  );
        linkedList.add ( "Pune City" );
        linkedList.add ( "Mumbai" );
        linkedList.add ( "Nagpur" );

        System.out.println ("City List:" +linkedList);

        linkedList.add ( 1,"Aurangabad" );
        linkedList.add ( 2,"Thane" );

        System.out.println ("City List: "+linkedList);
        LinkedList linkedList1=new LinkedList (  );
        linkedList1.addAll ( 0,linkedList );

        System.out.println ("New City List:"+linkedList1);

        linkedList1.add ( 2,"Panvel" );

        System.out.println ("New City List:"+linkedList1);

        System.out.println ("Aurangabad is remove: "+linkedList.remove ("Aurangabad"  ));

        linkedList1.addFirst ( "Amravati" );
        System.out.println ("New City List:"+linkedList1);

        System.out.println ("Last Element: "+linkedList1.getLast ());
        linkedList1.addLast ( "Dombivili" );
        System.out.println ("New City List:"+linkedList1);
        System.out.println ("First Element: "+linkedList1.getFirst ());



    }
}
