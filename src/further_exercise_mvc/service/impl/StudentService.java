package further_exercise_mvc.service.impl;

import further_exercise_mvc.model.Student;
import further_exercise_mvc.service.IPersonService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IPersonService {
    private static List<Student> studentList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public void add(){
        Student student = infoStudent();
        studentList.add(student);
        System.out.println("Thêm mới thành công");
    }

    @Override
    public void remove() {
        System.out.println("Mời bạn nhập id cần xóa");
        int idRemove = Integer.parseInt(scanner.nextLine());
         boolean isFlag = false;
         for (Student student: studentList){
             if (student.getId()==idRemove){
                 System.out.println("Bạn có chắc muốn xóa hay không? \n" +
                         "1. có \n" +
                         "2. không");
                 int chooseYesNo = Integer.parseInt(scanner.nextLine());
                 if (chooseYesNo == 1){
                     studentList.remove(student);
                     System.out.println("Xóa thành công!");
                 }
                 isFlag = true;
                 break;
             }
         }
         if (!isFlag){
             System.out.println("Không tìm thấy");
         }
    }

    @Override
    public void displayAll() {
        for (Student student: studentList){
            System.out.println(student);
        }
    }

    public static Student infoStudent(){
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh: ");
        String dateOfBirth = scanner.nextLine();
        System.out.println("Nhập giới tính: ");
        String gender = scanner.nextLine();
        System.out.println("Nhập điểm: ");
        double score = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập tên lớp: ");
        String className = scanner.nextLine();
        Student student = new Student(id, name, dateOfBirth, gender, className, score);
        return student;
    }
}
