package case_study.controller;

import case_study.service.IBookingService;
import case_study.service.impl.BookingService;

import java.util.Scanner;

public class BookingController {
    Scanner scanner = new Scanner(System.in);
    IBookingService iBookingService = new BookingService();

    public void bookingManagement() {
        do {
            int choice;
            while (true) {
                System.out.println("1.\tAdd new booking\n" +
                        "2.\tDisplay list booking\n" +
                        "3.\tCreate new contracts\n" +
                        "4.\tDisplay list contracts\n" +
                        "5.\tEdit contracts\n" +
                        "6.\tReturn main menu\n");

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
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    return;
                default:
                    System.err.println("The number you entered is incorrect. Please re-enter the number");
            }
        } while (true);

    }
}
