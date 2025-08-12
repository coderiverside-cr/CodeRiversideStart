package coderiverside.inheritance;

public class Main2 {
    public static void main(String[] args){
        Drink drink = new Drink();
        drink.getName();
        //drink.getBestBefore();

        Food food = new Food();
        food.getName();
        food.getBestBefore();

        Object x = new Food();
        //x.getName();
        Product y = new Food();
        y.getName();
        //y.getBestBefore();
        Food z = new Food();
        z.getName();
        z.getBestBefore();
    }
}
