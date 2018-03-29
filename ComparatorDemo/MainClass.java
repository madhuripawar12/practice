package ComparatorDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by mahadev on 22/3/18.
 */
public class MainClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner ( System.in );
        Student[] students = new Student[5];
        System.out.println ("Enter Students Roll No and Name:");

        for (int i = 0; i <5 ; i++) {
            int rollNo = sc.nextInt ();
            String name = sc.next ();
            students[i]=new Student ( rollNo,name );
        }
        Arrays.sort (students);

        System.out.println ("Sorted By Roll No:");
        for (int i = 0; i <5 ; i++) {

            System.out.println ( students[i] );
        }
        Arrays.sort (students,new StudentCompareByName ());
        System.out.println ("Sorted By Name:");
        for (int i = 0; i <5 ; i++) {
            System.out.println ( students[i] );
        }
    }


}
