package ss7_abstract_class_interface.exercise.interface_rezizeable.controller;


import ss7_abstract_class_interface.exercise.interface_rezizeable.model.*;


public class ResizeableTest {
    public static void main(String[] args) {
        double percent = Math.floor(Math.random()*100) + 1;
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Square();

        for (Shape shape : shapes) {
            System.out.println(shape + "\n");
        }

        System.out.println("percent: " + percent + "%");

        for (Shape shape : shapes){
            /*if(shape instanceof Circle){
                ((Circle)shape).resize(percent);
            }else if (shape instanceof Rectangle){
                ((Rectangle)shape).resize(percent);
            } else if (shape instanceof Square){
                ((Square)shape).resize(percent);
            }*/

            if(shape instanceof Resizeable){
                ((Resizeable) shape).resize(percent);
            }
            System.out.println(shape + "\n");
        }
    }
}
