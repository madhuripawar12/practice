package Thread;

import java.util.Currency;

/**
 * Created by mahadev on 28/2/18.
 */
public class Warehouse {
    public static final int warehousecapacity=100;
    int CurrentItemCount=0;
    public synchronized void putItem() throws InterruptedException {
        if (CurrentItemCount==warehousecapacity){
            wait();

        }

        CurrentItemCount++;
        System.out.println ("putItem"+CurrentItemCount);
        if(CurrentItemCount==1) {

            notify ();

             }
        }
        public synchronized void getItem() throws InterruptedException {
          if(  CurrentItemCount==0) {
              wait ();
          }
          CurrentItemCount--;
            System.out.println ("getItem"+CurrentItemCount);
            if(CurrentItemCount==warehousecapacity-1)
            {
                notify ();
            }
        }
    }



