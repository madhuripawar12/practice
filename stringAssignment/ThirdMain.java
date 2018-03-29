package stringAssignment;

import java.util.Scanner;

/**
 * Created by mahadev on 16/2/18.
 */
public class ThirdMain {
    public static void main(String[] args) {
        String string;
        Scanner sc=new Scanner ( System.in );
        System.out.println ("Enter String Of Minimum Length 2:");
        string=sc.next ();
        ThirdHelper.withouEnd ( string );

    }
}
