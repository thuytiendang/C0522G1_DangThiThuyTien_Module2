package ss7_abstract_class_interface.exercise.interface_rezizeable.controller;


import ss7_abstract_class_interface.exercise.interface_rezizeable.model.Rectangle;

public class RectangleTest {
    public static void main(String[] args) {
       Rectangle rectangle = new Rectangle();
        System.out.println(rectangle+ "\n");

        rectangle.resize(20);
        System.out.println(rectangle);
    }
}
