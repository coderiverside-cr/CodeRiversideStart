package coderiverside.flowcontrol;

public class SwitchPatternMatching {
    public static void main(String[] args) {
        printDetails(10.5);
    }

    public static void printDetails(Number height) {
        String message = switch (height) {
            case Integer i -> "Rounded: " + i;
            case Double d  -> "Precise: " + d;
            case Number n  -> "Unknown: " + n;
        };
        System.out.print(message);
    }
}
