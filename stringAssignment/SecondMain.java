package stringAssignment;

import java.util.Scanner;

/**
 * Created by mahadev on 16/2/18.
 */
public class SecondMain {
    public static void main(String[] args) {
        String result,string;
        Scanner sc=new Scanner ( System.in );
        System.out.println ("Enter String:");
        string=sc.next ();
        result=SecondHelper.seeColor(string);
        System.out.println ("Color="+result);
    }
}
