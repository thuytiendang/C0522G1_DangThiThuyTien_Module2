package further_exercise_mvc2.service.impl;

import further_exercise_mvc2.model.Motorbike;
import further_exercise_mvc2.model.Truck;
import further_exercise_mvc2.service.IMotorbikeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MotorbikeService implements IMotorbikeService {
    private static List<Motorbike> list = new ArrayList<>();

    static {
        list.add(new Motorbike("92N1-12435", "Yamaha", 2000, "Tiến", "120"));
    }

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập biển kiểm soát:");
        String licensePlates = scanner.nextLine();
        System.out.println("Nhập nhà sản xuất:");
        String producer = scanner.nextLine();
        System.out.println("Nhập năm sản xuất:");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên chủ sở hữu:");
        String name = scanner.nextLine();
        System.out.println("Nhập công suất:");
        String productivity  = scanner.nextLine();
        list.add(new Motorbike(licensePlates,producer,year,name,productivity));
    }

    @Override
    public void delete(String license) {
        for (int i = 0; i < list.size(); i++) {
            if (license.equals(list.get(i).getLicensePlates())) {
                list.remove(list.get(i));
            }
        }
    }

    @Override
    public void getAll() {
        for (Motorbike motorbike : list) {
            System.out.println(motorbike.toString());
        }
    }

    @Override
    public boolean findByLicensePlates(String license) {
        for (int i = 0; i < list.size(); i++) {
            if (license.equals(list.get(i).getLicensePlates())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean find(String license) {
        boolean flag = false;
        for (Motorbike Motorbike : list) {
            if (Motorbike.getLicensePlates().contains(license)) {
                System.out.println(Motorbike);
                flag = true;
            }
        }
        return flag;
    }


}
