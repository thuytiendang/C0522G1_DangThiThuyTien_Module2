package case_study.model.facilities;

public abstract class Facility {
    private String nameOfService;
    private float area;
    private float price;
    private int maxPeople;
    private String typeOfRent;

    public Facility(String nameOfService, float area, float price, int maxPeople, String typeOfRent) {
        this.nameOfService = nameOfService;
        this.area = area;
        this.price = price;
        this.maxPeople = maxPeople;
        this.typeOfRent = typeOfRent;
    }

    public Facility() {
    }

    public String getNameOfService() {
        return nameOfService;
    }

    public void setNameOfService(String nameOfService) {
        this.nameOfService = nameOfService;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getTypeOfRent() {
        return typeOfRent;
    }

    public void setTypeOfRent(String typeOfRent) {
        this.typeOfRent = typeOfRent;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "nameOfService='" + nameOfService + '\'' +
                ", area=" + area +
                ", price=" + price +
                ", maxPeople=" + maxPeople +
                ", typeOfRent='" + typeOfRent + '\'' +
                '}';
    }
}
