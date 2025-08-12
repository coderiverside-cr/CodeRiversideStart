package coderiverside.optional;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.NoSuchElementException;
// Throw an exception in the absence of a value.
public class Main6 {
    public static void main(String[] args) {
        Product product = getProduct(3L);
        System.out.println("product = " + product);
    }

    public static Product getProduct(Long id) {

        Map<Long, Product> db = new HashMap<>();
        db.put(1L, new Product("Cake", BigDecimal.valueOf(25)));
        db.put(2L, new Product("Coffee", BigDecimal.valueOf(17)));
        Optional<Product> p = Optional.ofNullable(db.get(id));

//        if(p.isPresent()){
//            return p.get();
//        } else {
//            throw new NoSuchElementException();
//        }
        return p.orElseThrow();
    }
}
