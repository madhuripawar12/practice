package Inheritance;

/**
 * Created by mahadev on 8/2/18.
 */
public class DataPrinter {
    public static void printData(Human[] humans)
    {
        System.out.println ("Details Of Human");
        for (Human h:humans) {
            h.print();
        }

    }
}
