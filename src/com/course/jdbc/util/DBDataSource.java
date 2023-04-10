package com.course.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBDataSource {

    public static final String DB_URL = "jdbc:postgresql://localhost:5432/practice";
    public static final String USER = "postgres";
    public static final String PASSWORD = "postgres";

    public static Connection connect() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

}
