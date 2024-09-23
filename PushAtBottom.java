package STACK;

import java.util.Stack;

public class PushAtBottom {
    public static void bottom(Stack<Integer> s, int x) {
        Stack<Integer> temp = new Stack<>();
        while (!s.isEmpty()) {
            temp.push(s.pop());
        }
        s.push(x);
        while (!temp.isEmpty()) {
            s.push(temp.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        bottom(stack, 5);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
