package com.course.jdbc.domain;

import com.course.jdbc.domain.model.Department;
import com.course.jdbc.util.DBDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DepartmentManagementOverResultSet {

    // CRUD Operations

    private ResultSet departmentResultSet;
    private ResultSet employeeResultSet;

    public DepartmentManagementOverResultSet(){
        String query = "SELECT * FROM t_department";
        String employeeQuery = "SELECT * FROM t_employee WHERE employee_id = ?";
        try {
            Connection connect = DBDataSource.connect();
            Statement statement = connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            departmentResultSet = statement.executeQuery(query);
            //employeeResultSet = statement.executeQuery(employeeQuery);
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public /*Department*/ void findById(int id){
        try {
            departmentResultSet.beforeFirst();
            while (departmentResultSet.next()){
                if(departmentResultSet.getInt("department_id") == id){
                    System.out.println(departmentResultSet.getString("department_name"));
                   //new Department(departmentResultSet.getInt("department_id"), departmentResultSet.getString("department_name"),null);
                    return;
                }
            }

        } catch (SQLException e){
            e.printStackTrace();
        }
        System.out.println("Department with id : " + id + " not found!");
    }


    public void insertDepartment(int id,String name,int managerId){
        try {
            departmentResultSet.moveToInsertRow();
            departmentResultSet.updateInt("department_id",id);
            departmentResultSet.updateString("department_name",name);
            departmentResultSet.updateInt("manager_id",managerId);
            departmentResultSet.insertRow();
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            try {
                departmentResultSet.moveToCurrentRow();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void deleteDepartment(int id) {
        try {
            departmentResultSet.beforeFirst();
            while (departmentResultSet.next()){
                if(departmentResultSet.getInt("department_id") == id){
                    departmentResultSet.deleteRow();
                    System.out.println("Department with id : " + id + " deleted");
                    return;
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Department with id : " + id + " not found!");
    }





}
