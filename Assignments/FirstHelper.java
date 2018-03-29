package Assignments;

/**
 * Created by mahadev on 14/2/18.
 */
public class FirstHelper {
    public static boolean twoAsOne(int a,int b,int c)
    {
        boolean result;
        if(a+b==c)
        {
            result=true;
        }
        else if (a+c==b)
        {
            result=true;
        }
        else if(b+c==a)
        {
            result=true;
        }
        else
        {
            result=false;
        }
        return result;
    }
}
