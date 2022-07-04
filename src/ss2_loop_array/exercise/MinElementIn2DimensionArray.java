package ss2_loop_array.exercise;

import java.util.Scanner;

public class MinElementIn2DimensionArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input row");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("input col");
        int col = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("input arr[%d][%d]= ", i, j);
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("matrix");
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
                if (arr[i][j] < min){
                    min =  arr[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("min element in array:");
        System.out.println(min);
    }
}
