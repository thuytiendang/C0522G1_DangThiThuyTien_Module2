package further_exercise_mvc2.controller;

import further_exercise_mvc2.service.ICarService;
import further_exercise_mvc2.service.IMotorbikeService;
import further_exercise_mvc2.service.ITruckService;
import further_exercise_mvc2.service.impl.CarService;
import further_exercise_mvc2.service.impl.MotorbikeService;
import further_exercise_mvc2.service.impl.TruckService;

import java.util.Scanner;

public class VehicleController {
    Scanner scanner = new Scanner(System.in);
    private ICarService iCarService = new CarService();
    private IMotorbikeService iMotorbikeService = new MotorbikeService();
    private ITruckService iTruckService = new TruckService();

    public void displayMainMenu() {
        System.out.println("QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG. \n" +
                "1. Thêm mới phương tiện.\n" +
                "2. Hiện thị phương tiện\n" +
                "3. Xóa phương tiện\n" +
                "4. Tìm kiếm theo biển kiểm soát\n" +
                "5. Thoát\n");
        System.out.println("Nhập lựa chọn của bạn");
        int choice;

        do {
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addVehicle();
                    break;
                case 2:
                    showVehicle();
                    break;
                case 3:
                    deleteVehicle();
                    break;
                case 4:
                    findVehicle();
                case 5:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng nhập đúng theo menu");
            }
        } while (true);
    }

    private void findVehicle() {
        System.out.println("Nhập biển kiểm soát.");
        String license = scanner.nextLine();
        boolean result1 = iTruckService.find(license);
        boolean result2 = iCarService.find(license);
        boolean result3 = iMotorbikeService.find(license);
        if(!result1 && !result2 && !result3){
            System.err.println("Không có trong danh sách");;
        }
        displayMainMenu();

    }

    public void addVehicle() {
        System.out.println(" chọn phương tiện cần thêm mới.\n" +
                "1. Thêm xe tải,\n" +
                "2. Thêm ôtô, \n" +
                "3. Thêm xe máy.\n" +
                "4. Quay về menu chính.\n" +
                "5. Kết thúc chương trình.");
        int choice ;

        do {
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    iTruckService.add();
                    System.out.println("Thêm mới thành công!");
                    displayMainMenu();
                    break;
                case 2:
                    iCarService.add();
                    System.out.println("Thêm mới thành công!");
                    displayMainMenu();
                    break;
                case 3:
                    iMotorbikeService.add();
                    System.out.println("Thêm mới thành công!");
                    displayMainMenu();
                    break;
                case 4:
                    displayMainMenu();
                    break;
                case 5:
                    System.exit(1);
                default:
                    System.err.println("số bạn nhập k đúng.");
            }
        }while (true);
    }

    public void showVehicle() {
        System.out.println("1. Hiện thị xe tải.\n" +
                "2. Hiển thị oto.\n" +
                "3. Hiển thị xe máy.\n" +
                "4. Trở về menu chính\n" +
                "5. Thoát khỏi chương trình.");

        System.out.println("Nhập lựa chọn của bạn.");
        int choice ;

        do {
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iTruckService.getAll();
                    break;
                case 2:
                    iCarService.getAll();
                    break;
                case 3:
                    iMotorbikeService.getAll();
                    break;
                case 4:
                    displayMainMenu();
                    break;
                case 5:
                    System.exit(1);
                default:
                    System.err.println("Vui lòng nhập đúng lựa chọn");
            }
            showVehicle();
        } while (true);
    }

    public void deleteVehicle() {
        System.out.println("Nhập biển kiểm soát.");
        String license = scanner.nextLine();
        boolean result1 = iTruckService.findByLicensePlates(license);
        boolean result2 = iCarService.findByLicensePlates(license);
        boolean result3 = iMotorbikeService.findByLicensePlates(license);

        if (result1 || result2 || result3 ) {
            int yesNo = confirm();
            if (yesNo == 1) {
                if (result1){
                    iTruckService.delete(license);
                    System.out.println("Xóa thành công.");
                } else if (result2){
                    iCarService.delete(license);
                    System.out.println("Xóa thành công.");
                } else {
                    iMotorbikeService.delete(license);
                    System.out.println("Xóa thành công.");
                }
            }
        } else {
            System.err.println("không có biển số xe này!");
        }
    }

    public int confirm() {
        System.out.println("bạn có muốn xóa hay không?\n" +
                "1.có\n" +
                "2.không");
        int choice = Integer.parseInt(scanner.nextLine());
        do {
            switch (choice) {
                case 1:
                    return 1;
                case 2:
                    displayMainMenu();
                default:
                    System.err.println("số của bạn chưa chính xác.");
            }
        } while (true);
    }

}
