package genericslist;

public class Dog extends Animal implements Comparable<Dog> {
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int compareTo(Dog o) {
        return 0;
    }
}
