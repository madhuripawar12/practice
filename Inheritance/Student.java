package Inheritance;

/**
 * Created by mahadev on 8/2/18.
 */
public class Student extends Human {
    private int stud_id;
    private String clg;
    private String class1;
    private double marks;

    Student(String name, String add, String phone, String email,int stud_id,String clg,String class1,double marks) {
        super ( name, add, phone, email );
        this.stud_id=stud_id;
        this.clg=clg;
        this.class1=class1;
        this.marks=marks;
    }

    public int getStud_id() {
        return stud_id;
    }

    public void setStud_id(int stud_id) {
        this.stud_id = stud_id;
    }

    public String getClg() {
        return clg;
    }

    public void setClg(String clg) {
        this.clg = clg;
    }

    public String getClass1() {
        return class1;
    }

    public void setClass1(String class1) {
        this.class1 = class1;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public void print()
    {
       super.print ();
        System.out.println ("Student Id:="+getStud_id ());
        System.out.println ("College:="+getClg ());
        System.out.println ("Class:="+getClass1 ());
        System.out.println ("Marks:="+getMarks ());
    }
}
