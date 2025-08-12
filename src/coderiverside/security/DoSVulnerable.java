package coderiverside.security;

import java.util.HashMap;
import java.util.Map;

public class DoSVulnerable {
    private static Map<String, String> cache = new HashMap<>();

    // Vulnerable: Uncontrolled growth of a cache
    public static void addToCache(String key, String value) {
        // No size limit, no eviction policy
        cache.put(key, value); // Attacker can fill memory with unique keys
    }

    // Vulnerable: High computational cost for uncontrolled input (e.g., regex)
    public static boolean processUserRegex(String input) {
        // Catastrophic backtracking regex example (simplified for demonstration)
        // An attacker can send a string like "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!"
        return input.matches("(a+)+b");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1_000_000; i++) {
            addToCache("key" + i, "value" + i); // Will consume all available memory
        }
        System.out.println("Cache size: " + cache.size());

        // Example of triggering the regex vulnerability
        String maliciousInput = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!";
        long startTime = System.nanoTime();
        System.out.println("Regex match: " + processUserRegex(maliciousInput)); // Will take a very long time
        long endTime = System.nanoTime();
        System.out.println("Regex execution time: " + (endTime - startTime) / 1_000_000 + " ms");
    }
}
