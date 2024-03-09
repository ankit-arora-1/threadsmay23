package mergesort;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws Exception {
        List<Integer> list = List.of(2,3,7,1,8,5,4,3);

        ExecutorService executorService = Executors.newCachedThreadPool();

        MergeSorter mergeSorter = new MergeSorter(list, executorService);
        Future<List<Integer>> sortedArrayFuture = executorService.submit(mergeSorter);

        System.out.println(sortedArrayFuture.get());
    }
}
