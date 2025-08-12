package coderiverside.security;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CodeCorruptionSafe {

    public class UserProfileImmutable {
        private final String username;
        private final List<String> permissions; // Immutable after construction

        public UserProfileImmutable(String username, List<String> permissions) {
            this.username = username;
            // Defensive copy: create a new list from the input to prevent external modification
            this.permissions = new ArrayList<>(permissions);
        }

        public String getUsername() {
            return username;
        }

        public List<String> getPermissions() {
            // Return an unmodifiable view of the list
            return Collections.unmodifiableList(permissions);
        }

        // No setters
    }
}
