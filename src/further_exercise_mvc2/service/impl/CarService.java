package further_exercise_mvc2.service.impl;

import further_exercise_mvc2.model.Car;
import further_exercise_mvc2.model.Motorbike;
import further_exercise_mvc2.model.Truck;
import further_exercise_mvc2.service.ICarService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarService implements ICarService {
    private static List<Car> list = new ArrayList<>();

    static {
        list.add(new Car("43A-1234", "Vinfast", 1990, "Tien", 4, "tự chế"));
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
        System.out.println("NHập số chỗ ngồi:");
        int seatNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập loại xe:");
        String typeOfCar = scanner.nextLine();
        list.add(new Car(licensePlates,producer,year,name,seatNumber,typeOfCar));
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
        for (Car car : list) {
            System.out.println(car.toString());
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
        for (Car car : list) {
            if (car.getLicensePlates().contains(license)) {
                System.out.println(car);
                flag = true;
            }
        }
        return flag;
    }
}
