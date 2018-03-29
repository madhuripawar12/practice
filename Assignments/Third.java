package Assignments;

import java.util.Scanner;

/**
 * Created by mahadev on 14/2/18.
 */
public class Third {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner ( System.in );
        System.out.println ("Enter Two Numbers in range 10-99:");
        a=sc.nextInt ();
        b=sc.nextInt ();

      boolean result= ThirdHelper.shareDigit ( a,b );
        System.out.println ("Result="+result);
    }
}
