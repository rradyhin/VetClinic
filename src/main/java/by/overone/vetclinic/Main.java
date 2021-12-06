package by.overone.vetclinic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc: mysql:// localhost:3306/mydb", "root","admin" );
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
