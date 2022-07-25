package ss17_file_serialization.exercise.product_management.view;

import ss17_file_serialization.exercise.product_management.controller.ProductManagementController;

public class Main {
    public static void main(String[] args) {

        ProductManagementController productManagementController = new ProductManagementController();
        productManagementController.displayMainMenu();
    }

}
