package ss2_loop_array.practice;

import java.util.Scanner;

public class InterestLoan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Loan");
        double loan = Double.parseDouble(scanner.nextLine());

        System.out.print("Input interest rate (% month)");
        double rate = Double.parseDouble(scanner.nextLine());

        System.out.print("How long will you want to borrow?");
        int month = Integer.parseInt(scanner.nextLine());

        double interest = 0;
        for (int i = 0; i < month; i++) {
            interest += loan * rate / 100 * month;
        }
        System.out.println("total of interest: " + interest + "vnd");
    }
}
