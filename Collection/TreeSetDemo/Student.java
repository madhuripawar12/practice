package Collection.TreeSetDemo;

import java.util.Scanner;

/**
 * Created by mahadev on 23/3/18.
 */
public class Student extends Human  {
    private int stud_id;
    private double marks;

    Student(){
        super();
        Scanner sc=new Scanner ( System.in );
        System.out.println ("Enter Roll NO:");
        stud_id=sc.nextInt ();

        System.out.println ("Enter Marks:");
        marks=sc.nextDouble ();
    }

    @Override
    public String toString() {

        return super.toString ()+"Student Id:="+" "+this.stud_id+" "+"Marks:="+" "+this.marks+"\n";

    }


}
