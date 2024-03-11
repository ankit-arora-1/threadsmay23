package callables;

import java.util.concurrent.*;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        NumberPrinter numberPrinter = new NumberPrinter(1);

        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<Integer> futureResult = executorService.submit(numberPrinter);

        System.out.println("Doing some other work");
        System.out.println("Printing result: " + futureResult.get());
    }
}
