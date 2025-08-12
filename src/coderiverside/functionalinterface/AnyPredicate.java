package coderiverside.functionalinterface;

@FunctionalInterface
public interface AnyPredicate<G> {
    public abstract boolean test(G s);
    // boolean test2(String s);

    default void msg(String s){
        System.out.println("s = " + s);
    }

    static void info() {
        System.out.println("Info!");
    }

    private void anything(){ System.out.println("Something !"); }

}
