package STACK;

public class ImplementationUsingArray {
    public static class Stack {
        int[] arr;
        int top;
        int size;

        Stack(int size) {
            arr = new int[size];
            top = -1;
            this.size = size;
        }
        public void push(int data) {
            if (size-1 == top) {
                System.out.println("Stack overflow");
                return;
            }
            top++;
            arr[top] = data;
            System.out.println(arr[top]);
        }
        public void pop(){
            if (top==-1) {
                System.out.println("Stack Underflow");
                return;
            }int last=arr[top];
            top--;
            System.out.println(last);
        } 
        public void peek(){
            if (top==-1) {
                System.out.println("Stack Underflow");
                return;
            }
            System.out.println(arr[top]);
        }
        public int size(){
            return top+1;
        }
        public boolean isEmpty(){
           return top==-1;
        }
        public boolean isFull(){
            return top==size-1;
        }
    }public static void main(String[] args) {
        Stack stack=new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.pop();
        System.out.println(stack.size());
        stack.peek();
        stack.pop();
        System.out.println(stack.size());
        stack.peek();
    }
}
