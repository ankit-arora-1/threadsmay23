package executorintro;

public class NumberPrinter implements Runnable {

    private int num;
    public NumberPrinter(int i) {
        num = i;
    }
    @Override
    public void run() {
        System.out.println("printed by thread: "
                + Thread.currentThread().getName()
                + ": " + num);
    }
}
