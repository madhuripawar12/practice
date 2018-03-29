package Inheritance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyInheritance {
    public static void main(String[] args) throws IOException {
        String name, clg, add, cmp, email, class1, post, sub, phone;
        double sal, marks;
        Human[] humans;
        int stud_id, emp_id, exp;
        System.out.println ( "\t\tWelcome to Human Detail Creator" );
        BufferedReader br = new BufferedReader ( new InputStreamReader ( System.in ) );

        System.out.println ( "\nEnter No of persons:" );
        int n = Integer.parseInt ( br.readLine () );
        humans = new Human[n];

        for (int i = 0; i < n; i++) {
            System.out.println ( "Enter Basic Detail:" );
            System.out.println ( "Enter Name:" );
            name = br.readLine ();
            System.out.println ( "Enter Address" );
            add = br.readLine ();
            System.out.println ( "Enter Phone No.:" );
            phone = br.readLine ();
            System.out.println ( "Enter Email-id:" );
            email = br.readLine ();
            System.out.println ( "\nEnter Specialization\n" );
            System.out.println ( "1.Student Or 2.Teacher Or 3.Employee" );

            int ch = Integer.parseInt ( br.readLine () );

            switch (ch) {
                case 1:
                    humans[i] = getStudentData ( name, add, email, phone, br );
                    break;
                case 2:
                    humans[i] = GetTeacherData ( name, add, email, phone, br );
                    break;
                case 3:
                    humans[i] = GetEmployeeData ( name, add, email, phone, br );
                    break;
                default:
                    System.out.println ( "Wrong Choice:" );
                    break;
            }

        }
        DataPrinter.printData ( humans );
    }

    private static Human getStudentData(String name, String add, String email, String phone, BufferedReader br) throws IOException {
        int stud_id;
        String clg;
        String class1;
        double marks;
        System.out.println ( "Enter Student Details:" );
        System.out.println ( "Enter Student Id:" );
        stud_id = Integer.parseInt ( br.readLine () );
        System.out.println ( "Enter College Name:" );
        clg = br.readLine ();
        System.out.println ( "Enter Class :" );
        class1 = br.readLine ();
        System.out.println ( "Enter Marks:" );
        marks = Double.parseDouble ( br.readLine () );
        return new Student ( name, add, phone, email, stud_id, clg, class1, marks );
    }

    private static Human GetTeacherData(String name, String add, String email, String phone, BufferedReader br) throws IOException {
        String clg, sub;
        double sal;
        int exp;
        System.out.println ( "Enter Teacher Details:" );
        System.out.println ( "Enter College Name:" );
        clg = br.readLine ();
        System.out.println ( "Enter Subject Taught By Teacher:" );
        sub = br.readLine ();
        System.out.println ( "Enter Salary:" );
        sal = Double.parseDouble ( br.readLine () );
        System.out.println ( "Enter Experience:" );
        exp = Integer.parseInt ( br.readLine () );

        return new Teacher ( name, add, phone, email, clg, sub, sal, exp );
    }

    private static Human GetEmployeeData(String name, String add, String email, String phone, BufferedReader br) throws IOException {

        int emp_id;
        String cmp, post;
        double sal;
        System.out.println ( "Enter Employee Details:" );
        System.out.println ( "Enter Employee Id:" );
        emp_id = Integer.parseInt ( br.readLine () );
        System.out.println ( "Enter Company Name:" );
        cmp = br.readLine ();
        System.out.println ( "Enter Post:" );
        post = br.readLine ();
        System.out.println ( "Enter Salary:" );
        sal = Double.parseDouble ( br.readLine () );
        return new Employee ( name, add, phone, email, emp_id, cmp, post, sal );
    }
}
