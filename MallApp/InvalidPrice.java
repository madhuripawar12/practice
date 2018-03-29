package MallApp;

import java.util.Scanner;

/**
 * Created by mahadev on 21/2/18.
 */
public class InvalidPrice extends Exception{
    public InvalidPrice(String s) {
        super(s);
        }
        public double print()
        {
            System.out.println ("Re-enter Price:");
            Scanner scanner=new Scanner ( System.in );
            double price=scanner.nextDouble ();
            return price;

        }


    public String toString() {
        return "Invalid Price Entered By User ,Re-enter the price";
    }
}

