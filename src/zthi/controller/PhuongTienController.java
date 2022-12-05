package zthi.controller;

import zthi.service.IOtoService;
import zthi.service.IXeTaiService;
import zthi.service.impl.OtoService;
import zthi.service.impl.XeTaiService;

import java.util.Scanner;

public class PhuongTienController {
    Scanner scanner = new Scanner(System.in);
    IXeTaiService iXeTaiService = new XeTaiService();
    IOtoService iOtoService = new OtoService();

    public void banChonChinh() {
        do {
            int choice;
            while (true) {
                System.out.println("HỆ THỐNG QUẢN LÝ PHƯƠNG TIỆN\n" +
                        "1.\tĐăng ký phương tiện\n" +
                        "2.\tXem danh sách đăng ký phương tiện\n" +
                        "3.\tHủy đăng ký phương tiện\n" +
                        "4.\tThoát\n");
                try {
                    System.out.println("NHập lựa chọn");
                    choice = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }

            switch (choice) {
                case 1:
                    dangKy();
                    break;
                case 2:
                    xem();
                    break;
                case 3:
                    huyDangKy();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.err.println("The number you entered is incorrect. Please re-enter the number");
            }
        } while (true);
    }

    public void dangKy() {
        do {
            int choice;
            while (true) {
                System.out.println("Chọn loại phương tiện muốn thêm\n" +
                        "1. Ô tô\n" +
                        "2. Xe tải\n" +
                        "3. quay về menu chính");
                try {
                    System.out.println("nhập lựa chọn");
                    choice = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
            switch (choice) {
                case 1:
                    iOtoService.dangKy();
                    break;
                case 2:
                    iXeTaiService.dangKy();
                    break;
                case 3:
                    return;
                default:
                    System.err.println("The number you entered is incorrect. Please re-enter the number");
            }
        } while (true);
    }

    public void xem() {
        do {
            int choice;
            while (true) {
                System.out.println("Chọn loại phương tiện muốn xem\n" +
                        "1. Ô tô\n" +
                        "2. Xe tải\n" +
                        "3. quay về menu chính");
                try {
                    System.out.println("nhâp lựa chọn");
                    choice = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
            switch (choice) {
                case 1:
                    iOtoService.xemDanhSach();
                    break;
                case 2:
                    iXeTaiService.xemDanhSach();
                    break;
                case 3:
                    return;
                default:
                    System.err.println("The number you entered is incorrect. Please re-enter the number");
            }
        } while (true);
    }

    public void huyDangKy() {
        do {
            int choice;
            while (true) {
                System.out.println("Chọn loại phương tiện muốn hủy\n" +
                        "1. Ô tô\n" +
                        "2. Xe tải\n" +
                        "3. quay về menu chính");
                try {
                    System.out.println("nhập lựa chọn");
                    choice = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
            switch (choice) {
                case 1:
                    iOtoService.huyDangKy();
                    break;
                case 2:
                    iXeTaiService.huyDangKy();
                    break;
                case 3:
                    return;
                default:
                    System.err.println("The number you entered is incorrect. Please re-enter the number");
            }
        } while (true);
    }
}

