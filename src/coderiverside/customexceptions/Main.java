package coderiverside.customexceptions;

public class Main {
    public static void main(String[] args) {
        AuthenticationService service = new AuthenticationService();
        try {
            service.authenticate("", "wrongpassword");
        } catch (AuthenticationException e) {
            System.err.println("Authentication failed: " + e.getMessage());
        }
    }
}
