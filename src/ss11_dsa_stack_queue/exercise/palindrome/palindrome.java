package ss11_dsa_stack_queue.exercise.palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class palindrome {
    public static void main(String[] args) {
        boolean isPalindrome = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chuỗi cần kiểm tra: ");
        String string = scanner.nextLine();
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            stack.push(String.valueOf(string.charAt(i)));
        }

        for (int i = 0; i < string.length(); i++) {
            queue.add(String.valueOf(string.charAt(i)));
        }

        for (int i = 0; i < string.length()/2; i++) {
            boolean check = stack.pop().equals(queue.poll());
            if (!check){
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome);


    }
}
