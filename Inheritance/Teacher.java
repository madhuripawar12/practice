package Inheritance;

/**
 * Created by mahadev on 8/2/18.
 */
public class Teacher extends Human{
    private String clg;
    private String sub;
    private double sal;
    private int exp;

    Teacher(String name, String add, String phone, String email,String clg,String sub,double sal,int exp) {
        super ( name, add, phone, email );
        this.clg=clg;
        this.sub=sub;
        this.sal=sal;
        this.exp=exp;
    }

    public String getClg() {
        return clg;
    }

    public void setClg(String clg) {
        this.clg = clg;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
    public void print()
    {
        super.print ();
        System.out.println ("College:="+getClg ());
        System.out.println ("Subject:="+getSub ());
        System.out.println ("Salary:="+getSal ());
        System.out.println ("Experience:="+getExp ());
    }
}
