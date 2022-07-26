package further_exercise_mvc.service.impl;

import further_exercise_mvc.model.Person;
import further_exercise_mvc.model.Student;
import further_exercise_mvc.service.IPersonService;
import further_exercise_mvc.exception.DuplicateIDException;
import further_exercise_mvc.utils.Function;
import further_exercise_mvc.utils.ReadStudentFile;
import further_exercise_mvc.utils.WriteStudentFile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IPersonService<Person> {
    private static List<Student> studentList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static final String PATH = "src/further_exercise_mvc/data/student.csv";

//    static {
//        studentList.add(new Student(145, "Đặng Thị Thủy Tiên", "20/03/2000", "Nữ", "12/2", 8.0));
//        studentList.add(new Student(367, "Nguyễn Hà Duyên", "23/07/2000", "Nữ", "12/2", 8.5));
//        studentList.add(new Student(167, "Nguyễn Hoàng Đa Phúc", "13/10/2000", "Nam", "12/2", 9.0));
//    }

    public void writeFile() {
        WriteStudentFile.writeStudentFile(PATH, studentList);
    }

    public void readFile() {
        List<Student> list = ReadStudentFile.readStudentFile(PATH);
        studentList.clear();
        studentList.addAll(list);
    }

    public void add() {
        readFile();
        Student student = infoStudent();
        studentList.add(student);
        System.out.println("Thêm mới thành công");
        writeFile();
    }

    @Override
    public void remove() {
        readFile();
        System.out.println("Mời bạn nhập id cần xóa");
        int idRemove = Integer.parseInt(scanner.nextLine());
        boolean isFlag = false;
        for (Student student : studentList) {
            if (student.getId() == idRemove) {
                System.out.println("Bạn có chắc muốn xóa hay không? \n" +
                        "1. có \n" +
                        "2. không");
                int chooseYesNo = Integer.parseInt(scanner.nextLine());
                if (chooseYesNo == 1) {
                    studentList.remove(student);
                    System.out.println("Xóa thành công!");
                }
                isFlag = true;
                break;
            }
        }
        if (!isFlag) {
            System.out.println("Không tìm thấy");
        }
    }

    @Override
    public void displayAll() {
        readFile();
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    @Override
    public void findById(int id) {
        readFile();
        for (int i = 0; i < studentList.size(); i++) {
            if (id == studentList.get(i).getId()) {
                System.out.println(studentList.get(i).toString());
            }
        }
    }

    @Override
    public void findByName(String name) {
        readFile();
        boolean flag = false;
        for (Student student : studentList) {
            if (student.getName().contains(name)) {
                System.out.println(student);
                flag = true;
            }
        }
        if (!flag) {
            System.err.println("không tìm thấy tên này!");
        }
    }

    @Override
    public boolean findId(int id) {
        readFile();
        for (Student student : studentList) {
            if (id == student.getId()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void sortByName() {
        readFile();
        boolean isSwap = true;
        for (int i = 0; i < studentList.size() && isSwap; i++) {
            isSwap = false;

            for (int j = 0; j < studentList.size() - 1 - i; j++) {
                if (studentList.get(j).getName().compareTo(studentList.get(j + 1).getName()) > 0) {
                    Collections.swap(studentList, j, j + 1);
                    isSwap = true;
                }
            }
        }
//        for (int i = 0; i < studentList.size(); i++) {
//            System.out.println(studentList.get(i) + "\n");
//        }
        displayAll();
        writeFile();
    }

    public static Student infoStudent() {
        int id;
        while (true) {
            try {
                System.out.println("Nhập id: ");
                id = Integer.parseInt(scanner.nextLine());

                for (Student student : studentList) {
                    if (student.getId() == id) {
                        throw new DuplicateIDException("Trùng id, vui lòng nhập lại id.");
                    }
                }
                break;
            } catch (NumberFormatException e){
                System.out.println("Vui lòng nhập số.");
            } catch (DuplicateIDException e) {
                System.out.println(e.getMessage());
            }
        }

        String name = Function.getName();

        String dateOfBirth = Function.getDateOfBirth();

        String gender = Function.getGender();

        double score;
        while (true) {
            try {
                System.out.print("Nhập điểm: ");
                score = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
            }
        }

        System.out.println("Nhập tên lớp: ");
        String className = scanner.nextLine();

        return new Student(id, name, dateOfBirth, gender, className, score);
    }
}
