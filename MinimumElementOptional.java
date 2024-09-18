package STACK;

import java.util.Stack;

public class MinimumElementOptional {
    Stack<Integer>s=new Stack<>();
    int minElement;
    public void push(int x){
        if(s.isEmpty()){
            s.push(x);
            minElement=x;
        } if (x < minElement) {
            s.push(2 * x - minElement); // Encoding the minimum element
            minElement = x;
        } else {
            s.push(x);
        }
    }public int pop(){
        if (s.isEmpty()) {
            System.out.println("empty");
            return -1;
        }int popped=s.pop();
        if(popped<minElement){
            int prevMin = minElement;
            minElement=2*minElement-popped;
            return prevMin;
        }
            return popped;
    }public int min(){
        if (s.isEmpty()) {
            System.out.println("empty");
            return -1;
        }return minElement;
    }
    public static void main(String[]args){
        MinimumElementOptional m=new MinimumElementOptional();
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
    }
}
