package ss12_map_treemap.exercise.arraylist_linkedlist_in_collection_framework.controller;

import ss12_map_treemap.exercise.arraylist_linkedlist_in_collection_framework.service.IProductService;
import ss12_map_treemap.exercise.arraylist_linkedlist_in_collection_framework.service.impl.ProductService;

import java.util.Scanner;

public class ProductMenuController {
    private static Scanner scanner = new Scanner(System.in);
    private IProductService iProductService = new ProductService();


    public void displayMainMenu() {

        int choice;
        do {
            System.out.println("HỆ THỐNG QUẢN LÝ SẢN PHẨM. \n" +
                    "1. Thêm sản phẩm. \n" +
                    "2. Sửa thông tin sản phẩm theo id.\n" +
                    "3. Xoá sản phẩm theo id.\n" +
                    "4. Hiển thị danh sách sản phẩm.\n" +
                    "5. Tìm kiếm sản phẩm theo tên.\n" +
                    "6. Sắp xếp sản phẩm tăng dần, giảm dần theo giá.\n" +
                    "7. Thoát khỏi chương trình.");

            System.out.println("Mời bạn nhập lựa chọn.");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    addProduct();
                    System.out.println("Thêm mới thành công.");
                    break;
                case 2:
                    setProductInformation();
                    break;
                case 3:
                    deleteByIdentify();
                    break;
                case 4:
                    showInfo();
                    break;
                case 5:
                    findProductByName();
                    break;
                case 6:
                    arrange();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.err.println("Số bạn nhập chưa chính xác!");
            }

        } while (true);
    }

    public void addProduct() {
        iProductService.add();
    }

    public void setProductInformation() {
        System.out.println("Nhập id sản phẩm cần chỉnh sửa.");
        int id = Integer.parseInt(scanner.nextLine());
        if (iProductService.findId(id)) {
            iProductService.setById(id);
            System.out.println("Thay đổi thành công!");
        } else {
            System.err.println("Không tìm thấy sản phẩm này!");
        }
    }

    public void deleteByIdentify() {
        System.out.println("Nhập id của sản phẩm:");
        int id = Integer.parseInt(scanner.nextLine());
        if (iProductService.findId(id)) {
            int yesNo = confirm();
            if (yesNo == 1) {
                iProductService.deleteById(id);
                System.out.println("Xóa thành công");
            }
        } else {
            System.err.println("Không tìm thấy sản phẩm này!");
        }
    }

    public int confirm() {
        int choice;
        do {
            System.out.println("bạn có muốn xóa hay không?\n" +
                    "1. Có\n" +
                    "2. Không\n");

            System.out.println("Mời nhập lựa chọn của bạn.");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    return 1;
                case 2:
                    displayMainMenu();
                default:
                    System.err.println("Số bạn nhập chưa chính xác!");
            }
        } while (true);
    }

    public void showInfo() {
        iProductService.show();
    }

    public void findProductByName() {
        System.out.println("NHập tên sản phẩm");
        String nameOfProduct = scanner.nextLine();
        if (iProductService.findName(nameOfProduct)) {
            iProductService.findByName(nameOfProduct);
        } else {
            System.err.println("không có sản phẩm bạn cần tìm!");
        }
    }

    public void arrange(){

        int choice;
        do {
            System.out.println("Lựa chọn cách sắp xếp:\n" +
                    "1. Sắp xếp tăng dần theo giá tiền.\n" +
                    "2. Sắp xếp giảm dần theo giá tiền.\n" +
                    "3. Qua lại Menu chính.");

            System.out.println("NHập lựa chọn của bạn.");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                   iProductService.increasingArrange();
                   break;
                case 2:
                    iProductService.decreasingArrange();
                    break;
                case 3:
                   return;
                default:
                    System.err.println("Số của bạn nhập không đúng!");
            }
        } while (true);
    }
}
