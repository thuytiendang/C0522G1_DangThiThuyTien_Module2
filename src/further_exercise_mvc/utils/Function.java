package further_exercise_mvc.utils;

import further_exercise_mvc.exception.DateException;

import javax.xml.soap.SOAPElementFactory;
import java.util.Arrays;
import java.util.Scanner;

public class Function {
    private static Scanner scanner = new Scanner(System.in);

    public static String getGender() {
        System.out.println("Nhập giới tính:\n" +
                "1. Nam\n" +
                "2. Nữ\n" +
                "3. Giới tính thứ ba");

        do {
            int choice;
            while (true) {
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.err.println("vui lòng nhập số");
                }
            }
            switch (choice) {
                case 1:
                    return "Nam";
                case 2:
                    return "Nữ";
                case 3:
                    return "giới tính thứ 3.";
                default:
                    System.err.println("lựa chọn của bạn không đúng, vui lòng nhập lại lựa chọn!");
            }
        } while (true);
    }

    public static String getName() {
        System.out.println("Nhập tên:");
        String name = scanner.nextLine();
        String[] array = name.toLowerCase().trim().split("");
        StringBuilder stringBuilder = new StringBuilder().append(array[0].toUpperCase());
        for (int i = 1; i < array.length; i++) {
            if (!array[i].equals(" ") && array[i - 1].equals(" ")) {
                stringBuilder.append(array[i].toUpperCase());
            } else if (!array[i - 1].equals(" ")) {
                stringBuilder.append(array[i]);
            }
        }
        return String.valueOf(stringBuilder);
    }

    private static boolean isLeapYear(int year) {
        boolean isDivisible4 = year % 4 == 0;
        boolean isDivisible100 = year % 100 == 0;
        boolean isDivisible400 = year % 400 == 0;

        return (isDivisible4 && isDivisible100) || isDivisible400;
    }

    public static String getDateOfBirth() {
        String dateOfBirth;
        while (true) {
            try {
                System.out.println("Nhập ngáy sinh: ");
                dateOfBirth = scanner.nextLine();
                if (!dateOfBirth.matches("(0[1-9]|[12]\\d|3[0-1])/(0[1-9]|1[0-2])/(19\\d{2}|20(0\\d|1\\d))")) {
                    throw new DateException("Vui lòng nhập đúng định dạng dd/mm/yyyy!");
                }

                String[] strings = dateOfBirth.split("/");
                if (strings[1].equals("04") || strings[1].equals("06") || strings[1].equals("09") || strings[1].equals("11")) {
                    if (Integer.parseInt(strings[0]) > 30) {
                        throw new DateException("Vui lòng nhập đúng số ngày trong tháng (tháng này có tối đa 30 ngày)!");
                    }
                } else if (strings[1].equals("02")) {
                    if (isLeapYear(Integer.parseInt(strings[2]))) {
                        if (Integer.parseInt(strings[0]) > 29) {
                            throw new DateException("Vui lòng nhập đúng số ngày trong tháng (tháng 2 có tối đa 29 ngày vì là năm nhuận)!");
                        }
                    } else {
                        if (Integer.parseInt(strings[0]) > 28) {
                            throw new DateException("Vui lòng nhập đúng số ngày trong tháng (tháng 2 có tối đa 28 ngày)!");
                        }
                    }
                }

                return dateOfBirth;
            } catch (DateException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
