package coderiverside.interfaces;

public class Drink extends Product implements Liquid, Consumable{
    @Override
    public void consume(int quantity) {

    }

    @Override
    public int measure() {
        System.out.println("I'm a Drink");
        return 0;
    }
}
