package ss5_static_access_modifier.main;

import ss5_static_access_modifier.exercise.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("radius: " + circle.getRadius() + " area: " + circle.getArea());
    }
}
