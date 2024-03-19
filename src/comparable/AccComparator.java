package comparable;

import java.util.Comparator;

public class AccComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.accelaration - o2.accelaration;
    }
}
