package STACK;

public class TwoStackUsingArray {
    public static class Stack{
        int[]arr;
        int top1,top2;
        int size;
        Stack(int size){
            arr=new int[size];
            top1=-1;
            top2=size;
            this.size=size;
        }public void push1(int x){
            if(top1+1==top2){
                System.out.println("full");
                return;
            }top1++;
            arr[top1]=x;
        }public void push2(int x){
            if(top2-1==top1){
                System.out.println("full");
                return;
            }top2--;
            arr[top2]=x;
        }public void pop(){
            if (top1==-1) {
                System.out.println("empty");
                return;
            }System.out.println(arr[top1]);
            arr[top1]--;
        }public void pop2(){
            if (top2==size) {
                System.out.println("empty");
                return;
            }System.out.println(arr[top2]);
            arr[top2]++;
        }
    }public static void main(String[] args) {
        Stack s=new Stack(7);
        s.push1(1);
        s.push2(7);
        s.push1(2);
        s.push1(3);
        s.push1(4);
        s.push2(6);
        s.push2(5);
        s.pop2();
    }
}
