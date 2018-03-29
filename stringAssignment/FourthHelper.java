package stringAssignment;

/**
 * Created by mahadev on 16/2/18.
 */
public class FourthHelper {
    public static boolean frontAgain(String string){
        boolean result=false;
        String string1,string2;
        string1=string.substring ( 0,2 );
        string2=string.substring ( string.length ()-2,string.length () );
        System.out.println (string1+string2);
        if(string1.equals (string2 )){
            result=true;
        }
        return result;
    }
}
