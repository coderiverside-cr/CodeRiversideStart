package coderiverside.collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SequencedMap;

public class MainSequencedMap {
    public static void main(String[] args) {
        SequencedMap<Integer, String> sequencedMap = new LinkedHashMap<>();

        sequencedMap.put(1, "One");
        sequencedMap.put(2, "Two");
        sequencedMap.put(3, "Three");

        sequencedMap.putFirst(0, "Zero");
        sequencedMap.putLast(4, "Four");

        System.out.println("Map: " + sequencedMap);

        Map.Entry<Integer, String> firstEntry = sequencedMap.firstEntry();
        Map.Entry<Integer, String> lastEntry = sequencedMap.lastEntry();

        System.out.println("First: " + firstEntry);
        System.out.println("Last: " + lastEntry);

        System.out.println("pollFirstEntry = " + sequencedMap.pollFirstEntry());
        System.out.println("pollLastEntry = " + sequencedMap.pollLastEntry());

        System.out.println("Map: " + sequencedMap);
    }
}
