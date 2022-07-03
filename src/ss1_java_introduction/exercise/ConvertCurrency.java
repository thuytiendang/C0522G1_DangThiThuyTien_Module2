package ss1_java_introduction.exercise;

import java.util.Scanner;

public class ConvertCurrency {
    public static void main(String[] args) {
        int rate = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much USD you want to input?");
        int usd = Integer.parseInt(scanner.nextLine());
        int vnd = usd * rate;
        System.out.println(usd + " USD = " + vnd + " VND");
    }
}
