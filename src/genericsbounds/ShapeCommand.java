package genericsbounds;

public class ShapeCommand<T extends Shape> {

    public void printShape(T shape) {
        System.out.println(shape.shapeName);
    }

    public static <S extends Shape> void printShape2(S shape) {
        System.out.println(shape);
    }
}
