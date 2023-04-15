package com.course.jdbc.domain.model;

import java.util.Objects;

public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private String tckn;
    private int age;
    private double salary;
    private Department department;
    private Employee manager;

    public Employee(int id, String firstName, String lastName, String tckn, int age, double salary, Department department, Employee manager) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.tckn = tckn;
        this.age = age;
        this.salary = salary;
        this.department = department;
        this.manager = manager;
    }

    public Employee(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTckn() {
        return tckn;
    }

    public void setTckn(String tckn) {
        this.tckn = tckn;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", tckn='" + tckn + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", department=" + department +
                (Objects.isNull(manager) ? "" : ", manager=" + manager.getFirstName() + " " + manager.getLastName()) +
                '}';
    }
}
