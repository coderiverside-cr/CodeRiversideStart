package coderiverside.methodreference;

import java.util.ArrayList;
import java.util.List;

// <Class>::<staticMethod> - reference a static method

public class Main1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Code");
        list.add("Riverside");
        list.add("Java Developers");

        System.out.println("list = " + list);

        list.removeIf(s -> TextFilter.remove(s));

        System.out.println("list = " + list);

    }
}
