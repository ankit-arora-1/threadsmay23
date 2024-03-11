package callables;

import java.util.concurrent.Callable;

public class NamePrinter implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println("Name = Ankit. Printing from thread: " + Thread.currentThread().getName());
        return "ankit";
    }
}
