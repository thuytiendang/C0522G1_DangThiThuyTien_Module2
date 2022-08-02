package thuc_hanh_1_bank_account.view;

import thuc_hanh_1_bank_account.controller.AccountManagementController;

public class View {
    public static void main(String[] args) {
        AccountManagementController accountManagementController = new AccountManagementController();
        accountManagementController.displayMainMenu();
    }
}
