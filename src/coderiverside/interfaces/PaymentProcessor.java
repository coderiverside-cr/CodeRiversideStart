package coderiverside.interfaces;

public interface PaymentProcessor {

    // Constants
    public static final String CURRENCY_USD = "USD";
    String CURRENCY_EUR = "EUR";

    // Abstract methods
    public abstract void processPayment(double amount, String currency);
    boolean validatePaymentDetails(String paymentDetails);

    // Private methods
    private void printReceipt(double amount, String currency) {
        System.out.println("Receipt - Amount: " + amount + " " + currency);
    }

    // Static methods
    public static void displaySupportedCurrencies() {
        System.out.println("Supported currencies: " + CURRENCY_USD + ", " + CURRENCY_EUR);
    }

    // Default methods
    public default void logTransaction(String transactionId) {
        System.out.println("Transaction ID: " + transactionId + " has been logged.");
    }


}
