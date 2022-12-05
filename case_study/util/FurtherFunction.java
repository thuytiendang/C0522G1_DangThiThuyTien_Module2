package case_study.util;

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

    public static String getGender() {
        System.out.println("Input gender:\n" +
                "1. Male\n" +
                "2. Female\n" +
                "3. Third gender.");

        do {
            int choice;
            while (true) {
                try {
                    System.out.print("Input your choice:");
                    choice = Integer.parseInt(SCANNER.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.err.println("Please input number.");
                }
            }
            switch (choice) {
                case 1:
                    return "Male";
                case 2:
                    return "Female";
                case 3:
                    return "Third gender";
                default:
                    System.err.println("Your choice is not exit. Please re-enter your choice!");
            }
        } while (true);
    }

    public static String getQualification(){
        System.out.println("Input qualification:\n" +
                "1. Intermediate\n" +
                "2. College\n" +
                "3. University\n" +
                "4. Postgraduate");
        do {
            int choice;
            while (true) {
                try {
                    System.out.print("Input your choice:");
                    choice = Integer.parseInt(SCANNER.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.err.println("Please input number.");
                }
            }
            switch (choice) {
                case 1:
                    return "Intermediate";
                case 2:
                    return "College";
                case 3:
                    return "University";
                case 4:
                    return "Postgraduate";
                default:
                    System.err.println("Your choice is not exit. Please re-enter your choice!");
            }
        } while (true);
    }

    public static String getPosition(){
        System.out.println("Input position:\n" +
                "1. Receptionist\n" +
                "2. Waiter\n" +
                "3. Specialist\n" +
                "4. Supervisor\n" +
                "5. Manager\n" +
                "6. Director");
        do {
            int choice;
            while (true) {
                try {
                    System.out.print("Input your choice:");
                    choice = Integer.parseInt(SCANNER.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.err.println("Please input number.");
                }
            }
            switch (choice) {
                case 1:
                    return "Receptionist";
                case 2:
                    return "Waiter";
                case 3:
                    return "Specialist";
                case 4:
                    return "Supervisor";
                case 5:
                    return "Manager";
                case 6:
                    return "Director";
                default:
                    System.err.println("Your choice is not exit. Please re-enter your choice!");
            }
        } while (true);
    }

    public static String getTypeOfCustomer(){
        System.out.println("input typeOfCustomer:\n" +
                "1. Diamond\n" +
                "2. Platinum\n" +
                "3. Gold\n" +
                "4. Silver\n" +
                "5. Member");
        do {
            int choice;
            while (true) {
                try {
                    System.out.print("Input your choice:");
                    choice = Integer.parseInt(SCANNER.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.err.println("Please input number.");
                }
            }
            switch (choice) {
                case 1:
                    return "Diamond";
                case 2:
                    return "Platinum";
                case 3:
                    return "Gold";
                case 4:
                    return "Silver";
                case 5:
                    return "Member";
                default:
                    System.err.println("Your choice is not exit. Please re-enter your choice!");
            }
        } while (true);
    }

}
