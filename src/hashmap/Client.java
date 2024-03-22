package hashmap;

import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void main(String[] args) {
        Map<Point, String> map = new HashMap<>();

        Point p1 = new Point(1,2);
        map.put(p1, "point12");

        Point p2 = new Point(1,2);
        System.out.println(map.get(p2));
    }
}
