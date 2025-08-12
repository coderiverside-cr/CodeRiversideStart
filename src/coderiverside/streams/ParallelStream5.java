package coderiverside.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ParallelStream5 {
    public static void main(String[] args) {
        List<String> items = List.of("apple", "banana", "cherry", "avocado");

//        Map<Character, String> map = items.stream().parallel()
//                .collect(Collectors.toMap(
//                        item -> item.charAt(0),
//                        item -> item
//                ));
//
//        System.out.println(map);

        Map<Character, String> result = items.parallelStream()
                .collect(Collectors.toConcurrentMap(
                        item -> item.charAt(0),
                        item -> item,
                        (existing, replacement) -> existing
                ));

        System.out.println(result);

    }
}
