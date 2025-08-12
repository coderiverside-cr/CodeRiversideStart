package coderiverside.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainCollections {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Hello!","Java","Developers"));
        System.out.println("list = " + list);

        Collections.reverse(list);
        System.out.println("list = " + list);

        Collections.shuffle(list);
        System.out.println("list = " + list);

        Collections.sort(list);
        System.out.println("list = " + list);

        int i = Collections.binarySearch(list, "Java");
        System.out.println("i = " + i);

        Collections.fill(list, "CR");
        System.out.println("list = " + list);


    }
}
