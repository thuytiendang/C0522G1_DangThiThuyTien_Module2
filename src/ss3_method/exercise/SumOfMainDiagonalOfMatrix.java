package ss3_method.exercise;

import java.util.Scanner;

public class SumOfMainDiagonalOfMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input row:");
        int row = scanner.nextInt();
        System.out.print("Input col: ");
        int col = scanner.nextInt();
        int[][] arr = new int[row][col];

        SumOfCollum.createArray(scanner,  arr);
        int sum = 0;
        for (int i= 0; i< arr.length;i++){
            sum += arr[i][i];
        }
        System.out.println("sum of main diagonal of matrix:");
        System.out.println(sum);
    }
}
