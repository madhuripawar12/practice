package Assignments;

import java.util.Scanner;

/**
 * Created by mahadev on 15/2/18.
 */
public class TripleMain  {
    public static void main(String[] args) {
        String string;
        System.out.println ("Enter Input String:");
        Scanner sc=new Scanner ( System.in );
        string=sc.next ();
        int triples=Triple.countTriple(string);
        System.out.println ("No Of Triples=:"+triples);
    }
}
