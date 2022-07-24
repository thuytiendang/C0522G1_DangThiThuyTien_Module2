package case_study.service.impl;

import case_study.model.person.Employee;
import case_study.service.IEmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private static List<Employee> employees = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void edit() {
        System.out.println("Input name of employee you want to edit?");
        String name = scanner.nextLine();
        boolean isExisted = false;
        for (Employee employee : employees){
            if (name.equals(employee.getName())){
                isExisted = true;
                employee.setDateOfBirth(scanner.nextLine());
                employee.setGender(scanner.nextLine());
                while (true){
                    try {
                        employee.setIdentityCard(Integer.parseInt(scanner.nextLine()));
                        employee.setPhoneNumber(Integer.parseInt(scanner.nextLine()));
                        break;
                    }catch (NumberFormatException e){
                        System.out.println("Please enter the number!");
                    }
                }
                employee.setEmail(scanner.nextLine());
                employee.setEmployeeCode(scanner.nextLine());
                employee.setQualification(scanner.nextLine());
                employee.setPosition(scanner.nextLine());
                while (true){
                    try {
                        employee.setSalary(Float.parseFloat(scanner.nextLine()));
                        break;
                    } catch (NumberFormatException e){
                        System.out.println("Please enter the number!");
                    }
                }
                System.out.println("Edit successful!");
                break;
            }
        }
        if(!isExisted){
            System.err.printf("%s is not exit!\n",name);
        }
    }

    @Override
    public void display() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    @Override
    public Employee add() {
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
        System.out.println("input employee code: ");
        String employeeCode = scanner.nextLine();
        System.out.println("input qualification: ");
        String qualification = scanner.nextLine();
        System.out.println("input position:");
        String position = scanner.nextLine();
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
        return new Employee(name,dayOfBirth,gender,identityCard,phoneNumber,email,employeeCode,qualification,position,salary);
    }
}
