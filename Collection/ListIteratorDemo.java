package Collection;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by mahadev on 21/3/18.
 */
public class ListIteratorDemo {
    public static void main(String[] args) {
        ArrayList student=new ArrayList (  );
        student.add ( "Madhuri" );
        student.add ( "Rutuja" );
        student.add ( "Kirti" );
        student.add ( "Bhagyashri" );

        System.out.println (student);
        student.add ( 0,"Rutu" );
        System.out.println (" Kirti is present at index: "+student.indexOf ( "Kirti" ));
        System.out.println ("Element present at index 1: "+student.get ( 1 ));

        System.out.println (student);

        System.out.println ("Is Rutuja Present in List: "+student.contains ( "Rutuja" ));
        student.set (1,"Madhu"  );
        System.out.println (student);

        ArrayList arrayList=new ArrayList (  );
        arrayList.add ( "Namrata" );
        arrayList.add ( 0,"Pooja" );

        arrayList.addAll ( 0,student );

        System.out.println ("New Array List: "+arrayList);
        System.out.println ("Namrata is Removed: "+arrayList.remove ( "Namrata" ));

        System.out.println ("List Iterator is used for printing");
        ListIterator le=student.listIterator ();
        while (le.hasNext ()){
            System.out.println (" "+le.next ());
        }
    }

}
