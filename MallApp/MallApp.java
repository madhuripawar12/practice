

package MallApp;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MallApp {
    public static String category1;
    public static void main(String[] args) throws IOException, CategoryNotFoundException {
//        Category[] categories = CategoryCreator.createCategories();
        Item[] items = new Item[100];
        String name;
        int quantity;
        double price;
        Category category;
        BufferedReader br = new BufferedReader ( new InputStreamReader ( System.in ) );

        System.out.println ( "Enter No. of items:" );
        int n = Integer.parseInt ( br.readLine () );
        for (int i = 0; i < n; i++) {
            System.out.println ( "Enter Name Of Item:" );
            name = br.readLine ();
            System.out.println ( "Enter Quantity:" );
            quantity = Integer.parseInt ( br.readLine () );
            System.out.println ( "Enter Price:" );

            price = Double.parseDouble ( br.readLine () );
            try {
                if (price <0 || price >250) {
                    throw new InvalidPrice("Invalid Price Entered:");
                }
            }catch (InvalidPrice e){

                e.printStackTrace ();
                e.getMessage ();
                price=e.print ();

            }


            System.out.println ( "Enter Category:" );
            category1 = br.readLine ();
            category = CategoryCreator.createCategories ( category1 );
            if(category==null){
                CategoryNotFoundException exception=new CategoryNotFoundException ( "Category Not Found" );
                exception.printStackTrace ();
                category1=exception.print ();
                category=CategoryCreator.createCategories ( category1 );
                throw exception;
            }
            //           try {
//                if(category==null)
//                    throw new CategoryNotFoundException ( "Category Not Found" );
//            } catch (CategoryNotFoundException e) {
//                e.printStackTrace ();
//                category1=e.print ();
//                 category=CategoryCreator.createCategories ( category1 );
//            }



            items[i] = new Item ( name, price, quantity, category );
        }
        ReceiptPrinter.printReceipt ( items );
    }


}