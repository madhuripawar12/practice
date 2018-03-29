package Assignments;

import java.util.Scanner;

/**
 * Created by mahadev on 14/2/18.
 */
public class AnagramMain {
    public static void main(String[] args) {
        String input1,input2;
        Scanner sc=new Scanner ( System.in );
        System.out.println ("Enter Two Input String:");
        input1=sc.next ();
        input2=sc.next ();
        boolean result=AnagramHelper.anagram ( input1,input2 );
        System.out.println ("String is Anagram:"+result);
    }
}
