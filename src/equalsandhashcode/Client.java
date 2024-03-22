package equalsandhashcode;

public class Client {
    public static void main(String[] args) {
        Point p1 = new Point(1,2);
        Point p2 = new Point(2,1);

        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
    }
}
