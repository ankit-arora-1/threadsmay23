package producerconsumersemaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable {
    private Queue<Object> queue;
    private int maxSize;
    private Semaphore consumerSemaphore;
    private Semaphore producerSemaphore;

    public Producer(Queue<Object> queue, int maxSize, Semaphore consumerSemaphore, Semaphore producerSemaphore) {
        this.queue = queue;
        this.maxSize = maxSize;
        this.consumerSemaphore = consumerSemaphore;
        this.producerSemaphore = producerSemaphore;
    }

    @Override
    public void run() {
        while(true) {
            try {
                producerSemaphore.acquire();
                if(queue.size() < maxSize) {
                    System.out.println("Producing");
                    queue.add(new Object());
                }
                consumerSemaphore.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
