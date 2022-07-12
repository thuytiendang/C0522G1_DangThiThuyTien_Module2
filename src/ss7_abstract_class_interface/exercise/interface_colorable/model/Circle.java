package ss7_abstract_class_interface.exercise.interface_colorable.model;

import ss7_abstract_class_interface.exercise.interface_rezizeable.model.Shape;

public class Circle extends Shape{
    private double radius = 1.0;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of \n"+
                super.toString() + "\n"+
                "with area: " + getArea() + "\n"+
                "and perimeter: " + getPerimeter();
    }

}
