package internal;

public class SecretEncryptor {
    public String encrypt(String input) {
        return "[encrypted]" + input.hashCode();
    }
}
