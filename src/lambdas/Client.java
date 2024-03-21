package lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.*;

public class Client {
    /*
    * Lambdas are anonymous implementation of
    * single abstract method interface (functional internfaces)
    * */
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        Thread t = new Thread(() -> {
//            System.out.println("Printing something else first");
//            System.out.println("Printing from thread" + Thread.currentThread().getName());
//        });
//
//        t.start();

//        Callable<String> callable = () -> {
//            return "test string";
//        };
//
//        ExecutorService executorService = Executors.newCachedThreadPool();
//        Future<String> future = executorService.submit(callable);
//        System.out.println(future.get());

//        sortList();

        mathOperations();
    }


    public static void sortList() {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(1);
        list.add(2);

        Collections.sort(list, (i1, i2) -> i1 - i2);

        System.out.println(list);
    }

    // H/W: Read about method references in Lambdas
    public static void mathOperations() {
//        MathOperation add = new AddOps();
//        MathOperation sub = new SubOps();
//
//        add.calculate(1,2);
//        add.calculate(2,3);
//        sub.calculate(1,2);

        MathOperation add = (a, b) -> {
            return a + b;
        };

        MathOperation sub = (a, b) -> {
            return a - b;
        };


        printResult(1,2, sub);
    }

    public static void printResult(int a, int b, MathOperation mathOperation) {
        int result = mathOperation.calculate(a, b);
        System.out.println(result);
    }


}
