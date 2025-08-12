package coderiverside.generics;

public class Pencil extends Thing {

    private final String color;

    public Pencil(String color) {
        super("Pencil");
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Thing{" +
                "name='" + this.getName() + '\'' +
                "color='" + this.getColor() + '\'' +
                '}';
    }
}
