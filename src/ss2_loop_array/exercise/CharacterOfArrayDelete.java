package ss2_loop_array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class CharacterOfArrayDelete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input array length:");
        int length = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Input character of array: ");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println(Arrays.toString(arr));
        System.out.print("Input character that you need delete: ");
        int character = scanner.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == character) {
                System.out.println(character + "appear at index_" + i);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == character) {
                while (i < arr.length-1) {
                    int change = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = change;
                    i++;
                }
                arr[arr.length - 1] = 0;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
