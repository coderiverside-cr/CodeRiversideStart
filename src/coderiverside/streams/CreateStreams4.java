package coderiverside.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CreateStreams4 {
    public static void main(String[] args) {
        List<String> words =
                Arrays.asList(
                        "keep it simple stupid"
                                .split(" ")
                );
        Comparator<String> lengthCompare = (str1, str2) -> str1.length() - str2.length();
        words.stream()
                .distinct()
                .sorted(lengthCompare)
                .forEach(System.out::println);


    }
}
