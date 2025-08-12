package coderiverside.security.bestpractices;
import java.util.Collections;
import java.util.List;

//Immutable Objects with Defensive Copies
public final class ImmutablePerson {
    private final String name;
    private final List<String> emails;

    public ImmutablePerson(String name, List<String> emails) {
        this.name = name;
        this.emails = List.copyOf(emails); // Defensive copy
    }

    public String getName() {
        return name;
    }

    public List<String> getEmails() {
        return Collections.unmodifiableList(emails);
    }
}
