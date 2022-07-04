package ss2_loop_array.exercise;

import java.util.Scanner;

public class MaxElementIn2DimensionArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input row");
        int row = scanner.nextInt();
        System.out.print("Input col");
        int col = scanner.nextInt();
        int[][] arr = new int[row][col];


        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("input arr[%d][%d] = ", i, j);
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("matrix:");
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
                System.out.println();
            }
        }
        System.out.println(" max element in array:");
        System.out.println(max);

    }
}
