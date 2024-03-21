package lambdas;

public class AddOps implements MathOperation {
    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}
