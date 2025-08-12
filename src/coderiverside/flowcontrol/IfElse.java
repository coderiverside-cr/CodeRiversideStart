package coderiverside.flowcontrol;

public class IfElse {
    public static void main(String[] args) {
        int a = 2, b = 2;

        if (a > b) {
            a--;
            b++;
        } else {
            a = 0;
            b = 0;
        }

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int x = 5, y = 5;

        if (x > y) {
            x--;
        } else if (x < y) {
            x++;
        } else {
            y++;
        }

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
