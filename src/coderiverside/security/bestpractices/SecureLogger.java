package coderiverside.security.bestpractices;

import java.util.Objects;

// Safe Inheritance Design
public abstract class SecureLogger {
    private final String loggerName;

    protected SecureLogger(String name) {
        this.loggerName = Objects.requireNonNull(name);
        initialize();
    }

    private void initialize() { // Private to prevent overriding
        System.out.println("Initializing secure logger: " + loggerName);
    }

    public final void log(String message) { // Final to prevent overriding
        doLog(sanitize(message));
    }

    protected abstract void doLog(String message);

    private String sanitize(String input) {
        return input.replace("\n", "").replace("\r", "");
    }
}
