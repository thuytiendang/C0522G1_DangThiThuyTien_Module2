package case_study.controller;

import case_study.service.IFacilityService;
import case_study.service.impl.FacilityService;

import java.util.Scanner;

public class FacilityController {
    Scanner scanner = new Scanner(System.in);
    IFacilityService iFacilityService = new FacilityService();
    public void facilityManagement() {
        do {
            int choice;
            while (true){
                System.out.println("1\tDisplay list facility\n" +
                        "2\tAdd new facility\n" +
                        "3\tDisplay list facility maintenance\n" +
                        "4\tReturn main menu\n");
                try {
                    System.out.println("input your choice");
                    choice = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e){
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
                    return;
                default:
                    System.err.println("The number you entered is incorrect. Please re-enter the number");
            }
        } while (true);
    }
}
