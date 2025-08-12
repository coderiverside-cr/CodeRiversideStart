package coderiverside.dsa.stack;

import java.util.Stack;

public class Main {
    public static void main(String... args) {
        Stack<Integer> stack = new Stack<>();

        System.out.println("stack.empty() = " + stack.empty());

        stack.push(17);
        stack.push(25);

        System.out.println("stack.empty() = " + stack.empty());
        System.out.println("stack.peek() = " + stack.peek());

        stack.pop();
        stack.pop();

        System.out.println("stack.empty() = " + stack.empty());

        stack.pop(); // Exception

    }
}
