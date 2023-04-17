package com.course.jdbc.domain.model;

public class Department {

    private int departmentId;
    private String name;
    private Employee manager;

    public Department(int departmentId, String name, Employee manager) {
        this.departmentId = departmentId;
        this.name = name;
        this.manager = manager;
    }

    public Department(){

    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", name='" + name + '\'' +
                ", manager=" + manager.getFirstName() + " " + manager.getLastName() +
                '}';
    }
}
