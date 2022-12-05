package thuc_hanh_2_phone_management.controller;

import thuc_hanh_2_phone_management.service.IHandPhoneService;
import thuc_hanh_2_phone_management.service.imple.HandPhoneService;

import java.util.Scanner;

public class HandPhoneController {
    Scanner scanner = new Scanner(System.in);
    IHandPhoneService iHandPhoneService = new HandPhoneService();

    public void handPhoneMenu() {
        do {
            int choice;
            while (true) {
                System.out.println("1.\tCreate\n" +
                        "2.\tDelete\n" +
                        "3.\tShow phone list\n" +
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
                    iHandPhoneService.add();
                    break;
                case 2:
                    iHandPhoneService.remove();
                    break;
                case 3:
                    iHandPhoneService.show();
                    break;
                case 4:
                    iHandPhoneService.find();
                    break;
                case 5:
                    return;
                default:
                    System.err.println("The number you entered is incorrect. Please re-enter the number");
            }
        } while (true);
    }
}
