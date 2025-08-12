package coderiverside.interfaces;

public class Main {
    public static void main(String[] args) {
        PayPalProcessor payPalProcessor = new PayPalProcessor();
        if(payPalProcessor instanceof PaymentProcessor){
            System.out.println("payPalProcessor instanceof PaymentProcessor = " + true);
        }

        PaymentProcessor.displaySupportedCurrencies();
    }
}
