package case_study.util;

import case_study.exception.AgeInvalidException;
import case_study.exception.PhoneException;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexException {
    private static final Scanner SCANNER = new Scanner(System.in);

    private static boolean isLeapYear(int year) {
        boolean isDivisible4 = year % 4 == 0;
        boolean isDivisible100 = year % 100 == 0;
        boolean isDivisible400 = year % 400 == 0;

        return (isDivisible4 && !isDivisible100) || isDivisible400;
    }

    public static String getDateOfBirth() {
        String dateOfBirth;
        while (true) {
            try {
                System.out.print("Input date of birth:");
                dateOfBirth = SCANNER.nextLine();
                if (!dateOfBirth.matches("^((0[1-9])|([12]\\d)|(3[0-1]))/((0[1-9])|(1[0-2]))/((19\\d{2})|(20(([01]\\d)|(2[012]))))$")) {
                    throw new AgeInvalidException("Please enter the correct dd/mm/yyyy format!");
                }
                String[] str = dateOfBirth.split("/");
                if (str[1].equals("04") || str[1].equals("06") || str[1].equals("09") || str[1].equals("11")) {
                    if (Integer.parseInt(str[0]) > 30) {
                        throw new AgeInvalidException("Please enter the correct number of days in the month (this month has a maximum of 30 days)!");
                    }
                } else if (str[1].equals("02")) {
                    if (isLeapYear(Integer.parseInt(str[2]))) {
                        if (Integer.parseInt(str[0]) > 29) {
                            throw new AgeInvalidException("Please enter the correct number of days in the month (February has a maximum of 29 days because it is a leap year)!");
                        }
                    } else {
                        if (Integer.parseInt(str[0]) > 28) {
                            throw new AgeInvalidException("Please enter the correct number of days in the month (February has a maximum of 28 days)!");
                        }
                    }
                }
                return dateOfBirth;
            } catch (AgeInvalidException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static boolean getPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("^0\\d{9,10}$");
    }
}

