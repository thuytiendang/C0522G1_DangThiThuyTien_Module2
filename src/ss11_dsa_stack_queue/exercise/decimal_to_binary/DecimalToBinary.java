package ss11_dsa_stack_queue.exercise.decimal_to_binary;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần chuyển đổi");
        int number = Integer.parseInt(scanner.nextLine());
        while (number > 0) {
            stack.push(number % 2);
            number = number / 2;
        }

        List<Integer> list = new ArrayList<>();
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
        System.out.println("được chuyển đổi sang hệ nhị phân là" + list);
    }
}
