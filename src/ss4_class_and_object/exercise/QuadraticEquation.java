package ss4_class_and_object.exercise;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        return Math.pow(getB(), 2) - 4 * getA() * getC();
    }

    public double getRoot1() {
        return (-getB() + Math.sqrt(getDiscriminant())) / (2 * getA());
    }

    public double getRoot2() {
        return (-getB() - Math.sqrt(getDiscriminant())) / (2 * getA());
    }

    public double getDoubleRoot() {
        return (-getB()) / (2 * getA());
    }
}
