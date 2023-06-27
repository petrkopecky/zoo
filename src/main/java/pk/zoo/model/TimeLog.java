package pk.zoo.model;

import java.util.Date;

public class TimeLog {

    private Long employeePin;
    private Date workingDate;
    private Double workedHours;

    public Long getEmployeePin() {
        return employeePin;
    }

    public TimeLog(Long employeePin, Date workingDate, Double workedHours) {
        this.employeePin = employeePin;
        this.workingDate = workingDate;
        this.workedHours = workedHours;
    }

    public void setEmployeePin(Long employeePin) {
        this.employeePin = employeePin;
    }

    public Date getWorkingDate() {
        return workingDate;
    }

    public void setWorkingDate(Date workingDate) {
        this.workingDate = workingDate;
    }

    public Double getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(Double workedHours) {
        this.workedHours = workedHours;
    }

}
