package thuc_hanh_1_bank_account.controller;

import thuc_hanh_1_bank_account.service.ISavingAccountService;
import thuc_hanh_1_bank_account.service.impl.SavingAccountService;

import java.util.Scanner;

public class SavingAccountController {
    Scanner scanner = new Scanner(System.in);
    ISavingAccountService iSavingAccountService = new SavingAccountService();

    public void savingAccountMenu() {
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
                    iSavingAccountService.add();
                    break;
                case 2:
                    iSavingAccountService.remove();
                    break;
                case 3:
                    iSavingAccountService.show();
                    break;
                case 4:
                    iSavingAccountService.find();
                    break;
                case 5:
                    return;
                default:
                    System.err.println("The number you entered is incorrect. Please re-enter the number");
            }
        } while (true);
    }
}

