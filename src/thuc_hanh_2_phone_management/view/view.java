package thuc_hanh_2_phone_management.view;

import thuc_hanh_2_phone_management.controller.PhoneController;

public class view {
    public static void main(String[] args) {
        PhoneController phoneController = new PhoneController();
        phoneController.displayMainMenu();
    }
}
