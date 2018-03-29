package thread;

/**
 * Created by mahadev on 27/2/18.
 */
public class SMSApp {
    public static void main(String[] args) {


        SMS[] tsms = new SMS[100];
        SMS[] msms = new SMS[100];

        TSMSSender tsmsSender = new TSMSSender ( tsms );
        tsmsSender.setPriority ( Thread.MAX_PRIORITY );

        MSMSSender msmsSender=new MSMSSender ( msms );
        Thread msmsThread=new Thread ( msmsSender );
        msmsThread.setPriority ( Thread.MIN_PRIORITY );

        tsmsSender.start ();
        msmsThread.start ();
    }

}
