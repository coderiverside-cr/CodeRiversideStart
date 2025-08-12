package coderiverside.collections;

import java.util.HashSet;
import java.util.Set;

public class MainSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Hello");
        set.add("Code");
        set.add("Code");
        set.add("Riverside");
        set.remove("Hello");
        set.remove("Hello");

        System.out.println("set = " + set);

        System.out.println("contains = " + set.contains("Code"));
//        System.out.println("index = " + set.indexOf("Riverside"));
//        System.out.println("get = " + set.get(1));

        Set<String> java = Set.of("Hello!", "Java", "Developers");
        System.out.println("java = " + java);

    }
}
