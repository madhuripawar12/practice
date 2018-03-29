package Thread;

/**
 * Created by mahadev on 28/2/18.
 */
public class Consumer extends Thread {
    Warehouse w;
    public void setWarehouse(Warehouse w)
    {

        this.w=w;
    }
    public void run(){
        for (int i = 0; i <10000 ; i++) {
            try {
                w.getItem();
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }

        }
    }
}
