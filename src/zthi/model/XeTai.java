package zthi.model;

public class XeTai extends PhuongTien {
    private int trongTai;

    public XeTai() {
    }

    public XeTai(String soDangKy, String tenChuPhuongTien, String maPhuongTien, String ngayDangKy, String tenPhuongTien,
                 String hanSanXuat, String namSanXuat, String congSuat, double dungTichSiLanh, int trongTai) {
        super(soDangKy, tenChuPhuongTien, maPhuongTien, ngayDangKy, tenPhuongTien, hanSanXuat,
                namSanXuat, congSuat, dungTichSiLanh);
        this.trongTai = trongTai;
    }

    public int getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(int trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s",this.getSoDangKy(), this.getTenChuPhuongTien(),
                this.getNgayDangKy(), this.getMaPhuongTien(), this.getTenPhuongTien(),
                this.getHanSanXuat(), this.getNamSanXuat(), this.getCongSuat(),
                this.getDungTichSiLanh(), this.getTrongTai());
    }

    @Override
    public String toString() {
        return "XeTai: " +
                "maPhuongTien: " + super.getMaPhuongTien() +
                ", tenPhuongTien: " + super.getTenPhuongTien() +
                ", hanSanXuat: " + super.getHanSanXuat() +
                ", namSanXuat: " + super.getNamSanXuat() +
                ", congSuat: " + super.getCongSuat() +
                ", dungTichSiLanh: " + super.getDungTichSiLanh() +
                ", trongTai=" + trongTai ;
    }
}
