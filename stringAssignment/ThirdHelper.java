package stringAssignment;

/**
 * Created by mahadev on 16/2/18.
 */
public class ThirdHelper {
    public static void withouEnd(String string){
        if(string.length ()<2)
        {
            System.out.println ("String Is Too Short:");
        }
        else {
            System.out.println ("Yeild String Is :"+string.substring ( 1,string.length ()-1 ));
        }
    }
}
