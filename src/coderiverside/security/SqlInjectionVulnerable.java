package coderiverside.security;

import java.sql.*;

public class SqlInjectionVulnerable {
    public void getUserData(String userId) {
        // VULNERABLE TO SQL INJECTION
        // If userId is "123 OR 1=1 --", the query becomes:
        // SELECT * FROM users WHERE id = 123 OR 1=1 --'
        // which returns all users or bypasses authentication.
        String query = "SELECT * FROM users WHERE id = '" + userId + "'";

        try (Connection conn = DriverManager.getConnection("jdbc:h2:mem:testdb");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            // ... process result set
            System.out.println("Executed query: " + query);
            while(rs.next()){
                System.out.println("User found: " + rs.getString("username"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SqlInjectionVulnerable app = new SqlInjectionVulnerable();
        // This input attempts to trick the SQL query
        app.getUserData("123 OR 1=1 --"); // Malicious input
        app.getUserData("456"); // Legitimate input
    }
}
