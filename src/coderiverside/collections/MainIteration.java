package coderiverside.collections;

import java.util.*;

public class MainIteration {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('A', 2);
        map.put('E', 5);

        Set<Character> keys = map.keySet();
        Collection<Integer> values = map.values();

        for (Character ch : keys) {
            System.out.println("ch = " + ch);
        }

        for (Integer value : values) {
            System.out.println("value = " + value);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println("entry = " + entry);
        }

        List<String> list = new ArrayList<>(List.of("Hello", "Java", "Developers"));

        for(String s : list){
            System.out.println("s = " + s);
            //list.remove(s);
        }

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String value = iterator.next();
            System.out.println("value = " + value);
            iterator.remove();
        }

        System.out.println("list = " + list);


    }

}
