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
                    "4. Tìm giáo viên theo id\n" +
                    "5. Tìm giáo viên theo tên\n" +
                    "6. Sắp xếp tên\n" +
                    "7. Quay về menu chính.");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
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
                    findById();
                    break;
                case 5:
                    findByName();
                    break;
                case 6:
                case 7:
                return;
            }
        } while (true);
    }

    public void findById() {
        System.out.println("Nhập id:");
        int id = Integer.parseInt(scanner.nextLine());
        if (iPersonService.findId(id)) {
            iPersonService.findById(id);
        } else {
            System.err.println("KHông tìm thấy id này!");
        }
    }

    public void findByName() {
        System.out.println("Nhập tên:");
        String name = scanner.nextLine();
        iPersonService.findByName(name);


    }
}

