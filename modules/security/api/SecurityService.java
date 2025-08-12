package api;

import internal.SecretEncryptor;

public class SecurityService {
    private final SecretEncryptor encryptor = new SecretEncryptor();

    public String secureMessage(String message) {
        return encryptor.encrypt(message);
    }
}
