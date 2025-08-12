package coderiverside.functionalinterface;

public class Main {
    public static void main(String[] args) {
        AnyPredicate<String> predicate = s -> s.length() < 4;

        System.out.println("predicate.test(\"CodeRiverside\") = " + predicate.test("CodeRiverside"));
    }
}
