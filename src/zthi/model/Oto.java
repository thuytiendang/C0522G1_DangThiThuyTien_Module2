package zthi.model;

public class Oto extends PhuongTien {
    private int soChoNgoi;
    private String loaiDongCo;

    public Oto() {
    }

    public Oto(String soDangKy, String tenChuPhuongTien, String maPhuongTien, String ngayDangKy, String tenPhuongTien,
               String hanSanXuat, String namSanXuat, String congSuat,
               double dungTichSiLanh, int soChoNgoi, String loaiDongCo) {
        super(soDangKy, tenChuPhuongTien, maPhuongTien, ngayDangKy, tenPhuongTien,
                hanSanXuat, namSanXuat, congSuat, dungTichSiLanh);
        this.soChoNgoi = soChoNgoi;
        this.loaiDongCo = loaiDongCo;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getLoaiDongCo() {
        return loaiDongCo;
    }

    public void setLoaiDongCo(String loaiDongCo) {
        this.loaiDongCo = loaiDongCo;
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", this.getSoDangKy(), this.getTenChuPhuongTien(),
                this.getNgayDangKy(), this.getMaPhuongTien(), this.getTenPhuongTien(),
                this.getHanSanXuat(), this.getNamSanXuat(), this.getCongSuat(), this.getDungTichSiLanh(),
                this.getSoChoNgoi(), this.getLoaiDongCo());
    }

    @Override
    public String toString() {
        return "Oto{" +
                "soChoNgoi=" + soChoNgoi +
                ", loaiDongCo='" + loaiDongCo + '\'' +
                "} " + super.toString();
    }
}
