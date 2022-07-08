package ss6_inheritance.circle_cylinder.model;

public class Cylinder extends Circle {
    private double height =1;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double high) {
        this.height = high;
    }

    public double getVolume(){
        return getArea()* getHeight();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "high=" + height +
                ", radius=" + super.getRadius() +
                ", color='" + super.getColor() + '\'' +
                "} " ;
    }
}
