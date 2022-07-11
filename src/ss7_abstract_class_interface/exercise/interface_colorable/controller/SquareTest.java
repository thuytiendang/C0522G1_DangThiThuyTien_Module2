package ss7_abstract_class_interface.exercise.interface_colorable.controller;

import ss7_abstract_class_interface.exercise.interface_colorable.model.Square;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square("yellow", true, 3);
        System.out.println(square + "\n");

        square.howToColor();
        System.out.println(square);
    }
}
