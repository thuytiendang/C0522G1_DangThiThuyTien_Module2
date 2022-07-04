package ss2_loop_array.exercise;

import java.util.Scanner;

public class FirstPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many prime do you want to print?");
        int number = Integer.parseInt(scanner.nextLine());

        int count = 0;
        int divisor = 0;
        for (int i = 2; i < 1000; i++) {
            if (count < number) {
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        divisor++;
                    }
                }if (divisor==2) {
                    System.out.println(i);;
                    count++;
                }
                divisor = 0;
            } else {
                break;
            }
            }
        }
    }

