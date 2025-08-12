package coderiverside.annotations;

public class CustomerService {

    @BusinessPolicy(name = "Validate customer")
    @BusinessPolicy(name = "Verify credit history", level = BusinessPolicy.Severity.HIGH)
    public void processNewCustomer(String customerId) {
        System.out.println("Processing new customer: " + customerId);
        // Business logic here...
    }

    @BusinessPolicy(name = "Apply loyalty discount", level = BusinessPolicy.Severity.LOW)
    public double calculateDiscount(String customerId, double amount) {
        System.out.println("Calculating discount for customer: " + customerId);
        return amount * 0.05; // Example discount
    }

    public void anotherOperation() {
        System.out.println("Performing another operation without specific policies.");
    }
}