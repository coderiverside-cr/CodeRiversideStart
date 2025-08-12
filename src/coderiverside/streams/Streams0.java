package coderiverside.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams0 {
    public static void main(String[] args) {

        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8, 9)
        );

        List<Integer> list = listOfLists.stream()
                .flatMap(integers -> integers.stream())
                .collect(Collectors.toList());

        System.out.println("Flat List: " + list);
    }
}
