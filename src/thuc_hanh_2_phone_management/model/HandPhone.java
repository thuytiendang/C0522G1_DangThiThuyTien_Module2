package thuc_hanh_2_phone_management.model;

public class HandPhone extends Phone{
    private String handCountry;
    private String status;

    public HandPhone() {
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s", this.getId(), this.getName(),
                this.getPrice(), this.getQuantity(), this.getProducer(), this.getHandCountry(), this.getStatus());
    }

    public HandPhone(int id, String name, double price, int quantity,
                     String producer, String handCountry, String status) {
        super(id, name, price, quantity, producer);
        this.handCountry = handCountry;
        this.status = status;
    }

    public String getHandCountry() {
        return handCountry;
    }

    public void setHandCountry(String handCountry) {
        this.handCountry = handCountry;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "HandPhone: " +
                "id: " + super.getId() +
                ", name: " + super.getName() +
                ", price: " + super.getPrice() +
                ", quantity: " + super.getQuantity() +
                ", producer: " + super.getProducer() +
                ", handCountry: " + handCountry +
                ", status: " + status ;
    }
}
