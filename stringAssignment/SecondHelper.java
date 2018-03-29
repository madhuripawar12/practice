package stringAssignment;

/**
 * Created by mahadev on 16/2/18.
 */
public class SecondHelper {
    public static String seeColor(String string)
    {
        String color="None";
        if(string.startsWith ( "red" ))
            color= (String) string.subSequence ( 0,3 );
        if (string.startsWith ( "blue" ))
            color= (String) string.subSequence( 0,4 );

        return color;

    }
}
