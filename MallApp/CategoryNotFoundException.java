package MallApp;

import java.util.Scanner;

/**
 * Created by mahadev on 20/2/18.
 */
public class CategoryNotFoundException extends Throwable {
 CategoryNotFoundException(String msg)
 {
     super(msg);
 }
 public String  print()
 {
     System.out.println ("Re-enter Category:");
     Scanner scanner=new Scanner ( System.in );
     String category1=scanner.next (  );
     return category1;
 }

    @Override
    public String toString() {
        return "Category Entered By User Is Not Found, Re-enter the category";
    }
}
