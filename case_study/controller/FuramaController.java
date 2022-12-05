package case_study.controller;

import java.util.Scanner;

public class FuramaController {
    Scanner scanner = new Scanner(System.in);
    EmployeeController employeeController = new EmployeeController();
    CustomerController customerController = new CustomerController();
    FacilityController facilityController = new FacilityController();
    BookingController bookingController = new BookingController();
    PromotionController promotionController = new PromotionController();
    public void displayMainMenu() {
        do {
            int choice ;
            while (true){
                System.out.println("1.\tEmployee Management\n" +
                        "2.\tCustomer Management\n" +
                        "3.\tFacility Management \n" +
                        "4.\tBooking Management\n" +
                        "5.\tPromotion Management\n" +
                        "6.\tExit\n");
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
                    employeeController.employeeManagement();
                    break;
                case 2:
                    customerController.customerManagement();
                    break;
                case 3:
                    facilityController.facilityManagement();
                    break;
                case 4:
                    bookingController.bookingManagement();
                    break;
                case 5:
                    promotionController.promotionManagement();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.err.println("The number you entered is incorrect. Please re-enter the number");
            }
        } while (true);
    }
}
