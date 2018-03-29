package Test;

import java.util.Scanner;

/**
 * Created by mahadev on 17/3/18.
 */

public class EvenPrimeMain
{
    public static void main(String[] args) {

        System.out.println ("Printing Even Prime Number in  1 to 1000");
        for (int num = 0; num <=1000; num++) {
            if(num%2==0){
                if(isPrime(num))
                    System.out.println (num);
            }

        }

    }

    private static boolean isPrime(int num) {
        boolean result=true;
        int half=num/2;

        if(num==0||num==1)
            result=false;

        else {
             for (int i=2; i<=half ; i++) {
                if(num%i==0)
                   result=false;

            }
        }
        return result;
    }
}
