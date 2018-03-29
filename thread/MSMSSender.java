package thread;

/**
 * Created by mahadev on 27/2/18.
 */
public class MSMSSender implements Runnable {
    SMS[] msms;
    MSMSSender(SMS[] msms)
    {
        this.msms=msms;
    }
    public  void run() {
        System.out.println ("Marketing SMS Started...");
        System.out.println ("Marketing SMS Finished....");

        }
}
