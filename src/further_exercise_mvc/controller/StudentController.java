package further_exercise_mvc.controller;

import further_exercise_mvc.service.impl.IPersonService;
import further_exercise_mvc.service.impl.StudentService;

import java.util.Scanner;

public class StudentController {
    private Scanner scanner = new Scanner(System.in);
    private IPersonService iPersonService = new StudentService();

    public void menuStudent() {
        do {
            System.out.println("1. Thêm mới học sinh. \n" +
                    "2. Xóa học sinh. \n" +
                    "3. Xem danh sách học sinh. \n" +
                    "4. Quay về menu chính.");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1:
                    iPersonService.add();
                    break;
                case 2:
                    iPersonService.remove();
                    break;
                case 3:
                    iPersonService.displayAll();
                    break;
                case 4:
                    return;
            }
        }while (true);
    }
}
