package callables;

import java.util.concurrent.*;

public class NumberPrinter implements Callable<Integer> {

    private Integer i;

    public NumberPrinter(Integer i) {
        this.i = i;
    }

    @Override
    public Integer call() throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        NamePrinter namePrinter = new NamePrinter();
        Future<String> resultFuture = executorService.submit(namePrinter);
        System.out.println(resultFuture.get());


        System.out.println("Printing from thread: " + Thread.currentThread().getName() + ". Number = " + i);
        return i;
    }
}
