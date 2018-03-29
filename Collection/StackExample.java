package Collection;

import java.util.Stack;

/**
 * Created by mahadev on 16/3/18.
 */
public class StackExample {
    public static void main(String[] args) {
        Stack student=new Stack ();
        System.out.println ("Is Stack Empty: "+student.empty ());
        System.out.println ("Student List: "+student);
        student.push ( "Madhuri" );
        System.out.println ("Is Stack Empty: "+student.empty ());
        System.out.println ("Student List: "+student);
        student.push ( "Rutuja" );
        student.push ( "Kirti" );
        student.push ( "Bhagyashri" );
        student.push ( "Nisha" );
        System.out.println ("Student List: "+student);
        student.add ( 1,"Rutu" );
        System.out.println ("Student List: "+student);

        System.out.println ("Rutu is Present at : "+student.search ( "Rutu" ));
        System.out.println ("Top Element: "+student.peek ());
        System.out.println ("Student List: "+student);

        System.out.println ("Top Element is removed: "+student.pop ());
        System.out.println ("Student List: "+student);
        
    }
}
