package thread;

/**
 * Created by mahadev on 27/2/18.
 */
public class IdeaService {
    public  void sendSMS(SMS[] sms){
        for (int i = 0; i <sms.length ; i++) {
            System.out.println ( "Text"+i+"    "+"Phone No"+i );
        }
    }
}
