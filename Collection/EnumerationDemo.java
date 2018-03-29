package Collection;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by mahadev on 21/3/18.
 */
public class EnumerationDemo {
    public static void main(String[] args) {
        Vector fruit=new Vector ( 5 );
        fruit.addElement (  "Mango");
        fruit.addElement ( "Orange");
        fruit.addElement ( "Apple");
        fruit.addElement ( "Blueberry" );

        System.out.println ("Fruit List: "+fruit);
        fruit.add ( 0,"Cherry" );
        System.out.println ("Fruit List: "+fruit);

        System.out.println ("Element at 1:"+fruit.elementAt ( 1 ));
        System.out.println ("Last Element: "+fruit.lastElement ());
        System.out.println ("first Element: "+fruit.firstElement ());

        System.out.println ("Is Orange removed:"+fruit.removeElement ( "Orange" ));
        System.out.println ("Fruit List: "+fruit);
        System.out.println ("Enumeration is used for printing");
        Enumeration e=fruit.elements ();
        while (e.hasMoreElements ()){
            System.out.println (""+e.nextElement ());
        }
    }
}
