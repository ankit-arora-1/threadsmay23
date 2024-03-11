package callables;

import java.util.concurrent.Callable;

public class NumberPrinter implements Callable<Integer> {

    private Integer i;

    public NumberPrinter(Integer i) {
        this.i = i;
    }

    @Override
    public Integer call() {
        System.out.println("Printing from thread: " + Thread.currentThread().getName() + ". Number = " + i);
        return i;
    }
}
