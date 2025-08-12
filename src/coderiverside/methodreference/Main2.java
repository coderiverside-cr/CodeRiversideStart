package coderiverside.methodreference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// <object>::<instanceMethod> - reference an instance method
//                              of a particular object

public class Main2 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Code");
        list.add("Riverside");
        list.add("Java Developers");

        System.out.println("list = " + list);

        TextFilter textFilter = new TextFilter();

        Collections.sort(list, (s1, s2) -> textFilter.compare(s1, s2));

        System.out.println("list = " + list);

    }
}
