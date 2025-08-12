package coderiverside.methodreference;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

// <Class>::new - reference a constructor

public class Main4 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Code");
        list.add("Riverside");
        list.add("Java");

        System.out.println("list = " + list);

        Set<String> set = list.stream().map(String::toUpperCase)
                .map(String::new)
                .collect(Collectors.toSet());

        System.out.println("set = " + set);

    }

}
