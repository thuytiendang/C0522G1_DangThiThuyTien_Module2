package further_exercise_mvc2.model;

public class Truck extends Vehicle{
    private float tonnage;

    public Truck(String licensePlates, String producer, int yearOfManufacture, String owner, float tonnage) {
        super(licensePlates, producer, yearOfManufacture, owner);
        this.tonnage = tonnage;
    }

    public Truck(float tonnage) {
        this.tonnage = tonnage;
    }

    public Truck(){
    }

    public float getTonnage() {
        return tonnage;
    }

    public void setTonnage(float tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public String toString() {
        return "Truck: " +
                " licensePlates: " + super.getLicensePlates() +
                ", producer: " + super.getProducer() +
                ", yearOfManufacture: " + super.getYearOfManufacture() +
                ", owner: " + super.getOwner() +
                "tonnage: " + this.tonnage;
    }
}
