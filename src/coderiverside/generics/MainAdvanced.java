package coderiverside.generics;

import java.util.ArrayList;
import java.util.List;

public class MainAdvanced {
    public static void main(String[] args) {
//        Box box = new Box<Integer>(17);
//        Object value = box.getValue();
//        int valueI = (int) box.getValue();
//        System.out.println("box.getValue() = " + box.getValue());

        System.out.println();

        List<Integer> list = new ArrayList<>();
        list.add(17);

        printList(list);

//        List<String> list1 = new ArrayList<>();
//        list1.add("Code");


        printListNumber(list);

        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Code"));

        List<Thing> thingList = new ArrayList<>();
        thingList.add(new Thing(""));

        //printListUpperBound(thingList);

        printListLowerBound(thingList);

    }

    public static void printList(List<?> list) {
        for (Object element : list) {
            System.out.println("element = " + element);
        }
    }

    public static void printListNumber(List<? extends Number> list) {
        for (Object element : list) {
            System.out.println("element = " + element);
        }
    }


    // Upper Bound
    public static void printListUpperBound(List<? extends Book> list) {
        for (Object element : list) {
            System.out.println("element = " + element);
        }
    }

    // Lower Bound
    public static void printListLowerBound(List<? super Book> list) {
        for (Object element : list) {
            System.out.println("element = " + element);
        }
    }
}
