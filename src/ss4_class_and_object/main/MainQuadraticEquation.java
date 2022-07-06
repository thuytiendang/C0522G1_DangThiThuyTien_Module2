package ss4_class_and_object.main;

import ss4_class_and_object.exercise.QuadraticEquation;

import java.util.Scanner;

public class MainQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input a");
        double a = scanner.nextDouble();
        System.out.println("input b");
        double b = scanner.nextDouble();
        System.out.println("input c");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("The equation has 2 roots: ");
            System.out.println(quadraticEquation.getRoot1());
            System.out.println(quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("The equation has 1 double roots: ");
            System.out.println(quadraticEquation.getDoubleRoot());
        } else {
            System.out.println("The equation has no roots.");
        }
    }
}
