package Collection.TreeSetDemo;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by mahadev on 23/3/18.
 */
public class TreesetStudEmp {
    public static void main(String[] args) {

        TreeSet set=new TreeSet ();
        Student s1=new Student();
        set.add (s1);
        Employee e1=new Employee ();
        set.add ( e1 );
        Student s2=new Student();
        set.add (s2);
        Student s3=new Student();
        set.add (s3);

        System.out.println ("Using Comparable");
        System.out.println (set);
        System.out.println ("");
        System.out.println ("");


        System.out.println ("Using Comparator");

        TreeSet set1=new TreeSet (new HumanComparator ());
        set1.add (s1);
        set1.add (e1);
        set1.add (s2);
        set1.add (s3);
        System.out.println (set1);

    }

}
