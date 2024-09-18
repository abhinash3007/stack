package STACK;

import java.util.Stack;

public class MinimumElement {
    Stack<Integer> s = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void push(int x) {
        s.push(x);
        if (s2.isEmpty() ||x < s2.peek()) {
            s2.push(x);
        }
    }

    public int pop() {
        if (s.isEmpty()) {
            System.out.println("sorry");
            return -1;
        } else if (s.peek() == s2.peek()) {
            s2.pop();
        }
        return s.pop();
    }

    public int min() {
        return s2.peek();
    }
    

    public static void main(String[] args) {
        MinimumElement m = new MinimumElement();
        m.push(2);
        m.push(5);
        m.push(7);
        m.push(8);
        m.push(1);
        System.out.println(m.min());
        System.out.println(m.pop());
        System.out.println(m.min());
        System.out.println(m.pop());
        System.out.println(m.min());
        System.out.println(m.pop());
        System.out.println(m.min());
        System.out.println(m.pop());
        System.out.println(m.min());


        

    }
}
