package coderiverside.security;

import java.sql.*;

public class SqlInjectionSafe {

    public void getUserData(String userId) {
        // CORRECTED: Using PreparedStatement to prevent SQL Injection
        // The '?' acts as a placeholder for the parameter.
        String query = "SELECT * FROM users WHERE id = ?";

        // Establish connection to an in-memory H2 database for demonstration
        // In a real application, you'd get this from a DataSource or connection pool.
        try (Connection conn = DriverManager.getConnection("jdbc:h2:mem:testdb;INIT=RUNSCRIPT FROM 'classpath:init_db.sql'")) {

            // Create a PreparedStatement with the query
            try (PreparedStatement pstmt = conn.prepareStatement(query)) {
                // Set the user input as a parameter.
                // The PreparedStatement handles any special characters, preventing injection.
                pstmt.setString(1, userId); // '1' refers to the first '?' in the query

                System.out.println("Executing query with userId: " + userId);
                try (ResultSet rs = pstmt.executeQuery()) {
                    // Process result set
                    boolean found = false;
                    while (rs.next()) {
                        System.out.println("User found: " + rs.getString("username"));
                        found = true;
                    }
                    if (!found) {
                        System.out.println("No user found for id: " + userId);
                    }
                }
            }
        } catch (SQLException e) {
            System.err.println("Database error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SqlInjectionSafe app = new SqlInjectionSafe();

        // This input attempts to trick the SQL query (malicious input)
        // With PreparedStatement, this will be treated as a literal string ID,
        // so it won't return extra users.
        System.out.println("\n--- Testing with malicious input: '123 OR 1=1 --'");
        app.getUserData("123 OR 1=1 --");

        // Legitimate input
        System.out.println("\n--- Testing with legitimate input: '456'");
        app.getUserData("456");

        // Input that doesn't exist
        System.out.println("\n--- Testing with non-existent input: '999'");
        app.getUserData("999");
    }
}
