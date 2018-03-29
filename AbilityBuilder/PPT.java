package AbilityBuilder;

/**
 * Created by mahadev on 14/2/18.
 */
public class PPT implements Presentable,Printable{


    public void print() {
        System.out.println ("Printing PPT on :"+ip);

    }


    public void present() {
        System.out.println ("Presenting PPT");
    }
}
