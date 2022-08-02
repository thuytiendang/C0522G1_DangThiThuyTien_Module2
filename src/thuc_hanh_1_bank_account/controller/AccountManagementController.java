package thuc_hanh_1_bank_account.controller;

import java.util.Scanner;

public class AccountManagementController {
    Scanner scanner = new Scanner(System.in);
    PaymentAccountController paymentAccountController = new PaymentAccountController();
    SavingAccountController savingAccountController = new SavingAccountController();

    public void displayMainMenu() {
        do {
            int choice;
            while (true) {
                System.out.println("ACCOUNT MANAGEMENT SYSTEM\n" +
                        "Choose function by number\n" +
                        "1.\tPayment account management\n" +
                        "2.\tSaving account management\n" +
                        "3.\tExit\n");
                try {
                    System.out.println("input your choice");
                    choice = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }

            switch (choice) {
                case 1:
                    paymentAccountController.paymentAccountMenu();
                    break;
                case 2:
                    savingAccountController.savingAccountMenu();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.err.println("The number you entered is incorrect. Please re-enter the number");
            }
        } while (true);
    }
}
