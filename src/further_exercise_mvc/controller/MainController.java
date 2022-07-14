package further_exercise_mvc.controller;

import java.util.Scanner;

public class MainController {
    public static void menuController(){
        StudentController studentController = new StudentController();
        TeacherController teacherController = new TeacherController();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN \n" +
                    "1. Quản lý học sinh. \n" +
                    "2. Quản lý giảng viên. \n" +
                    "3. thoát chương trình.");

            System.out.println("Mời bạn nhập lựa chọn.");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1:
                    studentController.menuStudent();
                    break;
                case 2:
                    teacherController.menuTeacher();
                    break;
                case 3:
                    System.exit(0);
            }
        }while (true);


    }
}
