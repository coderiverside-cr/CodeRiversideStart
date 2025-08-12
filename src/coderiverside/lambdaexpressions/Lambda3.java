package coderiverside.lambdaexpressions;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
// Use Default and Static Methods of the Comparator interface
public class Lambda3 {

    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("Coffee", BigDecimal.valueOf(10)));
        list.add(new Product("Coffee", BigDecimal.ONE));
        list.add(new Product("Coffee", BigDecimal.TWO));
        list.add(new Product("Cake", BigDecimal.TWO));
        list.add(new Product("Water", BigDecimal.valueOf(5)));

        Comparator<Product> sortNames = (p1,p2) -> p1.getName().compareTo(p2.getName());
        Comparator<Product> sortPrices = (p1,p2) -> p1.getPrice().compareTo(p2.getPrice());

        Collections.sort(list, sortNames.thenComparing(sortPrices).reversed());

        list.add(null);

        Collections.sort(list, Comparator.nullsFirst(sortNames));


        for (Product p : list){
            System.out.println("p = " + p);
        }
    }
}
