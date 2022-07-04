package ss2_loop_array.exercise;

import java.util.Scanner;

public class TypeOfShape {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Print the rectangle");
                    System.out.print("Input length: ");
                    int length = scanner.nextInt();
                    System.out.print("Input width: ");
                    int width = scanner.nextInt();

                    for (int i = 0; i < width; i++) {
                        for (int j = 0; j < length; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Print the square triangle");
                    System.out.print("Input height: ");
                    int height = scanner.nextInt();

                    System.out.println("Botton-left: ");
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }

                    System.out.println("Top-left: ");
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < height - i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }

                    System.out.println("Top-right: ");
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < height; j++) {
                            if (j < i) {
                                System.out.print(" ");
                            } else {
                                System.out.print("*");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println("Botton-right: ");
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < height; j++) {
                            if (j < height - i - 1) {
                                System.out.print(" ");
                            } else {
                                System.out.print("*");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("\nPrint isosceles triangle");
                    System.out.print("Input height: ");
                    int high = scanner.nextInt();
                    for (int i = 0; i < high; i++) {
                        for (int j = 0; j < high + i; j++) {
                            if (j < high - i - 1) {
                                System.out.print(" ");
                            } else {
                                System.out.print("*");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("No choice!\n");
            }
        } while (choice != 0);
    }
}
