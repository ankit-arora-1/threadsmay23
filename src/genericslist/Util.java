package genericslist;

import java.util.List;

public class Util {
    public static <T extends Animal> void doSomething(List<T> animals) {
        for(Animal animal: animals) {
            System.out.println(animal);
        }
    }

    // Wildcard character
    public static void printer(List<? extends Animal> animals) {
        for(Animal animal: animals) {
            System.out.println(animal);
        }
    }
}
