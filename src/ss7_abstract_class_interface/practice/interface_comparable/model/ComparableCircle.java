package ss7_abstract_class_interface.practice.interface_comparable.model;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle(String color, boolean filled, double radius) {
        super(color, filled, radius);
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle() {
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) return 1;
        if (getRadius() < o.getRadius()) return -1;
        return 0;
    }
}
