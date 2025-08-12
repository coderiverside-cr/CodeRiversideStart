package coderiverside.compare;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        Event event1 = new Event("Event 1", Integer.MAX_VALUE);
        Event event2 = new Event("Event 2", -Integer.MAX_VALUE);

        System.out.println("event1.compareTo(event2) = " + event1.compareTo(event2));

        Event eventa = new Event("Event a", 100);
        Event eventb = new Event("Event b", 300);
        Event eventc = new Event("Event c", 200);

        Event[] events = {eventa, eventb, eventc};
        Arrays.sort(events);

        Arrays.stream(events).forEach(System.out::println);

    }
}
