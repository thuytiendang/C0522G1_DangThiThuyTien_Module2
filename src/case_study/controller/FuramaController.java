package case_study.controller;

import java.util.Scanner;

public class FuramaController {
    public void displayMainMenu() {
        int choice;
        do {
            System.out.println("1.\tEmployee Management\n" +
                    "2.\tCustomer Management\n" +
                    "3.\tFacility Management \n" +
                    "4.\tBooking Management\n" +
                    "5.\tPromotion Management\n" +
                    "6.\tExit\n");

            Scanner scanner = new Scanner(System.in);
            System.out.println("input your choice");
            choice = Integer.parseInt(scanner.nextLine());
            if (choice <= 0 || choice > 6) {
                System.out.println("retype your choice");
            }
        } while (choice <= 0 || choice > 6);


        switch (choice) {
            case 1:
                employeeManagement();
                break;
            case 2:
               customerManagement();
               break;
            case 3:
                facilityManagement();
                break;
            case 4:
                bookingManagement();
                break;
            case 5:
                promotionManagement();
                break;
            case 6:
                System.exit(0);

        }

    }

    public void employeeManagement() {
        int choice;
        do {
            System.out.println("1\tDisplay list employees\n" +
                    "2\tAdd new employee\n" +
                    "3\tEdit employee\n" +
                    "4\tReturn main menu\n");

            Scanner scanner = new Scanner(System.in);
            System.out.println("input your choice");
            choice = Integer.parseInt(scanner.nextLine());
            if (choice <= 0 || choice > 4) {
                System.out.println("retype your choice");
            }
        } while (choice <= 0 || choice > 4);

        switch (choice) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                displayMainMenu();
                break;
        }
    }

    public void customerManagement() {
        int choice;
        do {
            System.out.println("1.\tDisplay list customers\n" +
                    "2.\tAdd new customer\n" +
                    "3.\tEdit customer\n" +
                    "4.\tReturn main menu\n");

            Scanner scanner = new Scanner(System.in);
            System.out.println("input your choice");
            choice = Integer.parseInt(scanner.nextLine());
            if (choice <= 0 || choice > 4) {
                System.out.println("retype your choice");
            }
        } while (choice <= 0 || choice > 4);

        switch (choice) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                displayMainMenu();
                break;
        }
    }

    public void facilityManagement() {
        int choice;
        do {
            System.out.println("1\tDisplay list facility\n" +
                    "2\tAdd new facility\n" +
                    "3\tDisplay list facility maintenance\n" +
                    "4\tReturn main menu\n");

            Scanner scanner = new Scanner(System.in);
            System.out.println("input your choice");
            choice = Integer.parseInt(scanner.nextLine());
            if (choice <= 0 || choice > 4) {
                System.out.println("retype your choice");
            }
        } while (choice <= 0 || choice > 4);

        switch (choice) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                displayMainMenu();
                break;
        }
    }

    public void bookingManagement() {
        int choice;
        do {
            System.out.println("1.\tAdd new booking\n" +
                    "2.\tDisplay list booking\n" +
                    "3.\tCreate new constracts\n" +
                    "4.\tDisplay list contracts\n" +
                    "5.\tEdit contracts\n" +
                    "6.\tReturn main menu\n");

            Scanner scanner = new Scanner(System.in);
            System.out.println("input your choice");
            choice = Integer.parseInt(scanner.nextLine());
            if (choice <= 0 || choice > 4) {
                System.out.println("retype your choice");
            }
        } while (choice <= 0 || choice > 4);

        switch (choice) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                displayMainMenu();
                break;
        }
    }

    public void promotionManagement() {
        int choice;
        do {
            System.out.println("1.\tDisplay list customers use service\n" +
                    "2.\tDisplay list customers get voucher\n" +
                    "3.\tReturn main menu\n");

            Scanner scanner = new Scanner(System.in);
            System.out.println("input your choice");
            choice = Integer.parseInt(scanner.nextLine());
            if (choice <= 0 || choice > 4) {
                System.out.println("retype your choice");
            }
        } while (choice <= 0 || choice > 4);

        switch (choice) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                displayMainMenu();
                break;
        }
    }

    public static void main(String[] args) {
        FuramaController furamaController = new FuramaController();
        furamaController.displayMainMenu();
    }
}
