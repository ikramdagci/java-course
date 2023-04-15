package com.course.jdbc.dal.dao;

import com.course.jdbc.dal.CrudDataAccessLayer;
import com.course.jdbc.domain.model.Department;
import com.course.jdbc.domain.model.Employee;
import com.course.jdbc.util.DBDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDataAccesObject implements CrudDataAccessLayer<Employee> {

    private DepartmentDao departmentDao;

    public EmployeeDataAccesObject(DepartmentDao departmentDao){
        this.departmentDao = departmentDao;
    }

    public void insertEmployee(Employee employee) {
        //session
        String insertQuery = "INSERT INTO t_employee (employee_id, tckn, first_name, last_name, age, salary, department_id, manager_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection connection = DBDataSource.connect();
             PreparedStatement prepareStatement = connection.prepareStatement(insertQuery)) {
            prepareStatement.setInt(1,employee.getId());
            prepareStatement.setString(2,employee.getTckn());
            prepareStatement.setString(3,employee.getFirstName());
            prepareStatement.setString(4,employee.getLastName());
            prepareStatement.setInt(5,employee.getAge());
            prepareStatement.setInt(6,employee.getDepartment().getDepartmentId());
            prepareStatement.setInt(7,employee.getManager().getId());

            int i = prepareStatement.executeUpdate();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Employee findById(int id) {
        String query = "SELECT * FROM t_employee WHERE employee_id = ?";
        try (Connection connect = DBDataSource.connect(); PreparedStatement prepareStatement = connect.prepareStatement(query)) {
            prepareStatement.setInt(1,id);

            ResultSet resultSet = prepareStatement.executeQuery();
            while(resultSet.next()){
                int employeeId = resultSet.getInt("employee_id");
                String tckn = resultSet.getString("tckn");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                int age = resultSet.getInt("age");
                double salary = resultSet.getDouble("salary");
                int departmentId = resultSet.getInt("department_id");
                int managerId = resultSet.getInt("manager_id");

                Department department = departmentDao.findById(departmentId);

                Employee employee = new Employee(employeeId, firstName, lastName, tckn, age, salary, department, null);

                PreparedStatement managerQueryStatement = connect.prepareStatement(query);
                managerQueryStatement.setInt(1,managerId);
                ResultSet managerRs = managerQueryStatement.executeQuery();
                if(managerRs.next()) {
                    int managerEmployeeId = resultSet.getInt("employee_id");
                    String managerTckn = resultSet.getString("tckn");
                    String managerFirstName = resultSet.getString("first_name");
                    String managerLastName = resultSet.getString("last_name");
                    int managerAge = resultSet.getInt("age");
                    double managerSalary = resultSet.getDouble("salary");
                    int managerDepartmentId = resultSet.getInt("department_id");
                    Employee manager = new Employee(managerEmployeeId, managerFirstName, managerLastName, managerTckn, managerAge, managerSalary, departmentDao.findById(managerDepartmentId), null);
                    employee.setManager(manager);
                }

                return employee;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    public void setDepartmentDao(DepartmentDao departmentDao) {
        this.departmentDao = departmentDao;
    }






    /*
    public void test(){
        Employee byId = findById(1);
        byId.getDepartment().getName() ?? null
    }


    public Employee findById(int id) {
        String query = "SELECT * FROM t_employee WHERE id = ?";
        try (Connection connect = DBDataSource.connect(); PreparedStatement prepareStatement = connect.prepareStatement(query)) {
            prepareStatement.setInt(1,id);

            ResultSet resultSet = prepareStatement.executeQuery();
            while(resultSet.next()){
                int employeeId = resultSet.getInt("employee_id");
                String tckn = resultSet.getString("tckn");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                int age = resultSet.getInt("age");
                double salary = resultSet.getDouble("salary");
                int departmentId = resultSet.getInt("department_id");
                int managerId = resultSet.getInt("manager_id");

                Department department = new Department(departmentId,null,null);
                Employee manager = new Employee(managerId, null, null, null, -1, -1, null, null);

                Employee employee = new Employee(employeeId, firstName, lastName, tckn, age, salary, department, manager);

                return employee;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

     */

}
