package coderiverside.generics;

public class ObjectBox{
    private final Object value;

    public ObjectBox(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }
}
