package coderiverside.lambdaexpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Defining parameters and body on lambda expressions
public class Lambda2 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Code");
        list.add("Riverside");
        list.add("Java Developers");

        Comparator<String> sortText = (s1,s2) -> s1.compareTo(s2);

        list.removeIf( (final String s) -> s.equals("Java") );
        list.removeIf( (final var s) -> s.equals("Java") );

        list.sort((s1,s2) -> {
            return s1.compareTo(s2);
        });

        Collections.sort(list, sortText);
        System.out.println("list = " + list);


    }
}
