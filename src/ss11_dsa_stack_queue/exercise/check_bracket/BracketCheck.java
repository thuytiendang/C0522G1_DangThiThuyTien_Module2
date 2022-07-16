package ss11_dsa_stack_queue.exercise.check_bracket;

import java.util.Scanner;
import java.util.Stack;

public class BracketCheck {
    public static void main(String[] args) {
        boolean check = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập biểu thức.");
        String string = scanner.nextLine();
        Stack<String> stack = new Stack<>();
        String[] array;
        array = string.split("");
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("(")){
                stack.push(array[i]);
            }
            if (array[i].equals(")")){
                if (stack.isEmpty()){
                    check = false;
                    break;
                } else {
                    stack.pop();
                }
            }
        }

        if (!check || !stack.isEmpty()){
            System.out.println("biểu thức sai");
        }else {
            System.out.println("biểu thức đúng");
        }

    }
}
