package Test;

/**
 * Created by mahadev on 17/3/18.
 */

public class AngramChecker {
    public static boolean isAnagram(String str1,String str2) {
        boolean result=false;

        int[] count1=CharCounter.getCharCount ( str1 );
        int[] count2=CharCounter.getCharCount ( str2 );
        if (count1.equals ( count2 ))
            result=true;

        return  result;
    }
}
