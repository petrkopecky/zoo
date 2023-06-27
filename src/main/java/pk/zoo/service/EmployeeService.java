package pk.zoo.service;

import pk.zoo.model.Employee;

import java.util.Date;

public interface EmployeeService {
    void addEmployee(Employee employee);
    void removeEmployee(Employee employee);

    void addTimeLog(Long employeePin, Date workingDate, Double workdeHours);
}
