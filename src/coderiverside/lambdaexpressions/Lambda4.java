package coderiverside.lambdaexpressions;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

// Use Default and Static Methods of the Predicate interface
public class Lambda4 {

    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("Coffee", BigDecimal.valueOf(10)));
        list.add(new Product("Coffee", BigDecimal.ONE));
        list.add(new Product("Coffee", BigDecimal.TWO));
        list.add(new Product("Cake", BigDecimal.TWO));
        list.add(new Product("Water", BigDecimal.valueOf(5)));

        Predicate<Product> filterTwo = (p) -> p.getPrice().equals(BigDecimal.TWO);
        Predicate<Product> filterPrice = (p) -> p.getPrice().compareTo(BigDecimal.TWO) < 0;

//        boolean result = list.removeIf(filterPrice.negate());
//        System.out.println("result = " + result);

        list.removeIf(filterTwo.negate().or(filterPrice));

        list.removeIf(Predicate.isEqual(new Product("Cake", BigDecimal.TWO)));


        for (Product p : list){
            System.out.println("p = " + p);
        }



    }
}
