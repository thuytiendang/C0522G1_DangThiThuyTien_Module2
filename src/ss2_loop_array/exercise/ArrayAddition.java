package ss2_loop_array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input length of array1:");
        int length1 = Integer.parseInt(scanner.nextLine());
        int[] arr1 = new int[length1];

        for (int i = 0; i < arr1.length; i++) {
            System.out.print("input character of array");
            arr1[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.print("Input length of array2:");
        int length2 = Integer.parseInt(scanner.nextLine());
        int[] arr2 = new int[length2];

        for (int i = 0; i < arr2.length; i++) {
            System.out.print("input character of array");
            arr2[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.print("Array 1: ");
        System.out.println(Arrays.toString(arr1));
        System.out.print("Array 2: ");
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = new int[length1 + length2];

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = arr1.length; i < arr3.length; i++) {
            arr3[i] = arr2[i - arr1.length];
        }
        System.out.print("New array:");
        System.out.println(Arrays.toString(arr3));
    }
}


