package Test;

import java.util.Scanner;

/**
 * Created by mahadev on 17/3/18.
 */
public class AngramMain {
    public static void main(String[] args) {
        String str1,str2;
        Scanner sc=new Scanner ( System.in );
        str1=sc.next (  );
        str2=sc.next ();
        System.out.println ("Enter Two Strings");
        System.out.println ("String is Anagram or Not"+AngramChecker.isAnagram(str1,str2));
    }
}
