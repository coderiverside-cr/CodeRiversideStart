package coderiverside.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays3 {
    public static void main(String[] args) {
        String[] values = new String[5];
        Arrays.fill(values, 2, 4, "code");
        int i = Arrays.binarySearch(values, "code");
        System.out.println("i = " + i);

        String[] names1 = {"Franco", "Angel", "Sebastian"};
        String[] names2 = {"Franco", "Angela", "Sebastian"};

        boolean equals = Arrays.equals(names1, names2);
        System.out.println("equals = " + equals);

        Arrays.sort(names2);
        for (int c = 0; c < names2.length; c++) {
            System.out.println(names2[c] + " ");
        }

        Comparator<String> sizeOrder = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() < s2.length() ? -1 :
                        s1.length() > s2.length() ? 1 :
                                s1.compareTo(s2);
            }
        };

        Arrays.sort(names1, sizeOrder);
        for (int c = 0; c < names1.length; c++) {
            System.out.println(names1[c] + " ");
        }



    }
}
