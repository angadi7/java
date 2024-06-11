package com.Day28;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    // Static variable to hold the single instance of the class
    private static volatile DatabaseConnection instance;
    
    // Database connection instance
    private Connection connection;

    // Private constructor to prevent instantiation
    private DatabaseConnection() {
        try {
            // Initialize the database connection (modify URL, username, and password as needed)
            String url = "jdbc:mysql://localhost:3306/your_database";
            String username = "your_username";
            String password = "your_password";
            this.connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error connecting to the database", e);
        }
    }

    // Public method to provide access to the instance
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            synchronized (DatabaseConnection.class) {
                if (instance == null) {
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }

    // Method to get the database connection
    public Connection getConnection() {
        return connection;
    }

    // Method to close the database connection
    public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                instance = null;
            } catch (SQLException e) {
                e.printStackTrace();
                throw new RuntimeException("Error closing the database connection", e);
            }
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();

        // Both db1 and db2 will be the same instance
        System.out.println(db1 == db2);  // Output: true

        // Execute a sample query (use your actual query and table)
        try {
            Connection connection = db1.getConnection();
            connection.createStatement().execute("CREATE TABLE IF NOT EXISTS test (id INT PRIMARY KEY, name VARCHAR(100))");
            connection.createStatement().execute("INSERT INTO test (id, name) VALUES (1, 'John Doe')");
            var resultSet = connection.createStatement().executeQuery("SELECT * FROM test");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + ", " + resultSet.getString("name"));  // Output: 1, John Doe
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Close the connection
        db1.closeConnection();
    }
}

