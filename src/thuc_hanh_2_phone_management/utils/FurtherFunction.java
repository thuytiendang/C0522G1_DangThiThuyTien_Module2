package thuc_hanh_2_phone_management.utils;

import java.util.Scanner;

public class FurtherFunction {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static String getName() {
        System.out.println("Input name:");
        String name = SCANNER.nextLine();
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
}
