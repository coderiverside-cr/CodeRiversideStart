package coderiverside.annotations;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) throws NoSuchMethodException {
        Class<CustomerService> serviceClass = CustomerService.class;

        // Get policies for the processNewCustomer method
        Method processCustomerMethod = serviceClass.getMethod("processNewCustomer", String.class);
        BusinessPolicy[] policiesForProcess = processCustomerMethod.getAnnotationsByType(BusinessPolicy.class);

        System.out.println("Policies for processNewCustomer:");
        Arrays.stream(policiesForProcess)
                .forEach(policy -> System.out.println("- Name: " + policy.name() + ", Severity: " + policy.level()));

        System.out.println("\n---");

        // Get policies for the calculateDiscount method
        Method calculateDiscountMethod = serviceClass.getMethod("calculateDiscount", String.class, double.class);
        BusinessPolicy[] policiesForDiscount = calculateDiscountMethod.getAnnotationsByType(BusinessPolicy.class);

        System.out.println("Policies for calculateDiscount:");
        Arrays.stream(policiesForDiscount)
                .forEach(policy -> System.out.println("- Name: " + policy.name() + ", Severity: " + policy.level()));
    }
}