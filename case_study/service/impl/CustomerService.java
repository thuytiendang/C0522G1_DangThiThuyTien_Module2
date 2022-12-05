package case_study.service.impl;

import case_study.exception.DuplicateException;
import case_study.exception.PhoneException;
import case_study.model.person.Customer;
import case_study.service.ICustomerService;
import case_study.util.FurtherFunction;
import case_study.util.ReadWriteCustomer;
import case_study.util.RegexException;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    private static Scanner scanner = new Scanner(System.in);
    private static final String PATH = "src/case_study/data/customer.csv";

    @Override
    public void edit() {
        List<Customer> customers = ReadWriteCustomer.readCustomerFile(PATH);
        System.out.println("Input customer code you want to edit?");
        String customerCode = scanner.nextLine();
        boolean isExisted = false;
        for (Customer customer : customers) {
            if (customerCode.equals(customer.getCustomerCode())) {
                isExisted = true;
                System.out.println("Please input your change:");

                System.out.print("Change name. ");
                customer.setName(FurtherFunction.getName());

                System.out.print("Change day of birth. ");
                customer.setDateOfBirth(RegexException.getDateOfBirth());

                System.out.print("Change gender. ");
                customer.setGender(FurtherFunction.getGender());

                doWhile:
                do {
                    System.out.println("Do you want to change identity card?\n" +
                            "1. Yes\n" +
                            "2. No");
                    int choice;

                    while (true) {
                        try {
                            System.out.println("please input your choice: ");
                            choice = Integer.parseInt(scanner.nextLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.err.println("please input number!");
                        }
                    }
                    switch (choice) {
                        case 1:
                            int id;
                            while (true) {
                                try {
                                    System.out.println("Change identity card:");
                                    id = Integer.parseInt(scanner.nextLine());
                                    for (Customer customer1 : customers) {
                                        if (id == customer1.getIdentityCard()) {
                                            throw new DuplicateException("Identity was duplicated! please input other identity:");
                                        }
                                    }
                                    break;
                                } catch (NumberFormatException e) {
                                    System.out.println("Please enter the number!");
                                } catch (DuplicateException e) {
                                    System.out.println(e.getMessage());
                                }
                            }
                            customer.setIdentityCard(id);
                            break doWhile;
                        case 2:
                            break doWhile;
                        default:
                            System.err.println("Your choice is not exist! Please re-enter your choice:");
                    }
                } while (true);

                doWhileLoop:
                do {
                    System.out.println("Do you want to change phone number?\n" +
                            "1. Yes\n" +
                            "2. No");
                    int choice;

                    while (true) {
                        try {
                            System.out.println("please input your choice: ");
                            choice = Integer.parseInt(scanner.nextLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.err.println("please input number!");
                        }
                    }
                    switch (choice) {
                        case 1:
                            String phoneNumber;
                            while (true) {
                                try {
                                    System.out.println("change phone number:");
                                    phoneNumber = scanner.nextLine();
                                    if (RegexException.getPhoneNumber(phoneNumber)) {
                                        for (Customer customer1 : customers) {
                                            if (Objects.equals(phoneNumber, customer1.getPhoneNumber())) {
                                                throw new DuplicateException("Phone number was duplicated! please input other number:");
                                            }
                                        }
                                    } else {
                                        throw new PhoneException("Please enter the correct format, " +
                                                "phone number include 0 + 9 or 10 numbers after!");
                                    }
                                    break;
                                } catch (PhoneException | DuplicateException e) {
                                    System.out.println(e.getMessage());
                                }
                            }
                            customer.setPhoneNumber(phoneNumber);
                            break doWhileLoop;
                        case 2:
                            break doWhileLoop;
                        default:
                            System.err.println("Your choice is not exist! Please re-enter your choice:");
                    }
                } while (true);

                System.out.println("change email:");
                customer.setEmail(scanner.nextLine());

                System.out.println("change type of customer:");
                customer.setTypeOfCustomer(FurtherFunction.getTypeOfCustomer());

                System.out.println("change address");
                customer.setAddress(scanner.nextLine());

                ReadWriteCustomer.writeCustomerFile(PATH, customers);

                System.out.println("Edit successful!");
                break;
            }
        }
        if (!isExisted) {
            System.err.printf("%s is not exist!\n", customerCode);
            edit();
        }

    }

    @Override
    public void display() {
        List<Customer> customers = ReadWriteCustomer.readCustomerFile(PATH);
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    @Override
    public void add() {
        List<Customer> customers = ReadWriteCustomer.readCustomerFile(PATH);

        String name = FurtherFunction.getName();

        String dayOfBirth = RegexException.getDateOfBirth();

        String gender = FurtherFunction.getGender();

        int identityCard;
        while (true) {
            try {
                System.out.println("input identity card:");
                identityCard = Integer.parseInt(scanner.nextLine());
                for (Customer customer : customers) {
                    if (identityCard == customer.getIdentityCard()) {
                        throw new DuplicateException("Identity is duplicate. Please re-enter identity!");
                    }
                }
                break;
            } catch (NumberFormatException e) {
                System.err.println("Please enter the number!");
            } catch (DuplicateException e) {
                System.out.println(e.getMessage());
            }
        }

        String phoneNumber;
        while (true) {
            try {
                System.out.println("input phone number:");
                phoneNumber = scanner.nextLine();
                if (RegexException.getPhoneNumber(phoneNumber)) {
                    for (Customer customer : customers) {
                        if (phoneNumber.equals(customer.getPhoneNumber())) {
                            throw new DuplicateException("This phone number was be used. " +
                                    "Please re-enter other phone number!");
                        }
                    }
                } else {
                    throw new PhoneException("Please enter the correct format, " +
                            "phone number include 0 + 9 or 10 numbers after!");
                }

                break;
            } catch (PhoneException | DuplicateException e) {
                System.err.println(e.getMessage());
            }
        }

        System.out.println("input email:");
        String email = scanner.nextLine();

        String customerCode;
        while (true) {
            try {
                System.out.println("input customer code: ");
                customerCode = scanner.nextLine();
                for (Customer customer : customers) {
                    if (customerCode.equals(customer.getCustomerCode())) {
                        throw new DuplicateException("Customer code is duplicate. Please re-enter customer code!");
                    }
                }
                break;
            } catch (DuplicateException e) {
                System.out.println(e.getMessage());
            }
        }

        String typeOfCustomer = FurtherFunction.getTypeOfCustomer();

        System.out.println("input address:");
        String address = scanner.nextLine();
        customers.add(new Customer(name, dayOfBirth, gender, identityCard, phoneNumber, email, customerCode, typeOfCustomer, address));
        ReadWriteCustomer.writeCustomerFile(PATH, customers);
    }
}

