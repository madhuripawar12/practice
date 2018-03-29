package stringAssignment;

import Assignments.FirstHelper;

import java.util.Scanner;

/**
 * Created by mahadev on 16/2/18.
 */
public class FirstMain {
    public static void main(String[] args) {
        String string;
        Scanner sc=new Scanner ( System.in );
        System.out.println ("Enter String of Odd length");
        string=sc.next ();
        if(string.length ()%2==0)
            System.out.println ("String is of Even length.");
        else
            stringAssignment.FirstHelper.middle ( string );
    }
}
