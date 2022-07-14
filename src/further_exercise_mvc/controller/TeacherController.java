package further_exercise_mvc.controller;

import further_exercise_mvc.service.IPersonService;
import further_exercise_mvc.service.impl.TeacherService;

import java.util.Scanner;

public class TeacherController {
    private Scanner scanner = new Scanner(System.in);
    private IPersonService iPersonService = new TeacherService();

    public void menuTeacher() {
        do {
            System.out.println("1. Thêm mới giảng viên. \n" +
                    "2. Xóa giảng viên. \n" +
                    "3. Xem danh sách giảng viên. \n" +
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

