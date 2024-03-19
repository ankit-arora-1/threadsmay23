package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();
        cars.add(new Car(50, 10));
        cars.add(new Car(25, 12));
        cars.add(new Car(-80, 20));
        cars.add(new Car(72, 11));

        Collections.sort(cars, new MileageComparator());
        Collections.sort(cars, new AccComparator());
        Collections.sort(cars);

        System.out.println(cars);
    }
}
