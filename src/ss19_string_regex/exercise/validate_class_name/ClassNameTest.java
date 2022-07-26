package ss19_string_regex.exercise.validate_class_name;

import java.util.Scanner;

public class ClassNameTest {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ValidateClassName validate = new ValidateClassName();
        do {
            System.out.println("Nhập tên lớp");
            String str = scanner.nextLine();

            boolean isValid = validate.validate(str);
            if (isValid) {
                System.out.println("Tên lớp hợp lệ");
                break;
            }else {
                System.err.println("tên lớp không hợp lệ. vui lòng nhập lại");
            }
        } while (true);
    }
}
