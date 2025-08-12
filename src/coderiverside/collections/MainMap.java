package coderiverside.collections;

import java.util.HashMap;
import java.util.Map;

public class MainMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Hello", Integer.valueOf(17));
        map.put("Code", 25);
        map.put("Riverside", 10);
        Integer code = map.put("Code", Integer.valueOf(2));
        System.out.println("code = " + code);
        Integer hello = map.remove("Hello");
        System.out.println("hello = " + hello);

        System.out.println("map = " + map);

        System.out.println("contains key = " + map.containsKey("Code"));
        System.out.println("contains value = " + map.containsValue(17));

        System.out.println("value = " + map.get("Code"));

        System.out.println("map.size() = " + map.size());

    }
}
