package Test;

import java.util.Scanner;

/**
 * Created by mahadev on 17/3/18.
 */
public class PalindromeMain {
    public static void main(String[] args) {
        Scanner scanner=new Scanner ( System.in );
        int number;

        System.out.println ("Enter No to check if it is palindrome or not:");
        number=scanner.nextInt ();

        System.out.println ("Number Is Palindrome:"+PalindromeHelper.isPalindromeUsingArray(number));
    }
}
