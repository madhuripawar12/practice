package Thread;

/**
 * Created by mahadev on 28/2/18.
 */
public class App {
    public static void main(String[] args) {


        Warehouse warehouse = new Warehouse();

        Producer producer = new Producer();
        producer.setWarehouse ( warehouse );

        Consumer consumer = new Consumer();
        consumer.setWarehouse(warehouse);

        producer.start ();
        consumer.start ();


    }
}