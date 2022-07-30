package case_study.controller;

import case_study.service.ICustomerService;
import case_study.service.impl.CustomerService;

import java.util.Scanner;

public class CustomerController {
    Scanner scanner = new Scanner(System.in);
    ICustomerService iCustomerService = new CustomerService();
    public void customerManagement() {
        do {
            int choice;
            while (true){
                System.out.println("1.\tDisplay list customers\n" +
                        "2.\tAdd new customer\n" +
                        "3.\tEdit customer\n" +
                        "4.\tReturn main menu\n");
                try {
                    System.out.println("input your choice");
                    choice = Integer.parseInt(scanner.nextLine());
                    break;
                }catch (NumberFormatException e){
                    e.printStackTrace();
                }
            }

            switch (choice) {
                case 1:
                    iCustomerService.display();
                    break;
                case 2:
                    iCustomerService.add();
                    break;
                case 3:
                    iCustomerService.display();
                    iCustomerService.edit();
                    break;
                case 4:
                    return;
                default:
                    System.err.println("The number you entered is incorrect. Please re-enter the number");
            }
        } while (true);
    }
}
