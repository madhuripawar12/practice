package stringAssignment;

import java.util.Scanner;

/**
 * Created by mahadev on 16/2/18.
 */
public class FourthMain {
    public static void main(String[] args) {
        String string,string1,string2;
        boolean result=false;
        Scanner sc=new Scanner ( System.in );
        System.out.println ("Enter String:");
        string=sc.next ();
        result=FourthHelper.frontAgain ( string );
        System.out.println ("Result="+result);
    }
}
