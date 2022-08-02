package thuc_hanh_1_bank_account.controller;

import thuc_hanh_1_bank_account.service.IPaymentAccountService;
import thuc_hanh_1_bank_account.service.impl.PaymentAccountService;

import java.util.Scanner;

public class PaymentAccountController {
    Scanner scanner = new Scanner(System.in);
    IPaymentAccountService iPaymentAccountService = new PaymentAccountService();

    public void paymentAccountMenu() {
        do {
            int choice;
            while (true) {
                System.out.println("1.\tCreate\n" +
                        "2.\tDelete\n" +
                        "3.\tShow account list\n" +
                        "4.\tFind\n" +
                        "5.\tReturn main menu\n");
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
                    iPaymentAccountService.add();
                    break;
                case 2:
                    iPaymentAccountService.remove();
                    break;
                case 3:
                    iPaymentAccountService.show();
                    break;
                case 4:
                    iPaymentAccountService.find();
                    break;
                case 5:
                    return;
                default:
                    System.err.println("The number you entered is incorrect. Please re-enter the number");
            }
        } while (true);
    }
}


