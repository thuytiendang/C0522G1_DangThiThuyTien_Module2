package further_exercise_mvc.service.impl;

import further_exercise_mvc.model.Teacher;
import further_exercise_mvc.service.IPersonService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements IPersonService {
    private static List<Teacher> teacherList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        Teacher teacher = infoTeacher();
        teacherList.add(teacher);
        System.out.println("Thêm mới thành công!");
    }

    @Override
    public void remove() {
        System.out.println("Mời bạn nhập id cần xóa ");
        int idRemove = Integer.parseInt(scanner.nextLine());
        boolean isFlag = false;
        for (Teacher teacher : teacherList){
            if (teacher.getId() == idRemove){
                System.out.println("bạn có chắc muốn xóa hay không? \n " +
                        "1. Có \n" +
                        "2. Không");
                int chooseYesNo = Integer.parseInt(scanner.nextLine());
                if (chooseYesNo == 1){
                    teacherList.remove(teacher);
                    System.out.println("Xóa thành công!");
                }
                isFlag = true;
                break;
            }
        }
        if (!isFlag){
            System.out.println("Không tìm thấy.");
        }

    }

    @Override
    public void displayAll() {
        for (Teacher teacher : teacherList){
            System.out.println(teacher);
        }
    }

    public static Teacher infoTeacher(){
        System.out.println("Nhập id : ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên : ");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh : ");
        String dateOfBirth = scanner.nextLine();
        System.out.println("Nhâp giới tính : ");
        String gender = scanner.nextLine();
        System.out.println("Nhập tình độ : ");
        String speciality = scanner.nextLine();
        Teacher teacher = new Teacher(id, name, dateOfBirth, gender,speciality );
        return teacher;
    }
}
