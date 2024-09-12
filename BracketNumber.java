package STACK;

import java.util.ArrayList;
import java.util.Stack;

public class BracketNumber {
    public static void number(String str){
        Stack<Integer>s=new Stack<>();
        ArrayList<Integer>list=new ArrayList<>();
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='(') {
                count++;
                s.push(count);
                list.add(count);
            }else if(str.charAt(i)==')'){ 
                list.add(s.peek());
                s.pop();
            }
        }System.out.println(list);
    }public static void main(String[] args) {
        String str="(aa(bdc))p(de)";
        number(str);
    }
}
