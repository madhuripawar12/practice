package Test;

import java.util.Scanner;

/**
 * Created by mahadev on 17/3/18.
 */
public class ArmstrongMain {
    public static void main(String[] args) {


        Scanner scanner = new Scanner ( System.in );
        int num;

        System.out.println ("Enter Number To check:");
        num=scanner.nextInt ();

        System.out.println ("Number is Armstrong: "+ArmstrongHelper.isArmstrong(num));
    }
}
