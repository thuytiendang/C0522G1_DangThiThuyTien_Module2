package zthi.service.impl;

import thuc_hanh_1_bank_account.exception.NotFoundBankAccountException;
import zthi.model.PhuongTien;
import zthi.model.XeTai;
import zthi.service.IXeTaiService;
import zthi.utils.DinhDangNgay;
import zthi.utils.TepDocViet;

import java.util.List;
import java.util.Scanner;

public class XeTaiService implements IXeTaiService {
    private Scanner scanner = new Scanner(System.in);
    private static final String PATH_XE_TAI = "src/zthi/data/xe_tai.csv";

    @Override
    public void dangKy() {
        List<PhuongTien> phuongTiens = TepDocViet.tepDocPhuongTien(PATH_XE_TAI);

        System.out.println("Nhập số đăng ký");
        String soDangKy = scanner.nextLine();

        System.out.println("Nhập tên chủ phương tiện");
        String tenChuPhuongTien = scanner.nextLine();

        System.out.println("Nhập mã phương tiện");
        String maPhuongTien = scanner.nextLine();

        System.out.println("Nhập ngày đăng ký");
        String ngayDangKy = DinhDangNgay.getDate();

        System.out.println("Nhập tên phương tiện");
        String tenPhuongTien = scanner.nextLine();

        System.out.println("Nhập hãn sản xuất: ");
        String hanSanXuat = scanner.nextLine();

        System.out.print("Nhập năm sản xuất. ");
        String namSanXuat = DinhDangNgay.getDate();

        System.out.println("Nhập công xuất: ");
        String congSuat = scanner.nextLine();

        double dungTichSiLanh;
        while (true){
            try {
                System.out.println("Nhập dung tích si lanh: ");
                dungTichSiLanh = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e){
                System.err.println("Vui lòng nhập số");
            }
        }

        int trongTai;
        while (true){
            try {
                System.out.println("Nhập trọng tải: ");
                trongTai = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e){
                System.err.println("Vui lòng nhập số");
            }
        }

        phuongTiens.add(new XeTai(soDangKy, tenChuPhuongTien, maPhuongTien, ngayDangKy, tenPhuongTien, hanSanXuat, namSanXuat,
                congSuat, dungTichSiLanh, trongTai));

        TepDocViet.tepVietPhuongTien(PATH_XE_TAI, phuongTiens);
        System.out.println("Đăng ký thành công");
    }

    @Override
    public void xemDanhSach() {
        List<PhuongTien> phuongTiens = TepDocViet.tepDocPhuongTien(PATH_XE_TAI);
        for (PhuongTien phuongTien : phuongTiens) {
            System.out.println(phuongTien);
        }
    }

    @Override
    public void huyDangKy() {
        List<PhuongTien> phuongTiens = TepDocViet.tepDocPhuongTien(PATH_XE_TAI);
        String soDangKy;
        boolean isExist = false;
        do {
            System.out.println("Nhập số đăng ký");
            soDangKy = scanner.nextLine();
            for (PhuongTien phuongTien : phuongTiens) {
                if (soDangKy.equals(phuongTien.getSoDangKy())) {
                    System.out.println("Phương tiện mà bạn muons xóa: ");
                    System.out.println(phuongTien);
                    System.out.println("bạn có chắc là muốn xóa? \n " +
                            "1. chọn 1 nếu muốn\n" +
                            "2. chọn ký tự khác nếu không");

                    System.out.println("Nhập lựa chọn: ");
                    String chooseYesNo = scanner.nextLine();

                    if (chooseYesNo.equals("1")) {
                        phuongTiens.remove(phuongTien);
                        TepDocViet.tepVietPhuongTien(PATH_XE_TAI, phuongTiens);
                        System.out.println("Hủy thành công ");
                    }
                    isExist = true;
                    break;
                }
            }
            try {
                if (!isExist) {
                    throw new NotFoundBankAccountException("Không tồn tại");
                }
            } catch (NotFoundBankAccountException e) {
                System.err.println(e.getMessage());
            }
        } while (!isExist);
    }
}

