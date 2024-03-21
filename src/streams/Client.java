package streams;

import semphore1.Consumer;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {
    public static void main(String[] args) {
        example7();
    }

    public static void example1() {
        List<Integer> list = List.of(1,4,3,2,8,5,6);

        Stream<Integer> stream1 = list.stream();

        stream1.forEach((element) -> System.out.println(element));
    }

    public static void example2() {
        List<Integer> list = List.of(1,4,3,2,8,5,6);
        Stream<Integer> stream = list.stream();

        stream.forEach((ele) -> System.out.print((ele * ele) + " "));
    }

    public static void example3() {
        List<Integer> list = List.of(1,4,3,2,8,5,6);
        Stream<Integer> stream = list.stream();

        stream
                .map((ele) -> {
                    return ele * ele;
                })
                .forEach((ele) -> {
                    System.out.print(ele + " ");
                });
    }

    public static void example4() {
        List<Integer> list = List.of(1,4,3,2,8,5,6);

        Stream<Integer> stream = list.stream();

        stream
                .filter((ele) -> {
                    if(ele % 2 == 0) {
                        return true;
                    }

                    return  false;
                })
                .map((ele) -> ele * ele)
                .forEach((ele) -> System.out.print(ele + " "));

        stream.forEach((ele) -> System.out.println(ele));

        System.out.println();
        System.out.println(list);

        // Causes exception because stream is already closed
        // stream.forEach((ele) -> System.out.println(ele));
    }

    public static void example5() {
        List<Integer> list = List.of(1,4,3,2,8,5,6);

        Integer i = list.stream().reduce(0, (sum, ele) -> {
            return sum + ele;
        });

        System.out.println(i);
    }

    public static void example6() {
        List<Integer> list = List.of(1,4,3,2,8,5,6);

        List<Integer> sortedList = list.stream()
                .map((ele) -> ele * ele)
                .filter((ele) -> ele % 2 == 0)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sortedList);
    }

    public static void example7() {
        List<Integer> list = List.of(1,4,3,2,8,5,6);

        Optional<Integer> i = list
                .stream()
                .map((ele) -> {
                    System.out.println("Calling map");
                    return ele * ele;
                })
                .findFirst();

        // list.parallelStream().forEach((ele) -> System.out.println(Thread.currentThread().getName()));

        System.out.println(i);


        int sum = 0;
        list.stream().forEach((ele) -> {
            System.out.println(sum);
        });
    }

}
