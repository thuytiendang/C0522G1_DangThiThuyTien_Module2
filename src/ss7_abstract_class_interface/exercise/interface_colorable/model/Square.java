package ss7_abstract_class_interface.exercise.interface_colorable.model;

import ss7_abstract_class_interface.exercise.interface_rezizeable.model.Shape;

public class Square extends Shape implements Colorable {
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
        return getWidth() * getWidth();
    }

    public double getPerimeter() {
        return 4 * getWidth();
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getWidth()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public String howToColor() {
        return "Color all four sides";
    }
}
