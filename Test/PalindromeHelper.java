package Test;

import java.util.Arrays;

/**
 * Created by mahadev on 17/3/18.
 */
public class PalindromeHelper {
    public static boolean isPalindromeUsingArray(int number) {
        boolean result=false;

        int[] digits=getDigits(number);
        System.out.println (" Array=");
        for (int i = 0; i <digits.length ; i++) {
            System.out.println (digits[i]);
        }

        int[] revDigits=getRevDigits(digits);
        System.out.println ("reverse Array");
        for (int i = 0; i <digits.length ; i++) {
            System.out.println (revDigits[i]);
        }
        if(Arrays.equals ( digits, revDigits ))
            result=true;

        return result;
    }

    private static int[] getRevDigits(int[] digits) {
        int[] digit=new int[4];
        int j=0;
        for(int i=3;i>=0;i--){

            digit[j]=digits[i];
            j++;
        }

        return digit;
    }

    private static int[] getDigits(int num) {
        int[] digit=new int[4];

        for (int i = 0; i <4 ; i++) {

            int r = num % 10;
            int d =  num / 10;
            num = d ;
            digit[i]=r;
        }

        return digit;

    }
}
