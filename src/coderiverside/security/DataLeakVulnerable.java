package coderiverside.security;

public class DataLeakVulnerable {

    // Vulnerable: Storing sensitive data in plain text logs
    public void processPayment(String creditCardNumber, double amount) {
        // BAD PRACTICE: Logging sensitive financial information directly
        System.out.println("Processing payment for: " + creditCardNumber + " amount: " + amount);
        // ... actual payment processing
    }

    // Vulnerable: Storing sensitive data without encryption
    public void storeUserDetails(String username, String passwordHash, String ssn) {
        // Assume 'ssn' (Social Security Number) is stored directly in a database
        // without encryption at rest, making it vulnerable if the DB is compromised.
        // (Database interaction code omitted for brevity)
        System.out.println("Storing user: " + username + ", SSN: " + ssn);
    }
}
