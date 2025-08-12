package coderiverside.security.bestpractices;
import java.util.Objects;
import java.util.regex.Pattern;
// Factory Methods with Validation

public final class CreditCard {
    private static final Pattern DIGIT_PATTERN = Pattern.compile("^[0-9]{13,19}$");

    private final String number;
    private final String holder;

    private CreditCard(String number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public static CreditCard of(String number, String holder) {
        Objects.requireNonNull(number, "Card number cannot be null");
        Objects.requireNonNull(holder, "Card holder cannot be null");

        if (holder.isBlank()) {
            throw new IllegalArgumentException("Card holder cannot be blank");
        }

        if (!DIGIT_PATTERN.matcher(number).matches()) {
            throw new IllegalArgumentException("Invalid card number format");
        }

        return new CreditCard(number, holder);
    }

    public String getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }
}
