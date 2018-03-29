package Test;

/**
 * Created by mahadev on 17/3/18.
 */
public class ArmstrongHelper {
    public static boolean isArmstrong(int num) {
        boolean result=false;
        int[] digit=getDigits ( num );
        int[] cube=new int[3];
        int sum=0;
        for (int i = 0; i < digit.length; i++) {

            cube[i]=digit[i]*digit[i]*digit[i];
        }
        for (int i = 0; i <cube.length ; i++) {
            sum=sum+cube[i];
        }
        if(sum==num)
            result=true;

        return result;
    }
    public static int[] getDigits(int num)
    {
        int[] digit=new int[3];
        for (int i = 0; i <3 ; i++) {


            int r = num % 10;
            int d = num / 10;
            num = d;
            digit[i]=r;
        }
        return digit;
    }
}
