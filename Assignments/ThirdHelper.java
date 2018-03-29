package Assignments;

/**
 * Created by mahadev on 14/2/18.
 */
public class ThirdHelper {
    public static boolean shareDigit(int a,int b)
    {
        boolean result;
        int d1,r1,d2,r2;
        d1=a/10;
        r1=a%10;
        d2=b/10;
        r2=b%10;

        if(d1==r2)
        {
            result=true;
        }
        else if (d1==d2)
        {
            result=true;
        }
        else if(r1==r2)
        {
            result=true;
        }
        else if(d1==d2)
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
