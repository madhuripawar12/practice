package Assignments;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by mahadev on 14/2/18.
 */
public class AnagramHelper {
    public static boolean result;
    public static boolean anagram(String string1, String string2) {
        if (string1.length () == string2.length ()) {
            int[] count1=new int[26];
            int[] count2=new int[26];
            count1=CharCounter.charCount ( string1 );
            count2=CharCounter.charCount ( string2);
            result= Arrays.equals (count1,count2);
        }

            return result;
    }

}
