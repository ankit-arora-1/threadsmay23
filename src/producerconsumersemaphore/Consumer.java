package producerconsumersemaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {
    private Queue<Object> queue;
    private int maxSize;
    private Semaphore consumerSemaphore;
    private Semaphore producerSemaphore;

    public Consumer(Queue<Object> queue, int maxSize, Semaphore consumerSemaphore, Semaphore producerSemaphore) {
        this.queue = queue;
        this.maxSize = maxSize;
        this.consumerSemaphore = consumerSemaphore;
        this.producerSemaphore = producerSemaphore;
    }

    @Override
    public void run() {
        while(true) {
            try {
                consumerSemaphore.acquire();
                if(queue.size() > 0) {
                    System.out.println("Consuming");
                    queue.remove();
                }
                producerSemaphore.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
