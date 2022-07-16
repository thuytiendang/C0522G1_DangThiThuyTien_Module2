package ss11_dsa_stack_queue.exercise.swap_array;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class StringSwap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chuỗi của bạn.");
        String string = scanner.nextLine();
        String[] newString;
        Stack<String> stack = new Stack<>();
        newString = string.split(" ");

        for (int i = 0; i < newString.length; i++) {
            stack.push(newString[i]);
        }

        System.out.println("Mảng trước khi đảo: " + Arrays.toString(newString));

        for (int i = 0; i < newString.length; i++) {
            newString[i] = stack.pop();
        }

        System.out.println("Mảng sau khi đảo: " + Arrays.toString(newString));
    }
}
