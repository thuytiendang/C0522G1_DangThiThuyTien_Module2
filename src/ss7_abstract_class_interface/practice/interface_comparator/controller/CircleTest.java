package ss7_abstract_class_interface.practice.interface_comparator.controller;

import ss7_abstract_class_interface.practice.interface_comparator.model.Circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3);
        System.out.println(circle);

        circle = new Circle(3,"yellow",false);
        System.out.println(circle);
    }
}
