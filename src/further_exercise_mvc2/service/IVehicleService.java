package further_exercise_mvc2.service;

public interface IVehicleService<E> {
    void add();
    void delete(String license);
    void getAll();
    boolean findByLicensePlates(String license);
    boolean find(String license);
}
