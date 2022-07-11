package ss6_inheritance.practice.controller;

import ss6_inheritance.practice.model.Shape;

public class CheckShape {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);
    }
}
