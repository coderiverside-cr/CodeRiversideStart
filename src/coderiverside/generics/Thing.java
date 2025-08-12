package coderiverside.generics;

public class Thing {
    private final String name;

    public Thing(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Thing{" +
                "name='" + name + '\'' +
                '}';
    }
}
