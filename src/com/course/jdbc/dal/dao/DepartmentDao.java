package com.course.jdbc.dal.dao;

import com.course.jdbc.dal.CrudDataAccessLayer;
import com.course.jdbc.domain.model.Department;
import com.course.jdbc.domain.model.Employee;
import com.course.jdbc.util.DBDataSource;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DepartmentDao implements CrudDataAccessLayer<Department> {

    private EmployeeDataAccesObject employeeDao;

    private ResultSet resultSet;
    public DepartmentDao(EmployeeDataAccesObject employeeDataAccesObject){
        this.employeeDao = employeeDataAccesObject;
    }

    public Department findById(int id) {
        String departmentQuery = "SELECT * FROM t_department WHERE department_id = ?";
        String employeeQuery = "SELECT * FROM t_employee WHERE employee_id = ?";

        try (Connection connect = DBDataSource.connect()) {
            PreparedStatement prepareStatement = connect.prepareStatement(departmentQuery);
            prepareStatement.setInt(1,id);
            ResultSet departmentsResultSet = prepareStatement.executeQuery();
            if(departmentsResultSet.next()){
                String departmentName = departmentsResultSet.getString("department_name");
                int departmentId = departmentsResultSet.getInt("department_id");
                int managerId = departmentsResultSet.getInt("manager_id");

                Department department = new Department();
                department.setName(departmentName);
                department.setDepartmentId(departmentId);

                PreparedStatement employeeStatement = connect.prepareStatement(employeeQuery);
                employeeStatement.setInt(1,managerId);
                ResultSet managerRs = employeeStatement.executeQuery();
                if(managerRs.next()){
                    int employeeId = managerRs.getInt("employee_id");
                    String tckn = managerRs.getString("tckn");
                    String firstName = managerRs.getString("first_name");
                    String lastName = managerRs.getString("last_name");
                    int age = managerRs.getInt("age");
                    double salary = managerRs.getDouble("salary");

                    Employee manager = new Employee(employeeId, firstName, lastName, tckn, age, salary, department, null);
                    department.setManager(manager);
                    return department;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
