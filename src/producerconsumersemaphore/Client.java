package producerconsumersemaphore;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        Queue<Object> queue = new ConcurrentLinkedQueue<>();
        Semaphore consumerSemaphore = new Semaphore(0);
        Semaphore producerSemaphore = new Semaphore(6);

        Producer p1 = new Producer(queue, 6, consumerSemaphore, producerSemaphore);
        Producer p2 = new Producer(queue, 6, consumerSemaphore, producerSemaphore);
        Producer p3 = new Producer(queue, 6, consumerSemaphore, producerSemaphore);

        Consumer c1 = new Consumer(queue, 6, consumerSemaphore, producerSemaphore);
        Consumer c2 = new Consumer(queue, 6, consumerSemaphore, producerSemaphore);
        Consumer c3 = new Consumer(queue, 6, consumerSemaphore, producerSemaphore);
        Consumer c4 = new Consumer(queue, 6, consumerSemaphore, producerSemaphore);

        Thread pt1 = new Thread(p1);
        Thread pt2 = new Thread(p2);
        Thread pt3 = new Thread(p3);

        Thread ct1 = new Thread(c1);
        Thread ct2 = new Thread(c2);
        Thread ct3 = new Thread(c3);
        Thread ct4 = new Thread(c4);

        pt1.start();
        pt2.start();
        pt3.start();

        ct1.start();
        ct2.start();
        ct3.start();
        ct4.start();


    }
}
