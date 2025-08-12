package coderiverside.security.badpractices;

public class MaliciousDemo {
    public static void main(String[] args) {
        System.out.println("--- INSECURITY DEMONSTRATION WITH MaliciousLogger ---");

        System.out.println("\n--- Creating MaliciousLogger (Vulnerability in Constructor) ---");
        MaliciousLogger maliciousLogger = new MaliciousLogger("MyWebAppLogger");

        System.out.println("\n--- Executing Malicious log() ---");
        String userSuppliedMessage = "User input with\n malicious\r content.";
        maliciousLogger.log(userSuppliedMessage);

        System.out.println("\n--- Verifying manipulated logger name ---");
        System.out.println("End of demonstration. Observe the output for manipulations.");
    }
}