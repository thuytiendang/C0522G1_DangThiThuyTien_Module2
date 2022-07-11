package ss7_abstract_class_interface.exercise.interface_rezizeable.controller;


import ss7_abstract_class_interface.exercise.interface_rezizeable.model.Circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle + "\n");

        circle.resize(20);
        System.out.println(circle);
    }
}
