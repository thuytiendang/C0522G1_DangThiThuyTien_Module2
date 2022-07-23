package further_exercise_mvc.service;

import further_exercise_mvc.model.Person;

public interface IPersonService<S extends Person> {
    void add();

    void remove();

    void displayAll();

    void findById(int id);

    void findByName(String name);

    boolean findId(int id);

    void sortByName();
}
