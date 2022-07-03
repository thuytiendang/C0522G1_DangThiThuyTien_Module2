package ss1_java_introduction.practice;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.print("Input a year: ");
        Scanner scanner = new Scanner(System.in);
        int year = Integer.parseInt(scanner.nextLine());
//        if (year % 4 == 0) {
//            if (year % 100 == 0) {
//                if (year % 400 == 0) {
//                    System.out.printf("%d is a leap year", year);
//                } else {
//                    System.out.printf("%d is NOT a leap year", year);
//                }
//            } else {
//                System.out.printf("%d is a leap year", year);
//            }
//        } else {
//            System.out.printf("%d is NOT a leap year", year);
//        }

        boolean isLeapYear = false;

        boolean isDivisibleBy4 = year % 4 == 0;
        if (isDivisibleBy4) {
            boolean isDivisibleBy100 = year % 100 == 0;
            if (isDivisibleBy100) {
                boolean isDivisibleBy400 = year % 400 == 0;
                if (isDivisibleBy400) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        if (isLeapYear) {
            System.out.printf("%d is a leap year", year);
        } else {
            System.out.printf("%d is NOT a leap year", year);
        }
    }
}

