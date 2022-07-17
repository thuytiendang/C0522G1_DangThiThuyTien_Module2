package further_exercise_mvc2.model;

public abstract class Vehicle {
    private String licensePlates;
    private String producer;
    private int yearOfManufacture;
    private String owner;

    public Vehicle(String licensePlates, String producer, int yearOfManufacture, String owner) {
        this.licensePlates = licensePlates;
        this.producer = producer;
        this.yearOfManufacture = yearOfManufacture;
        this.owner = owner;
    }

    public Vehicle() {
    }

    public String getLicensePlates() {
        return licensePlates;
    }

    public void setLicensePlates(String licensePlates) {
        this.licensePlates = licensePlates;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Vehicle: " +
                "licensePlates: " + this.licensePlates +
                ", producer: " + this.producer +
                ", yearOfManufacture: " + this.yearOfManufacture +
                ", owner: " + this.owner;
    }

}
