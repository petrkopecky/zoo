package pk.zoo.service;

import pk.zoo.model.Employee;

public interface EmployeeService {
    Employee addEmployee(Employee employee);
    void removeEmployee(Employee employee);
}
