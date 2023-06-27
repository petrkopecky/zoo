package pk.zoo.model;

public class Employee extends Person {
    private String email;
    private String phoneNumber;

    private double hourRateSalary;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getHourRateSalary() {
        return hourRateSalary;
    }

    public void setHourRateSalary(double hourRateSalary) {
        this.hourRateSalary = hourRateSalary;
    }
}
