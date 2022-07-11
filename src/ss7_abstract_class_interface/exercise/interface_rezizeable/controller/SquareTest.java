package ss7_abstract_class_interface.exercise.interface_rezizeable.controller;

import ss7_abstract_class_interface.exercise.interface_rezizeable.model.Square;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square+ "\n");

        square.resize(20);
        System.out.println(square);
    }

}
