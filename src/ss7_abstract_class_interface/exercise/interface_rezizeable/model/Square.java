package ss7_abstract_class_interface.exercise.interface_rezizeable.model;

public class Square extends Shape implements Resizeable {
    private double width = 1.0;

    public Square(String color, boolean filled, double width) {
        super(color, filled);
        this.width = width;
    }

    public Square(double width) {
        this.width = width;
    }

    public Square() {
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return Math.pow(getWidth(), 2);
    }

    public double getPerimeter() {
        return 4 * getWidth();
    }

    @Override
    public String toString() {
        return "Square with width" +
                getWidth() +
                ", which is a subclass of " +
                super.toString() + "\n"+
                "with area: " + getArea() + "\n"+
                "and perimeter: " + getPerimeter();
    }

    @Override
    public void resize(double percent) {
        setWidth(getWidth() + (getWidth() * percent / 100));
    }
}
