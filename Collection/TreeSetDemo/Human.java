package Collection.TreeSetDemo;

import java.util.Scanner;

/**
 * Created by mahadev on 23/3/18.
 */
public class Human implements Comparable{
    public    String name;
    public String add;
    public int age;
    Human(){
        Scanner sc=new Scanner ( System.in );
        System.out.println ( "Enter Name:" );
        name =sc.next ();
        System.out.println ( "Enter Address" );
        add = sc.next ();
        System.out.println ( "Enter Age" );
        age = sc.nextInt ();

    }

    @Override
    public String toString() {
        return "Name="+" "+this.name+" "+"Address:="+" " +this.add+" "+"Age:="+" "+this.age+"\n";

    }

    @Override
    public int compareTo(Object o) {
        Human h=(Human)o;
        if(this.age<h.age)
            return -1;
        if(this.age>h.age)
            return 1;
        return 0;
    }
}
