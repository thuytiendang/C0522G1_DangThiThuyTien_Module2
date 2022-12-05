package thuc_hanh_2_phone_management.controller;

import thuc_hanh_2_phone_management.service.IBrandPhoneService;
import thuc_hanh_2_phone_management.service.imple.BrandPhoneService;

import java.util.Scanner;

public class BrandPhoneController {
    Scanner scanner = new Scanner(System.in);
    IBrandPhoneService iBrandPhoneService = new BrandPhoneService();
    public void brandPhoneMenu() {
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
                    iBrandPhoneService.add();
                    break;
                case 2:
                    iBrandPhoneService.remove();
                    break;
                case 3:
                    iBrandPhoneService.show();
                    break;
                case 4:
                    iBrandPhoneService.find();
                    break;
                case 5:
                    return;
                default:
                    System.err.println("The number you entered is incorrect. Please re-enter the number");
            }
        } while (true);
    }
}
