package thread;

/**
 * Created by mahadev on 27/2/18.
 */
public class TSMSSender extends Thread {
    SMS[] tsms;
    TSMSSender(SMS[] tsms)
    {
        this.tsms=tsms;
    }
    public synchronized void run() {
        System.out.println ("Transaction SMS Started...");

        System.out.println ("Transaction SMS Finished....");

        }
}
