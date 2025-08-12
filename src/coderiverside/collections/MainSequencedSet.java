package coderiverside.collections;

import java.util.LinkedHashSet;
import java.util.SequencedSet;

public class MainSequencedSet {
    public static void main(String[] args) {
        SequencedSet<String> sequencedSet = new LinkedHashSet<>();

        sequencedSet.add("A");
        sequencedSet.add("B");
        sequencedSet.add("C");

        sequencedSet.addFirst("X");
        sequencedSet.addLast("Z");

        System.out.println("Sequenced Set: " + sequencedSet);

        sequencedSet.removeFirst();
        sequencedSet.removeLast();

        System.out.println("Sequenced Set: " + sequencedSet);

    }
}
