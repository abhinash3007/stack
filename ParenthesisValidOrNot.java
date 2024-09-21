package STACK;

import java.util.Stack;

public class ParenthesisValidOrNot {
    public static void valid (String str){
        Stack<Character>s=new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if(ch=='('){
                s.push(str.charAt(i));
            }else if(str.charAt(i)==')' && s.peek()=='('){
                s.pop();
            }
        }
        if(s.isEmpty()){
            System.out.println("valid");
        }else{
            System.out.println("Invalid");
        }
    }public static void main(String[] args) {
        Stack<String>s=new Stack<>();
        String str="()()()()";
        valid(str);
    }
}
