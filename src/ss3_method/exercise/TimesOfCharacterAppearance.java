package ss3_method.exercise;

import java.util.Scanner;

public class TimesOfCharacterAppearance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input a string");
        String str = scanner.nextLine();
        System.out.println("Input character you want to check:");
        char character = scanner.nextLine().charAt(0);

        int count = 0;
        for (int i= 0 ; i< str.length(); i++){
            if (str.charAt(i) == character){
                count++;
            }
        }
        System.out.printf("character %c appear %d times", character, count);
    }
}
