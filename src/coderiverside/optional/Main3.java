package coderiverside.optional;

import java.util.Optional;
// Never assign null to an optional variable
public class Main3 {
    public static void main(String[] args) {
        Optional<Product> p = getFromDB("Water");
        if (p.isPresent()) {
            System.out.println(p.get().getPrice());
        }
    }

    public static Optional<Product> getFromDB(String name) {
        // Perform a search for Product

        //Optional<Product> product = null; // in case no product
        Optional<Product> product = Optional.empty(); // in case no product

        return product;
    }

}
