package com.course.jdbc;

import java.sql.*;

public class Driver {

    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/practice", "postgres", "postgres");//session
            DatabaseMetaData metaData = connection.getMetaData();
            System.out.println(metaData.getDriverName());
            System.out.println(metaData.getDriverVersion());
            System.out.println(metaData.getDefaultTransactionIsolation());

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


}
