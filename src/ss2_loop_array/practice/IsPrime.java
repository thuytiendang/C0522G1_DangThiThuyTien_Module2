package ss2_loop_array.practice;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number you want to check:");
        int number = Integer.parseInt(scanner.nextLine());
//        int count = 0;
//        for (int i = 1; i <= number; i++) {
//            if (number % i == 0) {
//                count++;
//            }
//        }
//        if (count == 2) {
//            System.out.println(number + " is a prime");
//        } else {
//            System.out.println(" is not a prime");
//        }
        if (number<2){
            System.out.println(number + " is not a prime");
        } else {
            int i = 2;
            boolean check = true;
//            while (i <= Math.sqrt(number)) {
//                if (number % i == 0) {
//                    check = false;
//                    break;
//                }
//                i++;
//            }
            while (i<number){
                if (number%i==0){
                    check = false;
                    break;
                }
                i++;
            }
            if (check){
                System.out.println(number+ " is a prime");
            } else {
                System.out.println(number + " is not a prime");
            }
        }
    }
}

