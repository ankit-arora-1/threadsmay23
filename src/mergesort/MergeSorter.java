package mergesort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MergeSorter implements Callable<List<Integer>> {

    private List<Integer> arrayToSort;
    private ExecutorService executorService;

    public MergeSorter(List<Integer> arr, ExecutorService executor) {
        arrayToSort = arr;
        executorService = executor;
    }
    @Override
    public List<Integer> call() throws Exception {
        if(arrayToSort.size() <= 1) {
            return arrayToSort;
        }

        int mid = arrayToSort.size() / 2;

        List<Integer> leftArr = new ArrayList<>();
        for(int i = 0; i < mid; i++) {
            leftArr.add(arrayToSort.get(i));
        }

        List<Integer> rightArr = new ArrayList<>();
        for(int i = mid; i < arrayToSort.size(); i++) {
            rightArr.add(arrayToSort.get(i));
        }


        MergeSorter leftSorter = new MergeSorter(leftArr, executorService);
        MergeSorter rightSorter = new MergeSorter(rightArr, executorService);

        Future<List<Integer>> leftSortedArrayFuture = executorService.submit(leftSorter);
        Future<List<Integer>> rightSortedArrayFuture = executorService.submit(rightSorter);

        int i = 0;
        int j = 0;
        List<Integer> sortedArray = new ArrayList<>();

        List<Integer> leftSortedArray = leftSortedArrayFuture.get();
        List<Integer> rightSortedArray = rightSortedArrayFuture.get();
        while(i < leftSortedArray.size() && j < rightSortedArray.size()) {
            if(leftSortedArray.get(i) < rightSortedArray.get(j)) {
                sortedArray.add(leftSortedArray.get(i));
                i++;
            } else {
                sortedArray.add(rightSortedArray.get(j));
                j++;
            }
        }

        while(i < leftSortedArray.size()) {
            sortedArray.add(leftSortedArray.get(i));
            i++;
        }

        while(j < rightSortedArray.size()) {
            sortedArray.add(rightSortedArray.get(j));
            j++;
        }

        return sortedArray;
    }
}
