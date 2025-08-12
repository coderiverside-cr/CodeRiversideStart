package coderiverside.compare;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main4 {
    public static void main(String[] args) {
        Comparator<String> sizeOrder = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() < s2.length() ? -1 :
                        s1.length() > s2.length() ? 1 :
                                s1.compareTo(s2);
            }
        };

        int compare = sizeOrder.compare("two", "three");
        System.out.println("compare = " + compare);

        Comparator<Person> compareByName = Comparator.comparing(person -> person.name());

        Person person1 = new Person("Franco",27);
        Person person2 = new Person("Mabel",21);

        List<Person> list = new ArrayList<>(List.of(person1,person2));

        list.sort(compareByName);

        list.stream().forEach(person -> System.out.println(person));

        Comparator<Person> compareByAge = Comparator.comparingInt(Person::age);

        list.sort(compareByAge);
        list.sort(compareByAge.reversed());
        list.sort(compareByAge.thenComparing(compareByName));

        list.add(null);
        list.sort(Comparator.nullsFirst(compareByAge));

        System.out.println();
        list.stream().forEach(person -> System.out.println(person));


    }
}
