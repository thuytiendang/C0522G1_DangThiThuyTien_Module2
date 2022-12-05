package zthi.model;

public abstract class PhuongTien {
    private String soDangKy;
    private String tenChuPhuongTien;
    private String maPhuongTien;
    private String ngayDangKy;
    private String tenPhuongTien;
    private String hanSanXuat;
    private String namSanXuat;
    private String congSuat;
    private double dungTichSiLanh;

    public PhuongTien() {
    }

    public PhuongTien(String soDangKy, String tenChuPhuongTien, String maPhuongTien, String ngayDangKy,
                      String tenPhuongTien, String hanSanXuat, String namSanXuat,
                      String congSuat, double dungTichSiLanh) {
        this.soDangKy = soDangKy;
        this.tenChuPhuongTien = tenChuPhuongTien;
        this.maPhuongTien = maPhuongTien;
        this.ngayDangKy = ngayDangKy;
        this.tenPhuongTien = tenPhuongTien;
        this.hanSanXuat = hanSanXuat;
        this.namSanXuat = namSanXuat;
        this.congSuat = congSuat;
        this.dungTichSiLanh = dungTichSiLanh;
    }

    public String getSoDangKy() {
        return soDangKy;
    }

    public void setSoDangKy(String soDangKy) {
        this.soDangKy = soDangKy;
    }

    public String getTenChuPhuongTien() {
        return tenChuPhuongTien;
    }

    public void setTenChuPhuongTien(String tenChuPhuongTien) {
        this.tenChuPhuongTien = tenChuPhuongTien;
    }

    public String getMaPhuongTien() {
        return maPhuongTien;
    }

    public void setMaPhuongTien(String maPhuongTien) {
        this.maPhuongTien = maPhuongTien;
    }

    public String getNgayDangKy() {
        return ngayDangKy;
    }

    public void setNgayDangKy(String ngayDangKy) {
        this.ngayDangKy = ngayDangKy;
    }

    public String getTenPhuongTien() {
        return tenPhuongTien;
    }

    public void setTenPhuongTien(String tenPhuongTien) {
        this.tenPhuongTien = tenPhuongTien;
    }

    public String getHanSanXuat() {
        return hanSanXuat;
    }

    public void setHanSanXuat(String hanSanXuat) {
        this.hanSanXuat = hanSanXuat;
    }

    public String getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(String namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public String getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(String congSuat) {
        this.congSuat = congSuat;
    }

    public double getDungTichSiLanh() {
        return dungTichSiLanh;
    }

    public void setDungTichSiLanh(double dungTichSiLanh) {
        this.dungTichSiLanh = dungTichSiLanh;
    }

    public abstract String getInfo();

    @Override
    public String toString() {
        return "PhuongTien: " +
                "soDangKy='" + soDangKy + '\'' +
                ", tenChuPhuongTien='" + tenChuPhuongTien + '\'' +
                ", maPhuongTien='" + maPhuongTien + '\'' +
                ", ngayDangKy='" + ngayDangKy + '\'' +
                ", tenPhuongTien='" + tenPhuongTien + '\'' +
                ", hanSanXuat='" + hanSanXuat + '\'' +
                ", namSanXuat='" + namSanXuat + '\'' +
                ", congSuat='" + congSuat + '\'' +
                ", dungTichSiLanh=" + dungTichSiLanh +
                '}';
    }
}
