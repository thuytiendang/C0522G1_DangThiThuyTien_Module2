package further_exercise_mvc2.model;

public class Car extends Vehicle{
    private int seatNumber;
    private String typeOfCar;

    public Car(String licensePlates, String producer, int yearOfManufacture, String owner, int seatNumber, String typeOfCar) {
        super(licensePlates, producer, yearOfManufacture, owner);
        this.seatNumber = seatNumber;
        this.typeOfCar = typeOfCar;
    }

    public Car(int seatNumber, String typeOfCar) {
        this.seatNumber = seatNumber;
        this.typeOfCar = typeOfCar;
    }

    public Car() {
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getTypeOfCar() {
        return typeOfCar;
    }

    public void setTypeOfCar(String typeOfCar) {
        this.typeOfCar = typeOfCar;
    }

    @Override
    public String toString() {
        return "Car: " +
                " licensePlates: " + super.getLicensePlates() +
                ", producer: " + super.getProducer() +
                ", yearOfManufacture: " + super.getYearOfManufacture() +
                ", owner: " + super.getOwner() +
                ", seatNumber: " + this.seatNumber +
                ", typeOfCar: " + this.typeOfCar;
    }

}
