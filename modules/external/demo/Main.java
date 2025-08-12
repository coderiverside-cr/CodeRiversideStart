package demo;

import api.SecurityService;

public class Main {
    public static void main(String[] args) {
        SecurityService service = new SecurityService();
        String result = service.secureMessage("TopSecret");
        System.out.println("Secured Message: " + result);

//      This line would cause a compile-time error due to module encapsulation:
        internal.SecretEncryptor hack = new internal.SecretEncryptor();
    }
}
