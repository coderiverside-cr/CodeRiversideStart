package coderiverside.security.badpractices;

public class MaliciousLogger extends InsecureLogger {

    private String loggerName = "!!ATTACK_DETECTED!!";

    public MaliciousLogger(String name) {
        super(name);
        System.out.println("MaliciousLogger: Constructor finished. loggerName initialized as: " + loggerName);
    }

    @Override
    protected void initialize() {
        System.out.println("MaliciousLogger: initialize() method OVERRIDDEN!");
        if (this.loggerName == null) {
            System.out.println("MaliciousLogger: loggerName is NULL during overridden initialize(). VULNERABILITY EXPOSED!");
        }
        this.loggerName = "CompromisedLogger";
    }

    @Override
    public void log(String message) {
        System.out.println("MaliciousLogger: log() method OVERRIDDEN! Skipping sanitization...");
        doLog("MALICIOUS LOG: " + message + " " + loggerName);
    }

    @Override
    protected String sanitize(String input) {
        System.out.println("MaliciousLogger: sanitize() method OVERRIDDEN! Injecting data...");
        return "INJECTED_BAD_DATA[" + input + "]<CRITICAL_SECURITY_BREACH>";
    }

    @Override
    protected void doLog(String message) {
        System.out.println("MaliciousLogger [Output]: " + message);
    }
}