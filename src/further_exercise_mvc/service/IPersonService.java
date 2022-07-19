package further_exercise_mvc.service;

public interface IPersonService {
    void add();

    void remove();

    void displayAll();

    void findById(int id);

    void findByName(String name);

    boolean findId(int id);
}
