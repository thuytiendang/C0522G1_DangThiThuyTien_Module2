package ss7_abstract_class_interface.exercise.interface_rezizeable.controller;


import ss7_abstract_class_interface.exercise.interface_rezizeable.model.Circle;
import ss7_abstract_class_interface.exercise.interface_rezizeable.model.Rectangle;
import ss7_abstract_class_interface.exercise.interface_rezizeable.model.Shape;
import ss7_abstract_class_interface.exercise.interface_rezizeable.model.Square;

import java.util.Scanner;

public class ResizeableTest {
    public static void main(String[] args) {
        System.out.println("input proportion that you want to change:");
        Scanner scanner = new Scanner(System.in);
        int proportion = scanner.nextInt();
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Square();

        for (Shape shape : shapes) {
            System.out.println(shape + "\n");

        }
    }
}
