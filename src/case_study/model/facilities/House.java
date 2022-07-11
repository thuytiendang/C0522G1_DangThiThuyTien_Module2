package case_study.model.facilities;

public class House extends Facility {
    private String roomStandard;
    private int floor;

    public House(String nameOfService, float area, float price, int maxPeople, String typeOfRent, String roomStandard, int floor) {
        super(nameOfService, area, price, maxPeople, typeOfRent);
        this.roomStandard = roomStandard;
        this.floor = floor;
    }

    public House(String roomStandard, int floor) {
        this.roomStandard = roomStandard;
        this.floor = floor;
    }

    public House() {
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "House{" +
                "nameOfService='" + super.getNameOfService() + '\'' +
                ", area=" + super.getArea() +
                ", price=" + super.getPrice() +
                ", maxPeople=" + super.getMaxPeople() +
                ", typeOfRent='" + super.getTypeOfRent() + '\'' +
                "roomStandard='" + roomStandard + '\'' +
                ", floor=" + floor +
                "} ";
    }
}
