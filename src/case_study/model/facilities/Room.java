package case_study.model.facilities;

public class Room extends Facility{
    private String freeService;

    public Room(String serviceCode, String nameOfService, float area, float price,
                int maxPeople, String typeOfRent, String freeService) {
        super(serviceCode, nameOfService, area, price, maxPeople, typeOfRent);
        this.freeService = freeService;
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room() {
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s",this.getServiceCode(),
                this.getNameOfService(), this.getArea(), this.getPrice(), this.getMaxPeople(), this.getTypeOfRent(),
                this.getFreeService());
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
                "Service code: " + super.getServiceCode() +
                ", NameOfService: " + super.getNameOfService() +
                ", area: " + super.getArea() +
                ", price: " + super.getPrice() +
                ", maxPeople: " + super.getMaxPeople() +
                ", typeOfRent: " + super.getTypeOfRent() +
                ", freeService: " + freeService;
    }
}
