package Assignments;

/**
 * Created by mahadev on 14/2/18.
 */
public class SecondHelper {
    public static int greenTicket(int a,int b,int c)
    {
        int result;
        if(a==b)
        {
            result=10;
            if(b==c) {
                result =20;
            }

        }

        else  if(b==c)
        {
            result=10;
        }
        else {
            result=0;
        }


        return result;
    }
}
