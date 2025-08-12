package coderiverside.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Streams4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Predicate<Integer> isEven = n -> n % 2 == 0;

        Predicate<Integer> isGreaterThanFive = n -> n > 5;

        Predicate<Integer> isOdd = isEven.negate();

        List<Integer> list = numbers.stream().filter(isEven.and(isGreaterThanFive))
                .collect(Collectors.toList());
        System.out.println("list = " + list);

        Set<Integer> set = numbers.stream()
                .filter(isOdd.or(isGreaterThanFive))
                .collect(Collectors.toSet());

        System.out.println("set = " + set);
    }
}
