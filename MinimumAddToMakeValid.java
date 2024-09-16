package STACK;

import java.util.Stack;

public class MinimumAddToMakeValid {
    public static void valid(String str) {
        Stack<Character> s = new Stack<>();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                s.push(str.charAt(i));
            } else if (str.charAt(i) == ')' &&!s.isEmpty() && s.peek() == '(') {
                s.pop();
            } else {
                count++;
            }
        }
        System.out.println(s.size() + count);
    }

    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        String str = "()()()())))";
        valid(str);
    }
}
