package Collection.TreeSetDemo;

import java.util.Scanner;

/**
 * Created by mahadev on 23/3/18.
 */
public class Employee extends Human {
    private int emp_id;
    private double sal;

    Employee() {
        super();
        Scanner sc = new Scanner ( System.in );
        System.out.println ( "Enter Employee Id:" );
        emp_id = sc.nextInt ();
        System.out.println ( "Enter Salary:" );
        sal = sc.nextDouble ();
    }

    public String toString() {

        return super.toString ()+"Employee Id:="+"  "+this.emp_id+"  "+" "+"Salary:= "+" "+this.sal+" "+"\n";
    }


}