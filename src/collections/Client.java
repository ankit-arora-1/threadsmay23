package collections;

import java.util.*;

public class Client {
    public static void main(String[] args) {
        // Dynamic Array
        // Size doubles when the limit is reached
        List<String> names = new ArrayList<>();

        // Like array list but uses linked list internally
        // Not thread safe
        List<String> names2 = new LinkedList<>();
        // names2.get(4);

        // It is like an arraylist but it is thread safe
        // Methods are synchronized
        Vector<String> vec = new Vector<>();

        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new LinkedHashSet<>();
        Set<String> set3 = new TreeSet<>();

        set1.add("nikhil");
        set1.add("sravana");
        set1.add("abhijeet");
        set1.add("saumyajeet");

        set2.add("nikhil");
        set2.add("sravana");
        set2.add("abhijeet");
        set2.add("saumyajeet");

        set3.add("nikhil");
        set3.add("sravana");
        set3.add("abhijeet");
        set3.add("saumyajeet");
//
//        System.out.println(set1);
//        System.out.println(set2);
//        System.out.println(set3);

        Queue<String> queue1 = new ArrayDeque<>();

        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("d");
        pq.add("b");
        pq.add("z");
        pq.add("a");

        for(String i: pq) {
            System.out.println(i);
        }

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(7);
        list.add(2);
        list.add(9);

        Collections.sort(list);
        System.out.println(list);

    }
}
