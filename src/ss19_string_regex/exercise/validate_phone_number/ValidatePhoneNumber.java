package ss19_string_regex.exercise.validate_phone_number;

import java.util.Scanner;

public class ValidatePhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập số điện thoại: ");
            String str = scanner.nextLine();
            if (str.matches("\\([0-9]{2}\\)-\\(0[0-9]{9}\\)")){
                System.out.println("số điện thoại đúng.");
                break;
            } else {
                System.err.println("số điện thoại sai. vui lòng nhập lại.");
            }
        }while (true);
    }
}
