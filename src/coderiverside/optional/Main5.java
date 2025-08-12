package coderiverside.optional;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

// Avoid using an isPresent() and get() pair for setting and returning a value.
public class Main5 {
    public static void main(String[] args) {
        BigDecimal price = getPrice(1L);
        System.out.println("price = " + price);
    }

    public static BigDecimal getPrice(Long id) {

        Map<Long, Product> db = new HashMap<>();
        db.put(1L, new Product("Cake", BigDecimal.valueOf(25)));
        db.put(2L, new Product("Coffee", BigDecimal.valueOf(17)));
        Optional<BigDecimal> price = Optional.ofNullable(db.get(id).getPrice());

//        if(price.isPresent()){
//            return price.get();
//        } else {
//            return BigDecimal.ZERO;
//        }

        return price.orElse(BigDecimal.ZERO);

    }
}
