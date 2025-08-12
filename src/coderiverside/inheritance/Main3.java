package coderiverside.inheritance;

public class Main3 {
    public static void main(String[] args) {
        Product p = new Drink();
        Food f = new Food();
        f.toString();
        f.getName();
        f.getBestBefore();

        Product p2 = f;
        p2.toString();
        p2.getName();
        //p2.getBestBefore();

        Object o = f;
        o.toString();
        //o.getName();
        //o.getBestBefore();

        Product p3 = (Product) o;
        p3.toString();
        p3.getName();
        //p3.getBestBefore();

        Drink d = (Drink)p;
        Drink d2 = (Drink)p2;
    }
}
