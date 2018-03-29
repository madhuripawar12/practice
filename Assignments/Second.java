package Assignments;

import java.util.Scanner;

/**
 * Created by mahadev on 13/2/18.
 */
public class Second {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner ( System.in );
        System.out.println ("Enter Numbers On Tickets:");
        a=sc.nextInt ();
        b=sc.nextInt ();
        c=sc.nextInt ();
        int result=SecondHelper.greenTicket ( a,b,c );
        System.out.println ("Result="+result);
    }
}
