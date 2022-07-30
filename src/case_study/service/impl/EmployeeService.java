package case_study.service.impl;

import case_study.exception.DuplicateException;
import case_study.exception.PhoneException;
import case_study.model.person.Employee;
import case_study.service.IEmployeeService;
import case_study.util.FurtherFunction;
import case_study.util.ReadWriteEmployee;
import case_study.util.RegexException;

import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private static Scanner scanner = new Scanner(System.in);
    private static final String PATH = "src/case_study/data/employee.csv";

    @Override
    public void edit() {
        List<Employee> employees = ReadWriteEmployee.readEmployeeFile(PATH);
        System.out.println("Input employee code you want to edit?");
        String employeeCode = scanner.nextLine();
        boolean isExisted = false;
        for (Employee employee : employees) {
            if (employeeCode.equals(employee.getEmployeeCode())) {
                isExisted = true;
                System.out.println("Please input your change:");

                System.out.print("Change name. ");
                employee.setName(FurtherFunction.getName());

                System.out.print("Change day of birth. ");
                employee.setDateOfBirth(RegexException.getDateOfBirth());

                System.out.print("Change gender:");
                employee.setGender(FurtherFunction.getGender());

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
                                    System.out.println("change identity card:");
                                    id = Integer.parseInt(scanner.nextLine());
                                    for (Employee employee1 : employees) {
                                        if (id == employee1.getIdentityCard()) {
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
                            employee.setIdentityCard(id);
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
                                        for (Employee employee1 : employees) {
                                            if (phoneNumber.equals(employee1.getPhoneNumber())) {
                                                throw new DuplicateException("Phone number was duplicated!" +
                                                        " please input other number:");
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
                            employee.setPhoneNumber(phoneNumber);
                            break doWhileLoop;
                        case 2:
                            break doWhileLoop;
                        default:
                            System.err.println("Your choice is not exist! Please re-enter your choice:");
                    }
                } while (true);

                System.out.println("change email:");
                employee.setEmail(scanner.nextLine());

                System.out.println("change qualification:");
                employee.setQualification(FurtherFunction.getQualification());

                System.out.println("change position: ");
                employee.setPosition(FurtherFunction.getPosition());

                while (true) {
                    try {
                        employee.setSalary(Float.parseFloat(scanner.nextLine()));
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter the number!");
                    }
                }

                ReadWriteEmployee.writeEmployeeFile(PATH, employees);

                System.out.println("Edit successful!");
                break;
            }
        }
        if (!isExisted) {
            System.err.printf("%s is not exist!\n", employeeCode);
            edit();
        }

    }

    @Override
    public void display() {
        List<Employee> employees = ReadWriteEmployee.readEmployeeFile(PATH);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    @Override
    public void add() {
        List<Employee> employees = ReadWriteEmployee.readEmployeeFile(PATH);

        String name = FurtherFunction.getName();

        String dayOfBirth = RegexException.getDateOfBirth();

        String gender = FurtherFunction.getGender();

        int identityCard;
        while (true) {
            try {
                System.out.println("input identity card:");
                identityCard = Integer.parseInt(scanner.nextLine());
                for (Employee employee : employees) {
                    if (identityCard == employee.getIdentityCard()) {
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
                    for (Employee employee : employees) {
                        if (phoneNumber.equals(employee.getPhoneNumber())) {
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

        String employeeCode;
        while (true) {
            try {
                System.out.println("input employee code: ");
                employeeCode = scanner.nextLine();
                for (Employee employee : employees) {
                    if (employeeCode.equals(employee.getEmployeeCode())) {
                        throw new DuplicateException("Employee code is duplicate. Please re-enter employee code!");
                    }
                }
                break;
            } catch (DuplicateException e) {
                System.out.println(e.getMessage());
            }
        }

        String qualification = FurtherFunction.getQualification();

        String position = FurtherFunction.getPosition();

        float salary;
        while (true) {
            try {
                System.out.println("input salary: ");
                salary = Float.parseFloat(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Please enter the number!");
            }
        }
        employees.add(new Employee(name, dayOfBirth, gender, identityCard, phoneNumber, email, employeeCode, qualification, position, salary));
        ReadWriteEmployee.writeEmployeeFile(PATH, employees);
    }
}
