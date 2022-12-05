package thuc_hanh_2_phone_management.controller;

import java.util.Scanner;

public class PhoneController {
    Scanner scanner = new Scanner(System.in);
    BrandPhoneController brandPhoneController = new BrandPhoneController();
    HandPhoneController handPhoneController = new HandPhoneController();

    public void displayMainMenu() {
        do {
            int choice;
            while (true) {
                System.out.println("PHONE MANAGEMENT SYSTEM\n" +
                        "Choose function by number\n" +
                        "1.\tBrand phone management\n" +
                        "2.\tHand phone management\n" +
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
                   brandPhoneController.brandPhoneMenu();
                    break;
                case 2:
                    handPhoneController.handPhoneMenu();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.err.println("The number you entered is incorrect. Please re-enter the number");
            }
        } while (true);
    }
}
