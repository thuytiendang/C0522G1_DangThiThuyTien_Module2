package ss5_static_access_modifier.practice;

public class Student {
    private int roll;
    private String name;
    private static String college = "BBDIT";

    Student(int r, String n) {
        roll = r;
        name = n;
    }

    static void change() {
        college = "CODEGYM";
    }

    void display() {
        System.out.println(roll + " " + name + " " + college);
    }
}

