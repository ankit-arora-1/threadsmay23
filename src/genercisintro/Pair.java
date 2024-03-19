package genercisintro;

public class Pair<T, V> {

    private T first;
    private V second;

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(V second) {
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void doSomething() {
        V temp = second;
        System.out.println(temp);
    }

    // method level generics
    public static <S> void printSomething(S value) {
        System.out.println(value);
    }

    public <K> void doSomething2(K value) {
        System.out.println(value);
    }
}
