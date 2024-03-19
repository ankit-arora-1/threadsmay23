package comparable;

public class Car implements Comparable<Car> {
    public int topSpeed;
    public int mileage;
    public int accelaration;

    public Car(int topSpeed, int mileage) {
        this.topSpeed = topSpeed;
        this.mileage = mileage;
    }

    @Override
    public int compareTo(Car o) {
//        if(this.topSpeed > o.topSpeed) {
//            return 1;
//        } else if(this.topSpeed < o.topSpeed) {
//            return -1;
//        }
//
//        return 0;

        return this.topSpeed - o.topSpeed;

        // return this.topSpeed - o.topSpeed --> H/W
    }

    @Override
    public String toString() {
        return "Car{" +
                "topSpeed=" + topSpeed +
                ", mileage=" + mileage +
                '}';
    }
}
