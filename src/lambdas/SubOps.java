package lambdas;

public class SubOps implements MathOperation {
    @Override
    public int calculate(int a, int b) {
        return a - b;
    }
}
