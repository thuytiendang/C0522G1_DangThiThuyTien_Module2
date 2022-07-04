package ss2_loop_array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class CharacterOfArrayAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input length of array:");
        int length = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("input character of array");
            arr[i] = Integer.parseInt(scanner.nextLine());

        }
        System.out.println(Arrays.toString(arr));
        System.out.print("Input a number that you want to insert: ");

        int number = Integer.parseInt(scanner.nextLine());
        int index;
        do {
            System.out.print("Input index that you want to insert: ");
            index = Integer.parseInt(scanner.nextLine());
            if (index <= -1 || index >= arr.length - 1) {
                System.out.println("Can't insert character to array");
            }
        } while (index <= -1 || index >= arr.length - 1);

        int[] newArray = new int[arr.length + 1];

        for (int i = 0; i < index; i++) {
            newArray[i] = arr[i];
        }
        newArray[index] = number;
        for (int i = index + 1; i < newArray.length; i++) {
            newArray[i] = arr[i - 1];
        }
        System.out.println("New array:");
        System.out.println(Arrays.toString(newArray));
    }
}
