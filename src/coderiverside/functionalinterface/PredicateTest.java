package coderiverside.functionalinterface;

public class PredicateTest implements AnyPredicate<String>{

    @Override
    public boolean test(String s) {
        return s.startsWith("A");
    }
}
