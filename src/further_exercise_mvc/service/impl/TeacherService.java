package further_exercise_mvc.service.impl;

import further_exercise_mvc.model.Person;
import further_exercise_mvc.model.Teacher;
import further_exercise_mvc.service.IPersonService;
import further_exercise_mvc.utils.DuplicateIDException;
import further_exercise_mvc.utils.ReadTeacherFile;
import further_exercise_mvc.utils.WriteTeacherFile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements IPersonService<Person> {
    private static List<Teacher> teacherList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static final String PATH = "src/further_exercise_mvc/data/teacher.csv";

//    static {
//        teacherList.add(new Teacher(123, "Nguyễn Thị Thu", "24/5/1977", "Nữ", "Thạc sĩ"));
//        teacherList.add(new Teacher(456, "Nguyễn Thị Hạ", "26/6/1980", "Nữ", "Thạc sĩ"));
//        teacherList.add(new Teacher(789, "Nguyễn Thị Xuân", "12/9/1990", "Nữ", "Thạc sĩ"));
//    }

    public void writeFile(){
        WriteTeacherFile.writeTeacherFile(PATH, teacherList);
    }

    public void readFile(){
        List<Teacher> list = ReadTeacherFile.readTeacherFile(PATH);
        teacherList.clear();
        teacherList.addAll(list);
    }
    @Override
    public void add() {
        readFile();
        Teacher teacher = infoTeacher();
        teacherList.add(teacher);
        System.out.println("Thêm mới thành công!");
        writeFile();
    }

    @Override
    public void remove() {
        readFile();
        System.out.println("Mời bạn nhập id cần xóa ");
        int idRemove = Integer.parseInt(scanner.nextLine());
        boolean isFlag = false;
        for (Teacher teacher : teacherList) {
            if (teacher.getId() == idRemove) {
                System.out.println("bạn có chắc muốn xóa hay không? \n " +
                        "1. Có \n" +
                        "2. Không");
                int chooseYesNo = Integer.parseInt(scanner.nextLine());
                if (chooseYesNo == 1) {
                    teacherList.remove(teacher);
                    System.out.println("Xóa thành công!");
                }
                isFlag = true;
                break;
            }
        }
        if (!isFlag) {
            System.out.println("Không tìm thấy.");
        }

    }

    @Override
    public void displayAll() {
        readFile();
        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }
    }

    @Override
    public void findById(int id) {
        readFile();
        for (int i = 0; i < teacherList.size(); i++) {
            if (id == teacherList.get(i).getId()) {
                System.out.println(teacherList.get(i).toString());
            }
        }
    }

    @Override
    public void findByName(String name) {
        readFile();
        boolean flag = false;
        for (Teacher teacher : teacherList) {
            if (teacher.getName().contains(name)) {
                System.out.println(teacher);
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
        for (Teacher teacher : teacherList) {
            if (id == teacher.getId()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void sortByName() {
        readFile();
        boolean isSwap = true;
        for (int i = 0; i < teacherList.size() && isSwap; i++) {
            isSwap = false;

            for (int j = 0; j < teacherList.size() - 1 - i; j++) {
                if (teacherList.get(j).getName().compareTo(teacherList.get(j + 1).getName()) > 0) {
                    Collections.swap(teacherList, j, j + 1);
                    isSwap = true;
                }
            }
        }
//        for (int i = 0; i < teacherList.size(); i++) {
//            System.out.println(teacherList.get(i) + "\n");
//        }
        displayAll();
        writeFile();
    }

    public static Teacher infoTeacher() {
        int id;
        while (true) {
            try {
                System.out.println("Nhập id: ");
                id = Integer.parseInt(scanner.nextLine());

                for (Teacher teacher : teacherList) {
                    if (teacher.getId() == id) {
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

        System.out.println("Nhập tên : ");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh : ");
        String dateOfBirth = scanner.nextLine();
        System.out.println("Nhâp giới tính : ");
        String gender = scanner.nextLine();
        System.out.println("Nhập tình độ : ");
        String speciality = scanner.nextLine();
        return new Teacher(id, name, dateOfBirth, gender, speciality);
    }
}
