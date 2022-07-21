package ss15_exception_debug.exercise.controller;


import ss15_exception_debug.exercise.exception.IllegalTriangleException;
import ss15_exception_debug.exercise.model.Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstEdge;
        double secondEdge;
        double thirdEdge;

        while (true){
            try {
                System.out.println("NHập cạnh thứ nhất:");
                firstEdge = Double.parseDouble(scanner.nextLine());
                System.out.println("NHập cạnh thứ hai:");
                secondEdge = Double.parseDouble(scanner.nextLine());
                System.out.println("NHập cạnh thứ ba:");
                thirdEdge = Double.parseDouble(scanner.nextLine());
                Triangle triangle = new Triangle(firstEdge,secondEdge,thirdEdge);
                System.out.println(triangle);
                break;
            }catch (NumberFormatException e){
                System.out.println(e.getMessage());
                System.out.println("Vui lòng nhập số:");
            }catch (IllegalTriangleException e){
                System.out.println(e.getMessage());
                System.out.println("Vui lòng nhập cạnh hợp lệ:");
            }
        }
    }
}
