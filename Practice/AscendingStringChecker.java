package Practice;

import java.util.Scanner;

/**
 * Created by mahadev on 21/3/18.
 */
public class AscendingStringChecker {
    public static void main(String[] args) {
        boolean result=true;
        String str = new String();
        Scanner sc=new Scanner ( System.in );
        System.out.println ("Enter String:");
        str=sc.next ();
        for (int i = 0; i <str.length ()-1 ; i++) {
            if(str.charAt ( i )>str.charAt ( i+1 )) {
                result = false;
                break;
            }

        }
        if(result)
            System.out.println ("TRUE:");
        else
            System.out.println ("FALSE");
    }
}
