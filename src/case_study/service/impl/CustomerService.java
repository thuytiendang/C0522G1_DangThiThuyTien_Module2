package case_study.service.impl;

import case_study.model.person.Customer;
import case_study.model.person.Employee;
import case_study.service.ICustomerService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    private static List<Customer> customers = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void edit() {
        System.out.println("Input name of customer you want to edit?");
        String name = scanner.nextLine();
        boolean isExisted = false;
        for (Customer customer : customers) {
            if (name.equals(customer.getName())) {
                isExisted = true;
                customer.setDateOfBirth(scanner.nextLine());
                customer.setGender(scanner.nextLine());
                while (true) {
                    try {
                        customer.setIdentityCard(Integer.parseInt(scanner.nextLine()));
                        customer.setPhoneNumber(Integer.parseInt(scanner.nextLine()));
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter the number!");
                    }
                }
                customer.setEmail(scanner.nextLine());
                customer.setCustomerCode(scanner.nextLine());
                customer.setTypeOfCustomer(scanner.nextLine());
                customer.setAddress(scanner.nextLine());

                System.out.println("Edit successful!");
                break;
            }
        }
        if (!isExisted) {
            System.err.printf("%s is not exit!\n", name);
        }
    }

    @Override
    public void display() {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    @Override
    public Customer add() {
        System.out.println("input name:");
        String name = scanner.nextLine();
        System.out.println("input day of birth:");
        String dayOfBirth = scanner.nextLine();
        System.out.println("input gender: ");
        String gender = scanner.nextLine();
        int identityCard;
        int phoneNumber;
        while (true) {
            try {
                System.out.println("input identity card:");
                identityCard = Integer.parseInt(scanner.nextLine());
                System.out.println("input phone number:");
                phoneNumber = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Please enter the number!");
            }
        }
        System.out.println("input email:");
        String email = scanner.nextLine();
        System.out.println("input customer code: ");
        String customerCode = scanner.nextLine();
        System.out.println("input typeOfCustomer: ");
        String typeOfCustomer = scanner.nextLine();
        System.out.println("input address:");
        String address = scanner.nextLine();

        return new Customer(name, dayOfBirth, gender, identityCard, phoneNumber, email, customerCode, typeOfCustomer, address);
    }
}

