package genericslist;

import java.util.*;

import static java.util.Objects.hash;

public class Client {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Animal());

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());

         Util.doSomething(dogs);

//         List<String> test = new ArrayList<>();
//         Util.doSomething(test); // --> Will not work

        List list = new ArrayList(); // --> Raw types

        HashSet hs = new HashSet();
        hs.add(1);
        hs.add("abc");

        Collections.sort(dogs);

    }
}
