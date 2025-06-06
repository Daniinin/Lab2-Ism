package Lab6;

public class IntCalculator {
    private int state;

    public IntCalculator(int initialValue) {
        this.state = initialValue;
    }

    public IntCalculator add(int value) {
        this.state += value;
        return this;
    }

    public IntCalculator subtract(int value) {
        this.state -= value;
        return this;
    }

    public IntCalculator multiply(int value) {
        this.state *= value;
        return this;
    }

    public int result() {
        return this.state;
    }

    public IntCalculator clear() {
        this.state = 0;
        return this;
    }

    public static void main(String[] args) {
        IntCalculator calculator = new IntCalculator(10);
        int result = calculator.add(2).subtract(2).multiply(4).result();
        System.out.println("a) " + result);
    }
}


