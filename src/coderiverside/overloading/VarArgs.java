package coderiverside.overloading;

import java.text.MessageFormat;

public class VarArgs {

    static public void main(String... args) {
        VarArgs varArgs = new VarArgs();
        int sum = varArgs.sumNumbers(1, 2, 3, 5, 6, 7, 8, 9);
        System.out.println("sum = " + sum);

        String s = varArgs.concatenateStrings("Code", " ", "Riverside", "!!!");
        System.out.println("s = " + s);

        String formatted = MessageFormat.format("From {0} to {1}", "begin", "end");
        System.out.println("formatted = " + formatted);

    }

    public void doStuff(int x, Product... products) {
        for (Product p : products) {
            System.out.println("Product: " + p);
        }
    }

    public int sumNumbers(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public String concatenateStrings(String... strings) {
        StringBuilder result = new StringBuilder();
        for (String str : strings) {
            result.append(str);
        }
        return result.toString();
    }

}