package equalsandhashcode;

import java.util.Objects;

public class Point {
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Point)) {
            return false;
        }

        Point o = (Point) obj;

        return this.x == o.x && this.y == o.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x,y);
    }
}
