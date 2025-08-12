package coderiverside.dsa.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<>();

        System.out.println("Initial list: " + numbers);

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("Numbers after adding: " + numbers); // Output: [10, 20, 30]

        numbers.remove((Object)20);

        System.out.println("Numbers after adding: " + numbers); // Output: [10, 30]
    }
}
