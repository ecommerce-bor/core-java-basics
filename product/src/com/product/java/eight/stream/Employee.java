package com.product.java.eight.stream;

import java.util.Objects;

public class Employee {

    private Integer id;
    private String name;
    private Double salary;
    private Character gender;
    private String dateOfJoining;
    private String departmentName;
    private String locationName;

    public Employee(Integer id, String name, Double salary, Character gender, String dateOfJoining, String departmentName, String locationName) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.gender = gender;
        this.dateOfJoining = dateOfJoining;
        this.departmentName = departmentName;
        this.locationName = locationName;
    }

    public Employee(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public String getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(String dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id) && Objects.equals(name, employee.name) && Objects.equals(salary, employee.salary) && Objects.equals(gender, employee.gender) && Objects.equals(dateOfJoining, employee.dateOfJoining) && Objects.equals(departmentName, employee.departmentName) && Objects.equals(locationName, employee.locationName);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                ", dateOfJoining='" + dateOfJoining + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", locationName='" + locationName + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary, gender, dateOfJoining, departmentName, locationName);
    }


}
