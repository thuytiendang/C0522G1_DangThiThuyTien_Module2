package ss10_dsa_list.exercice.view;

import ss10_dsa_list.exercice.model.MyList;
import ss10_dsa_list.exercice.model.Student;

public class MyListTest {
    public static void main(String[] args) {
        Student student1 = new Student(1,"Huỳnh Trung Thuyên");
        Student student2 = new Student(2,"Bùi Hùng");
        Student student3 = new Student(3,"Nguyễn Văn Tý");
        Student student4 = new Student(4,"Đăng Thị Thủy Tiên");
        Student student5 = new Student(5,"Trần Nguyên");

        MyList<Student> studentMyList = new MyList<>();
        studentMyList.add(student1);
        studentMyList.add(student2);
        studentMyList.add(student3);
        studentMyList.add(student4);
        studentMyList.add(student5);

        for (int i = 0; i < studentMyList.size(); i++) {
            System.out.println((i+1)+"."+studentMyList.elements[i]);
        }
        System.out.println(studentMyList.get(1));

    }
}
