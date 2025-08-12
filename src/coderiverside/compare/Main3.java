package coderiverside.compare;


import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("Jorge", 25),
                new Person("Kev", 20),
                new Person("Rolando", 17),
        };

        Arrays.sort(persons, new PersonNameSorter().reversed());

        Arrays.stream(persons).forEach(System.out::println);

    }
}
