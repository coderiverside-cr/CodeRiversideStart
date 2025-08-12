package coderiverside.inheritance;

public class Product extends Object implements Cloneable{

    private String name;

//    public Product() {
//    }

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
