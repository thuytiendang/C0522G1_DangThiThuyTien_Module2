package case_study.model.facilities;

public class Room extends Facility{
    private String freeService;

    public Room(String nameOfService, float area, float price, int maxPeople, String typeOfRent, String freeService) {
        super(nameOfService, area, price, maxPeople, typeOfRent);
        this.freeService = freeService;
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room() {
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room: " +
                "nameOfService: " + super.getNameOfService() +
                ", area: " + super.getArea() +
                ", price: " + super.getPrice() +
                ", maxPeople: " + super.getMaxPeople() +
                ", typeOfRent: " + super.getTypeOfRent() +
                ", freeService: " + freeService;
    }
}
