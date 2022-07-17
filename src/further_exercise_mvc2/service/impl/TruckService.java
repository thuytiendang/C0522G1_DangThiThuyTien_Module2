package further_exercise_mvc2.service.impl;

import further_exercise_mvc2.model.Truck;
import further_exercise_mvc2.service.ITruckService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TruckService implements ITruckService {
    private static List<Truck> list = new ArrayList<>();


    static {
        list.add(new Truck("43c-2324", "toyota", 1990, "Tý", 5.0f));
        list.add(new Truck("43c-1234", "toyota", 1990, "Thuyên", 5.0f));
        list.add(new Truck("43c-1111", "toyota", 1990, "Hải", 5.0f));
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
        System.out.println("NHập trọng tải:");
        float tonnage = Float.parseFloat(scanner.nextLine());
        list.add(new Truck(licensePlates,producer,year,name,tonnage));
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
        for (Truck truck : list) {
            System.out.println(truck.toString());
        }
    }

    @Override
    public boolean findByLicensePlates(String license) {
        for (Truck truck : list) {
            if (license.equals(truck.getLicensePlates())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean find(String license) {
        boolean flag = false;
        for (Truck truck : list) {
            if (truck.getLicensePlates().contains(license)) {
                System.out.println(truck);
                flag = true;
            }
        }
        return flag;
    }


}
