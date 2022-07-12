package ss7_abstract_class_interface.exercise.interface_colorable.controller;

import ss7_abstract_class_interface.exercise.interface_colorable.model.Circle;
import ss7_abstract_class_interface.exercise.interface_colorable.model.Colorable;
import ss7_abstract_class_interface.exercise.interface_colorable.model.Square;
import ss7_abstract_class_interface.exercise.interface_rezizeable.model.Shape;

public class SquareTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(3);
        shapes[1] = new Square(4);


        for (Shape shape : shapes){
            System.out.println(shape + "\n");
//            if (shape instanceof Square){
//                System.out.println(((Square) shape).howToColor());
//            }
            if (shape instanceof Colorable){
                System.out.println(((Colorable) shape).howToColor());
            }


        }
    }
}
