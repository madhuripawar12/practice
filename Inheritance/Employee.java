package Inheritance;

/**
 * Created by mahadev on 8/2/18.
 */
public class Employee extends Human{
    private int emp_id;
    private String company;
    private String post;
    private double  sal;

    Employee(String name, String add, String phone, String email,int emp_id,String company,String post,double sal) {
        super ( name, add, phone, email );
        this.emp_id=emp_id;
        this.company=company;
        this.post=post;
        this.sal=sal;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
    public void print()
    {
        super.print ();
        System.out.println ("Employee Id:="+getEmp_id ());
        System.out.println ("Company:="+getCompany ());
        System.out.println ("Post:="+getPost ());
        System.out.println ("Salary:="+getSal ());
    }
}
