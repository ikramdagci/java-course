package com.course.jdbc.statements;

import com.course.jdbc.util.DBDataSource;
import com.course.reusability.domain.hr.model.Employee;

import java.sql.*;

public class StatementDriver {

    public static void main(String[] args) {
//        testSelectEmployees();
//        testInsertEmployee();
        testSelectEmployeesByIdV2("3 OR 1=1");

    }


    /**
     * Data Concurrency
     * Data Consistency
     * <p>
     * Transaction isolation level
     * <p>
     * Transaction ?
     * commit
     * rollback
     * <p>
     * <b>ACID</b> <br></br>
     * Atomicity <br></br>
     * Consistency <br></br>
     * Isolation <br></br>
     * Durability <br></br>
     */

    public static void testSelectEmployees() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/practice", "postgres", "postgres");//session
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM t_employee");
            while (resultSet.next()) {
                String tckn = resultSet.getString("tckn");
                int employeeId = resultSet.getInt("employee_id");
                String firstName = resultSet.getString("first_name");
                int age = resultSet.getInt("age");
                String lastName = resultSet.getString("last_name");
                double salary = resultSet.getDouble("salary");

                System.out.println("Employee -> " + employeeId + " | " + firstName + " | " + lastName + " | " + age + " | " + tckn + " | " + salary);

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    /*
    "employee_id"	"tckn"	"first_name"	"last_name"	"age"	"salary"	"department_id"	"manager_id"
            2	"12345678913"	"Robert"	"Doe"	30	1525.25	2	1
            1	"12345678912"	"John"	"Doe"	35	5000	2
            3	"12365478925"	"Drogba"	"Didier"	40	8500	1	1
     */
    public static void testInsertEmployee() {
        //session
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/practice", "postgres", "postgres");
             Statement statement = connection.createStatement()) {
            boolean execute = statement.execute("INSERT INTO t_employee VALUES (4,'12365478996','Elizabeth','Swan',25,1000.0,3,1)");
            System.out.println(execute);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void testInsertEmployee(Employee employee) {
        //session
        try (Connection connection = DBDataSource.connect();
             Statement statement = connection.createStatement()) {
            boolean execute = statement.execute("INSERT INTO t_employee VALUES (4,'12365478996','Elizabeth','Swan',25,1000.0,3,1)");
            System.out.println(execute);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public static void testSelectEmployeesById(String id) {

        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/practice", "postgres", "postgres");//session
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM t_employee WHERE employee_id = " + id);
            while (resultSet.next()) {
                String tckn = resultSet.getString("tckn");
                int employeeId = resultSet.getInt("employee_id");
                String firstName = resultSet.getString("first_name");
                int age = resultSet.getInt("age");
                String lastName = resultSet.getString("last_name");
                double salary = resultSet.getDouble("salary");

                System.out.println("Employee -> " + employeeId + " | " + firstName + " | " + lastName + " | " + age + " | " + tckn + " | " + salary);

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static void testSelectEmployeesByIdV2(String id) {

        String queryById = "SELECT * FROM t_employee WHERE first_name = ?";

        try (Connection connection = DBDataSource.connect();
             PreparedStatement preparedStatement = connection.prepareStatement(queryById)){
            preparedStatement.setString(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String tckn = resultSet.getString("tckn");
                int employeeId = resultSet.getInt("employee_id");
                String firstName = resultSet.getString("first_name");
                int age = resultSet.getInt("age");
                String lastName = resultSet.getString("last_name");
                double salary = resultSet.getDouble("salary");
                System.out.println("Employee -> " + employeeId + " | " + firstName + " | " + lastName + " | " + age + " | " + tckn + " | " + salary);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static void testCallableStatement(String id) {

        String queryById = "SELECT * FROM t_employee WHERE first_name = ?";

        // Procedure or functions -- Stored Procedure ? Function
        try (Connection connection = DBDataSource.connect();
             CallableStatement callableStatement = connection.prepareCall("<procedure_name>")){
            ResultSet resultSet = callableStatement.executeQuery();
            while (resultSet.next()) {
                String tckn = resultSet.getString("tckn");
                int employeeId = resultSet.getInt("employee_id");
                String firstName = resultSet.getString("first_name");
                int age = resultSet.getInt("age");
                String lastName = resultSet.getString("last_name");
                double salary = resultSet.getDouble("salary");
                System.out.println("Employee -> " + employeeId + " | " + firstName + " | " + lastName + " | " + age + " | " + tckn + " | " + salary);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static void testSelectEmployeesByIdV3(String id) {

        String queryById = "SELECT * FROM t_employee WHERE first_name = ? AND last_name = ? AND age > ?";

        try (Connection connection = DBDataSource.connect();
             PreparedStatement preparedStatement = connection.prepareStatement(queryById)){
            preparedStatement.setString(1,"John");
            preparedStatement.setString(2,"Doe");
            preparedStatement.setInt(3,18);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String tckn = resultSet.getString("tckn");
                int employeeId = resultSet.getInt("employee_id");
                String firstName = resultSet.getString("first_name");
                int age = resultSet.getInt("age");
                String lastName = resultSet.getString("last_name");
                double salary = resultSet.getDouble("salary");
                System.out.println("Employee -> " + employeeId + " | " + firstName + " | " + lastName + " | " + age + " | " + tckn + " | " + salary);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static void testSelectEmployeesByIdV4(String id) {

        String queryById = "SELECT * FROM t_employee WHERE first_name = %s AND last_name = %s AND age > %d";

        try (Connection connection = DBDataSource.connect();
             Statement statement = connection.createStatement()){

            ResultSet resultSet = statement.executeQuery(String.format(queryById,"John","Doe",18));


            while (resultSet.next()) {
                String tckn = resultSet.getString("tckn");
                int employeeId = resultSet.getInt("employee_id");
                String firstName = resultSet.getString("first_name");
                int age = resultSet.getInt("age");
                String lastName = resultSet.getString("last_name");
                double salary = resultSet.getDouble("salary");
                System.out.println("Employee -> " + employeeId + " | " + firstName + " | " + lastName + " | " + age + " | " + tckn + " | " + salary);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static void testStatamentMethods(String id) {

        String queryById = "SELECT * FROM t_employee WHERE first_name = %s AND last_name = %s AND age > %d";

        try (Connection connection = DBDataSource.connect();
             Statement statement = connection.createStatement()){

            ResultSet resultSet = statement.executeQuery(String.format(queryById,"John","Doe",18));


            while (resultSet.next()) {
                String tckn = resultSet.getString("tckn");
                int employeeId = resultSet.getInt("employee_id");
                String firstName = resultSet.getString("first_name");
                int age = resultSet.getInt("age");
                String lastName = resultSet.getString("last_name");
                double salary = resultSet.getDouble("salary");
                System.out.println("Employee -> " + employeeId + " | " + firstName + " | " + lastName + " | " + age + " | " + tckn + " | " + salary);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


}
