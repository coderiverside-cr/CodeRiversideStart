package coderiverside.security.badpractices;

import java.util.Objects;

// Insecure Inheritance Design
public abstract class InsecureLogger {
    protected String loggerName;

    public InsecureLogger(String name) {
        this.loggerName = Objects.requireNonNull(name);
        initialize();
    }

    protected void initialize() {
        System.out.println("Initializing INSECURE logger: " + loggerName);
    }

    public void log(String message) {
        doLog(sanitize(message));
    }

    protected abstract void doLog(String message);

    protected String sanitize(String input) {
        return input.replace("\n", "").replace("\r", "");
    }
}