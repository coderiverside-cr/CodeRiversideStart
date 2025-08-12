package coderiverside.methodreference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// <Class>::<instanceMethod> - reference an instance method of an
//                             arbitrary object of a particular type

public class Main3 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Code");
        list.add("Riverside");
        list.add("Java Developers");

        System.out.println("list = " + list);

        Collections.sort(list, (s, str) -> s.compareToIgnoreCase(str));

        System.out.println("list = " + list);

    }
}
