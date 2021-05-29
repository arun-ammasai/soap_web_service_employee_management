package com.bytecodevelocity.repo;

public class Employee {

    private int employeeId;
    private String employeeName;
    private String location;
    private int pincode;

    public Employee(int employeeId, String employeeName, String location, int pincode) {
        super();
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.location = location;
        this.pincode = pincode;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int zipcode) {
        this.pincode = zipcode;
    }

    @Override
    public String toString() {
        return "EmployeeDTO [employeeId=" + employeeId + ", employeeName=" + employeeName + ", location=" + location
                + ", pincode=" + pincode + "]";
    }


}
