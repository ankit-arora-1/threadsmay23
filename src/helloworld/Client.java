package helloworld;

public class Client {
    public static void main(String[] args) {
        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();

        System.out.println("Printing from thread: "
                + Thread.currentThread().getName());

        Thread thread = new Thread(helloWorldPrinter);
        thread.start();

        System.out.println("Printing from thread: "
                + Thread.currentThread().getName());
    }
}
