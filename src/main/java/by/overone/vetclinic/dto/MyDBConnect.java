package by.overone.vetclinic.dto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyDBConnect {

    private final static String url = "jdbc:mysql://localhost:3306/mydb";
    private final static String user = "root";
    private final static String password = "admin";


    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
}


