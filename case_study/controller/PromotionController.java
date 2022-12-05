package case_study.controller;

import java.util.Scanner;

public class PromotionController {
    Scanner scanner = new Scanner(System.in);
    public void promotionManagement() {
        do {
            int choice;
            while (true){
                System.out.println("1.\tDisplay list customers use service\n" +
                        "2.\tDisplay list customers get voucher\n" +
                        "3.\tReturn main menu\n");
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
                    break;
                case 2:
                    break;
                case 3:
                    return;
                default:
                    System.err.println("The number you entered is incorrect. Please re-enter the number");
            }
        } while (true);
    }
}
