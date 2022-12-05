package case_study.model.facilities;

public class Villa extends Facility{
    private String roomStandard;
    private float poolArea;
    private int floor;

    public Villa(String serviceCode, String nameOfService, float area, float price, int maxPeople,
                 String typeOfRent, String roomStandard, float poolArea, int floor) {
        super(serviceCode, nameOfService, area, price, maxPeople, typeOfRent);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.floor = floor;
    }

    public Villa() {
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s",this.getServiceCode(),
                this.getNameOfService(), this.getArea(), this.getPrice(), this.getMaxPeople(),
                this.getTypeOfRent(), this.getRoomStandard(), this.getPoolArea(), this.getFloor());
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public float getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(float poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Villa: " +
                "Service code: " + super.getServiceCode() +
                ", NameOfService: " + super.getNameOfService() +
                ", area: " + super.getArea() +
                ", price: " + super.getPrice() +
                ", maxPeople: " + super.getMaxPeople() +
                ", typeOfRent: " + super.getTypeOfRent() +
                ", roomStandard: " + roomStandard +
                ", poolArea: " + poolArea +
                ", floor: " + floor;
    }
}
