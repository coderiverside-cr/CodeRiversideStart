package coderiverside.collections;

import java.util.ArrayList;
import java.util.List;

public class MainList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Code");
        list.add(2, null);
        list.add(3, "Riverside");
        list.add(2, "from");
        list.set(2, "Here");
        list.remove("Here");
        list.remove(2);

        System.out.println("list = " + list);

        System.out.println("contains = " + list.contains("Code"));
        System.out.println("index = " + list.indexOf("Riverside"));
        System.out.println("get = " + list.get(1));

        list.add(3, "Subscribe");

        System.out.println("list.size() = " + list.size());

        list.addFirst("First");
        list.addLast("Last");

        System.out.println("list = " + list);

        list.removeFirst();
        list.removeLast();

        System.out.println("list = " + list);

        List<String> java = List.of("Java", "Developers", "!!!");
        System.out.println("java = " + java);
    }
}
