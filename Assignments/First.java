package Assignments;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by mahadev on 13/2/18.
 */
public class First {
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner s=new Scanner(System.in);
        System.out.println ("Enter Three Integer Numbers:");
        boolean result;

        a=s.nextInt();
        b=s.nextInt ();
        c=s.nextInt ();

        result=FirstHelper.twoAsOne ( a,b,c );
        System.out.println ("Result="+result);

    }
}
