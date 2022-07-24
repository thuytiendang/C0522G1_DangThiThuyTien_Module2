package case_study.service;

import case_study.model.person.Employee;

public interface IService<F> {
    void display();

    F add();

}
