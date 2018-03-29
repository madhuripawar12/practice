package stringAssignment;

/**
 * Created by mahadev on 16/2/18.
 */
public class FirstHelper {
    public static void  middle(String string)
    {
        int i=string.length ()/2;
        System.out.println ("Middle String Is:"+string.charAt ( i-1 )+string.charAt ( i )+string.charAt ( i+1));
    }
}
