package com.course.jdbc.rs;

import com.course.jdbc.dal.dao.DepartmentDao;
import com.course.jdbc.dal.dao.EmployeeDataAccesObject;
import com.course.jdbc.domain.DepartmentManagementOverResultSet;
import com.course.jdbc.domain.model.Department;
import com.course.jdbc.domain.model.Employee;
import com.course.jdbc.util.DBDataSource;

import java.sql.*;

public class ResultSetDriver {

    private static ResultSet resultSet;


    public static void main(String[] args) {
        //resultSetMetaData();

        /*EmployeeDataAccesObject employeeDao = new EmployeeDataAccesObject(null);
        DepartmentDao departmentDao = new DepartmentDao(employeeDao);
        employeeDao.setDepartmentDao(departmentDao);

        Department department = departmentDao.findById(2);
        System.out.println(department);

        Employee employee = employeeDao.findById(-9);
        System.out.println(employee);*/

        DepartmentManagementOverResultSet departmentManagementOverResultSet = new DepartmentManagementOverResultSet();
        departmentManagementOverResultSet.findById(5);
        departmentManagementOverResultSet.deleteDepartment(5);
        departmentManagementOverResultSet.findById(5);
        departmentManagementOverResultSet.insertDepartment(5,"Y",1);



    }






    // REF_CUR
    public static void resultSetMetaData(){

        try(Connection connect = DBDataSource.connect()){
            DatabaseMetaData metaData = connect.getMetaData();
            boolean b1 = metaData.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE); // false
            boolean b2 = metaData.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE); // true
            System.out.println(b1);
            boolean b3 = metaData.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_UPDATABLE);
            boolean b6 = metaData.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_READ_ONLY);
            boolean b4 = metaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            boolean b5 = metaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            //
            boolean b = metaData.supportsResultSetHoldability(ResultSet.HOLD_CURSORS_OVER_COMMIT);
            boolean b0 = metaData.supportsResultSetHoldability(ResultSet.CLOSE_CURSORS_AT_COMMIT);

            System.out.println(b);
            System.out.println(b0);

//            boolean b = metaData.supportsResultSetHoldability(,ResultSet.CONCUR_READ_ONLY);
            System.out.println(b3);
            System.out.println(b4);
            System.out.println(b5);

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

}
