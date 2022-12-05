package zthi.utils;

import thuc_hanh_1_bank_account.exception.AgeInvalidException;

import java.util.Scanner;

public class DinhDangNgay {
    private static final Scanner SCANNER = new Scanner(System.in);

    private static boolean isLeapYear(int year) {
        boolean isDivisible4 = year % 4 == 0;
        boolean isDivisible100 = year % 100 == 0;
        boolean isDivisible400 = year % 400 == 0;

        return (isDivisible4 && !isDivisible100) || isDivisible400;
    }

    public static String getDate() {
        while (true) {
            String date;
            try {
                System.out.println("Nhập ngày: ");
                date = SCANNER.nextLine();

                if (!date.matches("^((0[1-9])|([12]\\d)|(3[0-1]))/((0[1-9])|(1[0-2]))/((19\\d{2})|(20([012][012])))$")) {
                    throw new AgeInvalidException("Please enter the correct dd/mm/yyyy format!");
                }
                String[] str = date.split("/");
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
                return date;
            } catch (AgeInvalidException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
