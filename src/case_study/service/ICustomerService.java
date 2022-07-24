package case_study.service;

import case_study.model.person.Customer;

public interface ICustomerService extends IService<Customer> {
    void edit();
}
