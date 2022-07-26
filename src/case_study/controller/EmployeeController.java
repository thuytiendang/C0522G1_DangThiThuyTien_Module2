package case_study.controller;

import case_study.service.IEmployeeService;
import case_study.service.impl.EmployeeService;

import java.util.Scanner;

public class EmployeeController {
    Scanner scanner = new Scanner(System.in);
    IEmployeeService iEmployeeService = new EmployeeService();
    public void employeeManagement() {
        do {
            int choice;
            while (true){
                System.out.println("1\tDisplay list employees\n" +
                        "2\tAdd new employee\n" +
                        "3\tEdit employee\n" +
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
                    iEmployeeService.display();
                    break;
                case 2:
                    iEmployeeService.add();
                    break;
                case 3:
                    iEmployeeService.edit();
                    break;
                case 4:
                    return;
                default:
                    System.err.println("The number you entered is incorrect. Please re-enter the number");
            }
        } while (true);

    }

}
