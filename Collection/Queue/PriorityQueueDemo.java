package Collection.Queue;

import java.sql.Array;
import java.util.PriorityQueue;

/**
 * Created by mahadev on 29/3/18.
 */
public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue pQueue=new PriorityQueue (  );
        pQueue.add ( 25 );
        pQueue.add ( 26 );
        pQueue.add ( 85 );
        pQueue.add ( 15 );
        pQueue.add ( 46 );

        System.out.println (pQueue);
        System.out.println (""+pQueue.offer ( 30 ));
        System.out.println (pQueue);
        System.out.println (""+pQueue.contains ( 30 ));
        System.out.println (""+pQueue.peek ());
        System.out.println (""+pQueue.size ());
        System.out.println (""+pQueue.poll ());
        System.out.println (""+pQueue);

        System.out.println (""+pQueue.remove (  ));
        System.out.println (""+pQueue);
        System.out.println (""+pQueue.comparator ());
        System.out.println (""+pQueue.spliterator ());
        System.out.println (""+pQueue.iterator ());
        System.out.println (pQueue);
    }
}
