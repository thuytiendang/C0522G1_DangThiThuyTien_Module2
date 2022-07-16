package ss11_dsa_stack_queue.exercise.swap_array;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class IntegerSwap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập số phần tử muốn đưa vào mảng.");
        int number = Integer.parseInt(scanner.nextLine());

        int[] array = new int[number];
        for (int i = 0; i <number ; i++) {
            System.out.printf("Nhập giá trị tại %d:", i+1);
            array[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.print("Mảng trước khi bị đảo: " + Arrays.toString(array));

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
        System.out.println("\nMảng sau khi bị đảo: " + Arrays.toString(array));

    }
}
