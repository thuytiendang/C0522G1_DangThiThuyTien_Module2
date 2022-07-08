package ss6_inheritance.point_moveablePoint.controller;

import ss6_inheritance.point_moveablePoint.model.MovablePoint;

public class CheckMovablePoint {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(2,3,4,5);
        System.out.println(movablePoint.toString());
        System.out.println(movablePoint.move());
    }
}
