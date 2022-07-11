package ss7_abstract_class_interface.practice.interface_comparable.controller;


import ss7_abstract_class_interface.practice.interface_comparable.model.Shape;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);
    }
}

