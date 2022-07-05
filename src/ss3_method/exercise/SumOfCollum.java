package ss3_method.exercise;

import java.util.Scanner;

public class SumOfCollum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input row ");
        int row = scanner.nextInt();
        System.out.print("Input col ");
        int col = scanner.nextInt();
        int[][] arr = new int[row][col];

        createArray(scanner,  arr);

        int collum;
        do {
            System.out.println("what collum do you want to calculate");
            collum = scanner.nextInt();
            if (collum < 0 || collum > col - 1) {
                System.out.println("Retype collum: ");
            }
        } while (collum < 0 || collum > col - 1);

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
                sum += arr[i][collum];
        }
        System.out.printf("Sum of character at collum %d\n", collum);
        System.out.println(sum);

    }

    public static void createArray(Scanner scanner, int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("input arr[%d][%d] =  ", i, j);
                arr[i][j] = scanner.nextInt();
            }
        }
    }
}
