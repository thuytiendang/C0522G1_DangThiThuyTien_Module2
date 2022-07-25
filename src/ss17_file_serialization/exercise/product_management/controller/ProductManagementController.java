package ss17_file_serialization.exercise.product_management.controller;

import ss17_file_serialization.exercise.product_management.service.IProductService;
import ss17_file_serialization.exercise.product_management.service.ProductService;

import java.util.Scanner;

public class ProductManagementController {
    public void displayMainMenu() {
        IProductService iProductService = new ProductService();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            while (true) {
                try {
                    System.out.println("PRODUCT MANAGEMENT SYSTEM\n" +
                            "1. add product\n" +
                            "2. display product\n" +
                            "3. find product\n" +
                            "4. exit");
                    System.out.println("Please enter your choice: ");
                    choice = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println(" Please enter the number");
                }

            }
            switch (choice) {
                case 1:
                    iProductService.add();
                    break;
                case 2:
                    iProductService.show();
                    break;
                case 3:
                    iProductService.find();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.err.println("The choice you entered is incorrect. Please re-enter the number");
            }
        } while (true);
    }
}
