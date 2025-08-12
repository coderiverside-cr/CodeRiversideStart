package coderiverside.inheritance;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Product p = new Product("Water");
        System.out.println("toString = " + p.toString());
        System.out.println("hashCode = " + p.hashCode());
        System.out.println("equal = " + p.equals(new Product("Water")));

        System.out.println("p.getName() = " + p.getName());
        Product p2 = (Product) p.clone();
        System.out.println("clone = " + p2);
        System.out.println("p2.getName() = " + p2.getName());
    }
}
