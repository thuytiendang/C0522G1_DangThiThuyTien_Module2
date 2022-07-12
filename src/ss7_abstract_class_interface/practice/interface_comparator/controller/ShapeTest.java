package ss7_abstract_class_interface.practice.interface_comparator.controller;

import ss7_abstract_class_interface.practice.interface_comparator.model.Shape;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);
    }
}
