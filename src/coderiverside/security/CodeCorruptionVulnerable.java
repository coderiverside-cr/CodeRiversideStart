package coderiverside.security;

import java.util.ArrayList;
import java.util.List;

public class CodeCorruptionVulnerable {
    public class UserProfile {
        public String username; // Public field, can be changed directly
        public List<String> permissions; // Mutable field, can be changed externally

        public UserProfile(String username, List<String> permissions) {
            this.username = username;
            this.permissions = permissions; // Direct assignment, not a defensive copy
        }
    }

    public void demonstrateCorruption() {
        List<String> initialPermissions = new ArrayList<>();
        initialPermissions.add("VIEW");
        UserProfile user = new UserProfile("admin", initialPermissions);

        System.out.println("Original username: " + user.username);
        System.out.println("Original permissions: " + user.permissions);

        // Attacker modifies username directly
        user.username = "hacker";

        // Attacker modifies permissions directly (bypassing any logic)
        user.permissions.add("DELETE_ALL");

        System.out.println("Modified username: " + user.username);
        System.out.println("Modified permissions: " + user.permissions);
    }

    public static void main(String[] args) {
        new CodeCorruptionVulnerable().demonstrateCorruption();
    }
}