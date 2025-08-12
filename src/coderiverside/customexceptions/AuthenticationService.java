package coderiverside.customexceptions;

public class AuthenticationService {
    public void authenticate(String username, String password) throws AuthenticationException{
        if (username == null || username.isEmpty()) {
            throw new AuthenticationException("Username cannot be null or empty");
        }
        if (!isValidUser(username, password)) {
            throw new AuthenticationException("Invalid username or password");
        }
        System.out.println("User authenticated successfully!");
    }

    private boolean isValidUser(String username, String password) {
        return "admin".equals(username) && "password123".equals(password);
    }
}
