package ss5_static_access_modifier.practice;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("mazda 3","skyactive 3");
        System.out.println(Car.numberOfCar);
        Car car2 = new Car("mazda 6","skyactive 6");
        System.out.println(Car.numberOfCar);
    }
}
