package thuc_hanh_2_phone_management.model;

public class BrandPhone extends Phone{
    private int warrantyTime;
    private String WarrantyScope;

    public BrandPhone() {
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s", this.getId(), this.getName(),
                this.getPrice(), this.getQuantity(), this.getProducer(), this.getWarrantyTime(), this.getWarrantyScope());
    }

    public BrandPhone(int id, String name, double price, int quantity,
                      String producer, int warrantyTime, String warrantyScope) {
        super(id, name, price, quantity, producer);
        this.warrantyTime = warrantyTime;
        WarrantyScope = warrantyScope;
    }

    public int getWarrantyTime() {
        return warrantyTime;
    }

    public void setWarrantyTime(int warrantyTime) {
        this.warrantyTime = warrantyTime;
    }

    public String getWarrantyScope() {
        return WarrantyScope;
    }

    public void setWarrantyScope(String warrantyScope) {
        WarrantyScope = warrantyScope;
    }

    @Override
    public String toString() {
        return "BrandPhone: " +
                "id: " + super.getId() +
                ", name: " + super.getName() +
                ", price: " + super.getPrice() +
                ", quantity: " + super.getQuantity() +
                ", producer: " + super.getProducer() +
                ", warrantyTime: " + warrantyTime +
                ", WarrantyScope: " + WarrantyScope;
    }
}
