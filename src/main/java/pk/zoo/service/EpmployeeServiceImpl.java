package pk.zoo.service;

import pk.zoo.model.Employee;
import pk.zoo.model.TimeLog;

import java.util.*;

public class EpmployeeServiceImpl implements EmployeeService {
    Map<Long,Employee> employees;
    List<TimeLog> timeLogs;

    public void Init(){
        employees=new HashMap<Long,Employee>() ;
        timeLogs=new ArrayList<TimeLog>();
    }
    @Override
    public void addEmployee(Employee employee) {
        employees.put(employee.getPin(),employee);
    }

    @Override
    public void removeEmployee(Employee employee) {
        employees.remove(employee.getPin());
    }

    @Override
    public void addTimeLog(Long employeePin, Date workingDate, Double workedHours) {
        timeLogs.add(new TimeLog(employeePin,workingDate,workedHours));
    }
}
