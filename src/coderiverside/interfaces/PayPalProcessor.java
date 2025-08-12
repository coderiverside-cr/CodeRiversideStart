package coderiverside.interfaces;

import java.util.Objects;

public class PayPalProcessor implements PaymentProcessor{
    @Override
    public void processPayment(double amount, String currency) {
        System.out.println("Processing PayPal payment of " + amount + " " + currency);
    }

    @Override
    public boolean validatePaymentDetails(String paymentDetails) {
        return Objects.nonNull(paymentDetails) && !paymentDetails.isEmpty();
    }

    @Override
    public void logTransaction(String transactionId) {
        System.out.println("Default Method logTransaction override");
        System.out.println("Transaction Id: " + transactionId + " has been logged.");
    }
}
