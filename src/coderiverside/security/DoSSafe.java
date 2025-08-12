package coderiverside.security;

import java.util.LinkedHashMap;
import java.util.Map;

public class DoSSafe {

    // --- 1. Prevention: Resource Limits for Cache ---
    // We use LinkedHashMap to implement a simple LRU (Least Recently Used) cache with a size limit.
    // This ensures the cache will not grow indefinitely, preventing memory-based DoS.
    private static final int CACHE_MAX_SIZE = 100_000; // Defines a reasonable maximum size

    private static Map<String, String> cache = new LinkedHashMap<String, String>(CACHE_MAX_SIZE, 0.75f, true) {
        @Override
        protected boolean removeEldestEntry(Map.Entry<String, String> eldest) {
            // This method is called after a new entry is added.
            // If it returns true, the eldest entry (LRU) is removed.
            return size() > CACHE_MAX_SIZE;
        }
    };

    public static void addToCache(String key, String value) {
        cache.put(key, value);
    }

    public static boolean processUserRegex(String input) {
        // Input validation: Limit the length of the input for regex.
        // Very long inputs can also cause performance issues, even with safe regex.
        if (input.length() > 255) { // Example: Limit to 255 characters
            System.err.println("Error: Input too long for regex processing.");
            return false;
        }

        String safePattern = "a+b"; // A simple example not prone to catastrophic backtracking like (a+)+b

        return input.matches(safePattern);
    }

    public static void main(String[] args) {
        System.out.println("--- Testing Cache Vulnerability (Corrected) ---");
        // The cache now has a size limit enforced by LinkedHashMap
        for (int i = 0; i < 200_000; i++) { // Attempt to add more than CACHE_MAX_SIZE
            addToCache("key" + i, "value" + i);
        }
        System.out.println("Final Cache size: " + cache.size());
        System.out.println("Expected Max Cache size: " + CACHE_MAX_SIZE);

        System.out.println("\n--- Testing Regex Vulnerability (Corrected) ---");
        // Input that previously caused extreme performance issues due to catastrophic backtracking
        // With the corrected pattern and input length limit, this execution should be much faster.
        String maliciousLikeInput = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!"; // Long string, but not catastrophic for 'a+b'
        long startTime = System.nanoTime();
        System.out.println("Regex match (malicious-like input): " + processUserRegex(maliciousLikeInput));
        long endTime = System.nanoTime();
        System.out.println("Regex execution time: " + (endTime - startTime) / 1_000_000 + " ms"); // Should be fast

        // Another input that matches the safe pattern
        String validInput = "aaab";
        startTime = System.nanoTime();
        System.out.println("Regex match (valid input): " + processUserRegex(validInput));
        endTime = System.nanoTime();
        System.out.println("Regex execution time: " + (endTime - startTime) / 1_000_000 + " ms");
    }
}