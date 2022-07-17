package further_exercise_mvc2.model;

public class Motorbike extends Vehicle{
     private String productivity;

    public Motorbike(String licensePlates, String producer, int yearOfManufacture, String owner, String productivity) {
        super(licensePlates, producer, yearOfManufacture, owner);
        this.productivity = productivity;
    }

    public Motorbike(String productivity) {
        this.productivity = productivity;
    }

    public Motorbike(){

    }

    public String getProductivity() {
        return productivity;
    }

    public void setProductivity(String productivity) {
        this.productivity = productivity;
    }

    @Override
    public String toString() {
        return "Motorbike: " +
                " licensePlates: " + super.getLicensePlates() +
                ", producer: " + super.getProducer() +
                ", yearOfManufacture: " + super.getYearOfManufacture() +
                ", owner: " + super.getOwner() +
                ", productivity: " + this.productivity;
    }
}
