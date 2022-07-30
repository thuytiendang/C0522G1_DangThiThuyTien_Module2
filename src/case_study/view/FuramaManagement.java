package case_study.view;

import case_study.controller.FuramaController;

import java.time.LocalDate;
import java.time.Period;

public class FuramaManagement {
    public static void main(String[] args) {
//        FuramaController furamaController = new FuramaController();
//        furamaController.displayMainMenu();

        LocalDate birthday = LocalDate.of(1999,3,20);
        LocalDate now = LocalDate.now();
        int year =  Period.between(birthday,now).getYears();
        System.out.println(year);
    }
}
