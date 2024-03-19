package genericsbounds;

public class Client {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setShapeName("circle");

        ShapeCommand<Circle> shapeCommand =
                new ShapeCommand<>();

        shapeCommand.printShape(circle);

        ShapeCommand.printShape2(circle);

    }
}
